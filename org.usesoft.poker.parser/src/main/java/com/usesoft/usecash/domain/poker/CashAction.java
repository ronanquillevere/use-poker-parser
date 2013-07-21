package com.usesoft.usecash.domain.poker;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import com.usesoft.usecash.domain.poker.Constants.Currency;
import com.usesoft.usecash.domain.poker.Constants.GameType;
import com.usesoft.usecash.domain.poker.Constants.Limit;
import com.usesoft.usecash.domain.poker.Constants.Move;
import com.usesoft.usecash.domain.poker.Constants.Software;
import com.usesoft.usecash.domain.poker.Constants.Street;
import com.usesoft.usecash.domain.poker.Constants.Variant;

public class CashAction
{
   public String getHandId()
   {
      return handId;
   }
   public void setHandId(String handId)
   {
      this.handId = handId;
   }
   public Player getActivePlayer()
   {
      return activePlayer;
   }
   public void setActivePlayer(Player activePlayer)
   {
      this.activePlayer = activePlayer;
   }
   public Variant getStyle()
   {
      return style;
   }
   public void setStyle(Variant style)
   {
      this.style = style;
   }
   public Limit getLimit()
   {
      return limit;
   }
   public void setLimit(Limit limit)
   {
      this.limit = limit;
   }
   public GameType getType()
   {
      return type;
   }
   public void setType(GameType type)
   {
      this.type = type;
   }
   public int getTableSize()
   {
      return tableSize;
   }
   public void setTableSize(int tableSize)
   {
      this.tableSize = tableSize;
   }
   public Move getMove()
   {
      return move;
   }
   public void setMove(Move move)
   {
      this.move = move;
   }
   public boolean isAllIn()
   {
      return isAllIn;
   }
   public void setAllIn(boolean isAllIn)
   {
      this.isAllIn = isAllIn;
   }
   public Street getStreet()
   {
      return street;
   }
   public void setStreet(Street street)
   {
      this.street = street;
   }
   public Date getDate()
   {
      return date;
   }
   public void setDate(Date date)
   {
      this.date = date;
   }
   public List<Player> getPassivePlayers()
   {
      return passivePlayers;
   }
   public void addPassivePlayer(Player player)
   {
      this.passivePlayers.add(player);
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
   public GameType getGameType()
   {
      return gameType;
   }
   public void setGameType(GameType gameType)
   {
      this.gameType = gameType;
   }
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
   public double getBigBlind()
   {
      return bigBlind;
   }
   public void setBigBlind(double bigBlind)
   {
      this.bigBlind = bigBlind;
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
   
   private String handId;
   private Player activePlayer;
   private Variant style;
   private Limit limit;
   private GameType type;
   private int tableSize;
   private Move move;
   private boolean isAllIn;
   private Street street;
   private Date date;
   private List<Player> passivePlayers = new LinkedList<Player>();
   private Software software;
   private Variant variant;
   private GameType gameType;
   private String id;
   private double smallBlind;
   private double bigBlind;
   private String tableName;
   private Currency currency;
}
