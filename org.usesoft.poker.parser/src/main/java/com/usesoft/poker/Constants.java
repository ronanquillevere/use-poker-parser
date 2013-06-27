package com.usesoft.poker;

public class Constants {
	
	private Constants() {
	}

	enum Style {
		TexasHoldem, Omaha
	}
	
	enum Software {
		Winamax, Pokerstars 
	}
	
	enum Limit {
		NoLimit, Limit, PotLimit
	}
	
	enum Type {
		CashGame, Tournament
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
	
	enum Currency {
		eur,
		dol
	}
	
	public static class Tournament {
		private Tournament() {
		}
		
		enum TournammentType {
			SingleTable, MultiTable
		}
	}
}
