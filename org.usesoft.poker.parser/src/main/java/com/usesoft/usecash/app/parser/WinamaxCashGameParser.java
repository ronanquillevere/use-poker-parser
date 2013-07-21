package com.usesoft.usecash.app.parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.usesoft.usecash.domain.poker.CashAction;
import com.usesoft.usecash.domain.poker.Constants;
import com.usesoft.usecash.domain.poker.Constants.Software;
import com.usesoft.usecash.domain.poker.Hand;

public class WinamaxCashGameParser
{
   public void parseStream(List<CashAction> actions, InputStream stream) throws IOException
   {
      BufferedReader br = null;
      int analysedHandCount = 0;
      int detectedHandCount = 0;
      try
      {
         br = new BufferedReader(new InputStreamReader(stream));

         String line = null;
         boolean prevLineEmpty = false;

         ArrayList<String> handLines = new ArrayList<String>();

         LOGGER.trace("Start reading lines");
         while ((line = br.readLine()) != null)
         {
            if (line.isEmpty() && prevLineEmpty)
            {
               try
               {
                  detectedHandCount++;
                  parseHand(actions,handLines);
                  analysedHandCount++;
                  handLines.clear();
               }
               catch (Exception e)
               {
                  LOGGER.error("Could not parse hand number {}", analysedHandCount, e.getMessage());
               }
            }

            prevLineEmpty = line.isEmpty();

            if (!line.isEmpty())
               handLines.add(line);
         }

      }
      finally
      {
         LOGGER.trace("{} hands detected", detectedHandCount);
         LOGGER.trace("{} hands analysed", analysedHandCount);
         if (br != null)
            br.close();
      }

   }

   public void parseHand(List<CashAction> actions, ArrayList<String> handLines)
   {
      Hand hand = new Hand();
      if (handLines.size() == 0)
      {
         LOGGER.error("The hand contains no lines.");
         throw new RuntimeException();
      }

      int i = 0;
      parseHandInfo1(actions, hand, handLines.get(i++));
   }

   public void parseHandInfo1(List<CashAction> actions, Hand hand, String line)
   {
      String[] split = line.split(" - ");

      if (split.length != 5)
      {
         LOGGER.error("Error reading first line of hand, wrong number of elements, looking for 5, got {}", split.length);
      }

      int i = 0;

      String val = split[i++].trim();
      if (val.contains(Software.Winamax.name()))
         hand.setSoftware(Software.Winamax);
      LOGGER.trace("Setting table software : {}", val);

      val = split[i++].trim();
      hand.setGameType(Constants.GameType.valueOf(val));
      LOGGER.trace("Setting table type : {}", val);

      val = split[i++].trim();
      hand.setId(val.split("#")[1]);
      LOGGER.trace("Setting hand id : {}", val);

      val = split[i++].trim();
      if (val.contains(Constants.Variant.Holdem.name()))
         hand.setVariant(Constants.Variant.Holdem);

      if (val.contains("no limit"))
         hand.setLimit(Constants.Limit.NoLimit);

      if (val.contains("0.02€/0.05€"))
      {
         hand.setSmallBlind(0.02);
         hand.setBigBlind(0.05);
         hand.setCurrency(Constants.Currency.euro);
      }

      val = split[i++].trim();
      try
      {
         hand.setDate(parserSDF.parse(val));
      }
      catch (ParseException e)
      {
         LOGGER.error("Could not parse hand {} date {}", hand.getId(), val);
         throw new RuntimeException(e.getMessage());
      }
   }

   private final static SimpleDateFormat parserSDF = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss zzz", Locale.FRANCE);
   private static final Logger LOGGER = LoggerFactory.getLogger(WinamaxCashGameParser.class);
}
