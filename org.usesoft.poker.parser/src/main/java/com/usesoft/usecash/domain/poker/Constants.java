package com.usesoft.usecash.domain.poker;

public interface Constants {

	enum Variant {
		Holdem, Omaha
	}
	
	enum Software {
		Winamax, Pokerstars 
	}
	
	enum Limit {
		NoLimit, Limit, PotLimit
	}
	
	enum GameType {
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
		euro,
		dollar
	}
	
	public static class Tournament {
		private Tournament() {
		}
		
		enum TournammentType {
			SingleTable, MultiTable
		}
	}
}
