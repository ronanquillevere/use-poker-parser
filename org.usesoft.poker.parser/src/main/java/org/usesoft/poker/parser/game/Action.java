package org.usesoft.poker.parser.game;

import org.usesoft.poker.parser.game.Game.LimitType;
import org.usesoft.poker.parser.game.Game.Move;
import org.usesoft.poker.parser.game.Game.Style;
import org.usesoft.poker.parser.game.Game.StructureType;
import org.usesoft.poker.parser.game.Game.Type;

public class Action {
	
	public Action (final String handId, 
			final String playerName, 
			final double amount, 
			final Game.Style style, 
			final Game.LimitType limit, 
			final Game.Type type, 
			final int tableSize, 
			final Game.StructureType tournamentType,
			final Game.Move move,
			final int seat,
			final boolean isButton,
			final boolean isAllIn,
			final double tableFee,
			final double tableRake) {
				this.tableSize = tableSize;
				this.type = type;
				this.limit = limit;
				this.style = style;
				this.playerName = playerName;
				this.handId = handId;
				this.tournamentType = tournamentType;
				this.move = move;
				this.seat = seat;
				this.isButton = isButton;
				this.isAllIn = isAllIn;
				this.tableFee = tableFee;
				this.tableRake = tableRake;
	}

	private String handId;
	private String playerName;
	private Style style;
	private LimitType limit;
	private Type type;
	private int tableSize;
	private StructureType tournamentType;
	private Move move;
	private int seat;
	private boolean isButton;
	private boolean isAllIn;
	private double tableFee;
	private double tableRake;
}
