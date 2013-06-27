package com.usesoft.poker;

public class CashAction extends Action {
	public CashAction(
			final String handId, 
			final String playerName, 
			final double amount, 
			final Constants.Style style, 
			final Constants.Limit limit, 
			final Constants.Type type, 
			final int tableSize, 
			final Constants.Move move,
			final int seat,
			final boolean isButton,
			final boolean isAllIn,
			final double smallBlind,
			final double bigBlind
			) {
		
		super(handId, playerName, style, limit, type, seat, tableSize, null, move, amount, isButton, isAllIn, null);
		this.smallBlind = smallBlind;
		this.bigBlind = bigBlind;
	}

	private double smallBlind;
	private double bigBlind;
}
