package com.usesoft.usecash.domain.poker;

public class Player {
	public Player(String name, double bankroll, int seat, boolean button) {
		this.name = name;
		this.bankroll = bankroll;
		this.seat = seat;
		this.button = button;
	}

	private String name;
	private double bankroll;
	private int seat;
	private boolean button;
}
