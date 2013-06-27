package com.usesoft.poker;

import com.usesoft.poker.Constants.Limit;
import com.usesoft.poker.Constants.Software;
import com.usesoft.poker.Constants.Style;
import com.usesoft.poker.Constants.Type;

public class Table {
	
	public Table(
			Constants.Software software,
			Constants.Style style,
			Constants.Limit limit,
			Constants.Type type,
			int size
			) {
				this.software = software;
				this.style = style;
				this.limit = limit;
				this.type = type;
				this.size = size;
	}

	private Software software;
	private Style style;
	private Limit limit;
	private Type type;
	private int size;
}
