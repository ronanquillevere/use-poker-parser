package com.usesoft.poker.parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.usesoft.poker.Hand;
import com.usesoft.poker.Table;

public class WinamaxCashGameParser {

	public void parseHeader(Table table, Hand hand, String line) {

	}

//	public abstract void parseTableInfo();
//
//	public abstract void parseSeat();
//
//	public abstract void parseAnteStreet();
//
//	public abstract void parsePreFlopStreet();
//
//	public abstract void parseFlopStreet();
//
//	public abstract void parseTurnStreet();
//
//	public abstract void parseRiverStreet();
//
//	public abstract void parseShowDown();
//
//	public abstract void parseSummary();

	public void parseStream(InputStream stream) throws IOException {

		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(stream));

			String line = null;
			boolean prevLineEmpty = false;

			ArrayList<String> handLines = new ArrayList<String>();

			while ((line = br.readLine()) != null) {
				if (line.isEmpty() && prevLineEmpty) {
					parseHand(handLines);
					handLines.clear();
				}

				prevLineEmpty = line.isEmpty();
				
				if (!line.isEmpty())
					handLines.add(line);
			}
		} finally {
			if (br != null)
				br.close();
		}

	}

	public void parseHand(ArrayList<String> handLines) {
		
	}

}
