package com.xsty.utils;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;

import org.junit.Before;
import org.junit.Test;

import com.xsty.utils.WordGenerator;

public class WordGeneratorTest {
	
	private WordGenerator wordGenerator;
	private String testFilePath;
	
	private final String defaultCharset = "0123456789abcdefghijklmnopqrstuvwxyz";
	

	@Before
	public void setUp() throws Exception {
		wordGenerator = new WordGenerator(defaultCharset);
		testFilePath = "F:\\data\\testword"; //Path to incremental generated dictionary.
	}

	@Test
	public void checkWordFromFileTest() {
		long i = 0;
		String word = "";
		
		try (BufferedReader br = new BufferedReader(new FileReader(testFilePath))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		    	word = wordGenerator.generate(i);
		    	assertEquals(word, line);
		    	i++;
		    }
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

}
