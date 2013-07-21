package com.usesoft.usecash.app.parser;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import com.usesoft.usecash.app.parser.WinamaxCashGameParser;
import com.usesoft.usecash.domain.poker.CashAction;
import com.usesoft.usecash.domain.poker.Constants;
import com.usesoft.usecash.domain.poker.Hand;
import com.usesoft.usecash.domain.poker.Constants.Software;

public class WinamaxCashGameParserTest
{

   @Test
   public void testCountHands() throws IOException
   {
      InputStream stream = this.getClass().getResourceAsStream("20130629_Delhi 05_real_holdem_no-limit.txt");

      class CountHandParser extends WinamaxCashGameParser
      {
         public int count;

         @Override
         public void parseHand(List<CashAction> actions, ArrayList<String> handLines)
         {
            count++;
         }
      };

      CountHandParser parser = new CountHandParser();

      parser.parseStream(null, stream);
      assertThat(parser.count, is(equalTo(86)));
   }

   @Test
   public void testGetHandInfo() throws IOException
   {
      String line = "Winamax Poker - CashGame - HandId: #4823661-342-1372513936 - Holdem no limit (0.02€/0.05€) - 2013/06/29 13:52:16 UTC";

      ArrayList<CashAction> actions = new ArrayList<CashAction>();
      WinamaxCashGameParser parser = new WinamaxCashGameParser();
      Hand hand = new Hand();
      parser.parseHandInfo1(actions, hand, line);

      assertEquals(Software.Winamax, hand.getSoftware());
      assertEquals(Constants.GameType.CashGame, hand.getGameType());
      assertEquals("4823661-342-1372513936", hand.getId());
      assertEquals(Constants.Variant.Holdem, hand.getVariant());
      assertEquals(Constants.Limit.NoLimit, hand.getLimit());
      assertEquals(0.02, hand.getSmallBlind(), 0);
      assertEquals(0.05, hand.getBigBlind(), 0);
      assertEquals(new Date(1372513936000l), hand.getDate());
   }

}
