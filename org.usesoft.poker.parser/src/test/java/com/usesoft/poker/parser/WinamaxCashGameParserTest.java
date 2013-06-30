package com.usesoft.poker.parser;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class WinamaxCashGameParserTest {
	
	@Test
	public void testParseFile() throws IOException{
		InputStream stream = this.getClass().getResourceAsStream("20130629_Delhi 05_real_holdem_no-limit.txt");
		
		
		class InnerWinamaxCashGameParser extends WinamaxCashGameParser {		
			public int count;

			@Override
			public void parseHand(ArrayList<String> handLines) {
				count++;
			}
		};
		
		InnerWinamaxCashGameParser parser = new InnerWinamaxCashGameParser();
		
		parser.parseStream(stream);
		assertThat(parser.count, is(equalTo(86)));
	}
}
