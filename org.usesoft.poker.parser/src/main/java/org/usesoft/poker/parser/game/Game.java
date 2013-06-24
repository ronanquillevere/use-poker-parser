package org.usesoft.poker.parser.game;

public class Game {
	
	enum Style {
		TexasHoldem, Omaha
	}
	
	enum LimitType {
		NoLimit, Limit, PotLimit
	}
	
	enum Type {
		CashGame, Tournament
	}
	
	enum StructureType {
		SingleTable, MultiTable
	}
	
	enum Street {
		Preflop, Flop, Turn, River
	}
	
	enum Move {
		Ante, 
		SmallBlind, 
		BigBling, 
		fold,
		Check, 
		Call, 
		Bet,
		Raise,
		Collect,
		Rake
	}
}
