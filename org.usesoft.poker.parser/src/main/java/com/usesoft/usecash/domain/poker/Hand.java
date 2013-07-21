package com.usesoft.usecash.domain.poker;

import java.util.Date;
import java.util.List;

import com.usesoft.usecash.domain.poker.Constants.Currency;
import com.usesoft.usecash.domain.poker.Constants.GameType;
import com.usesoft.usecash.domain.poker.Constants.Limit;
import com.usesoft.usecash.domain.poker.Constants.Software;
import com.usesoft.usecash.domain.poker.Constants.Variant;

public class Hand
{
   public String getId()
   {
      return id;
   }

   public void setId(String id)
   {
      this.id = id;
   }

   public double getSmallBlind()
   {
      return smallBlind;
   }

   public void setSmallBlind(double smallBlind)
   {
      this.smallBlind = smallBlind;
   }

   public Date getDate()
   {
      return date;
   }

   public void setDate(Date date)
   {
      this.date = date;
   }

   public List<Player> getPlayers()
   {
      return players;
   }

   public void setPlayers(List<Player> players)
   {
      this.players = players;
   }

   public double getBigBlind()
   {
      return bigBlind;
   }

   public void setBigBlind(double bigBlind)
   {
      this.bigBlind = bigBlind;
   }

   public Software getSoftware()
   {
      return software;
   }

   public void setSoftware(Software software)
   {
      this.software = software;
   }

   public Variant getVariant()
   {
      return variant;
   }

   public void setVariant(Variant variant)
   {
      this.variant = variant;
   }

   public Limit getLimit()
   {
      return limit;
   }

   public void setLimit(Limit limit)
   {
      this.limit = limit;
   }

   public GameType getGameType()
   {
      return gameType;
   }

   public void setGameType(GameType gameType)
   {
      this.gameType = gameType;
   }

   public int getTableSize()
   {
      return tableSize;
   }

   public void setTableSize(int size)
   {
      this.tableSize = size;
   }

   public Currency getCurrency()
   {
      return currency;
   }

   public void setCurrency(Currency currency)
   {
      this.currency = currency;
   }

   public String getTableName()
   {
      return tableName;
   }

   public void setTableName(String tableName)
   {
      this.tableName = tableName;
   }

   private Software software;
   private Variant variant;
   private Limit limit;
   private GameType gameType;
   private int tableSize;
   private String id;
   private double smallBlind;
   private Date date;
   private List<Player> players;
   private double bigBlind;
   private Currency currency;
   private String tableName;
}
