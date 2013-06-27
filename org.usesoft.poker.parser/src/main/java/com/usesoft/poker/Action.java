package com.usesoft.poker;

import java.util.Date;

import com.usesoft.poker.Constants.Limit;
import com.usesoft.poker.Constants.Move;
import com.usesoft.poker.Constants.Street;
import com.usesoft.poker.Constants.Style;
import com.usesoft.poker.Constants.Type;

public abstract class Action {
	
	public Action (final String handId, 
			final String playerName, 
			final Constants.Style style, 
			final Constants.Limit limit, 
			final Constants.Type type, 
			final int seat, 
			final int tableSize, 
			final Street street,
			final Constants.Move move,
			final double amount,
			final boolean button, 
			final boolean allIn, 
			final Date date
			) {
				this.tableSize = tableSize;
				this.type = type;
				this.limit = limit;
				this.style = style;
				this.playerName = playerName;
				this.handId = handId;
				this.move = move;
				this.seat = seat;
				this.isButton = button;
				this.isAllIn = allIn;
				this.street = street;
				this.date = date;
	}

	private String handId;
	private String playerName;
	private Style style;
	private Limit limit;
	private Type type;
	private int tableSize;
	private Move move;
	private int seat;
	private boolean isButton;
	private boolean isAllIn;
	private Street street;
	private Date date;
}
