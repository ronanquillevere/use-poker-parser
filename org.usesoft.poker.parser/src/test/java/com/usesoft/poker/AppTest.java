package com.usesoft.poker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;

import junit.framework.TestCase;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

public class AppTest extends TestCase {
	
	@Test
	public void test() throws IOException {
		InputStream hand = null;
		try {
			hand = this.getClass().getResourceAsStream("hand1.txt");
			
			BufferedReader in = new BufferedReader(new InputStreamReader(hand));
			String line = null;
			int lineCount = 0;
			while((line = in.readLine()) != null) {
				lineCount++;
			}
			assertEquals(52, lineCount);
		} finally {
			hand.close();
		}
	}
}
