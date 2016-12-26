package com.xsty.utils;


public class Main {

	public static void main(String[] args) {
		System.out.println("== Alpha-Numeric Charset ==");
		alphanumericCharset();
		System.out.println();
		
		System.out.println("== Simple Charset ==");
		simpleCharset();
	}
	
	private static void alphanumericCharset(){
		String charset = "0123456789abcdefghijklmnopqrstuvwxyz";
		WordGenerator wordGenerator = new WordGenerator(charset);
		
		String word = "";
		
		word = wordGenerator.generate(0);
		System.out.println(word);
		
		word = wordGenerator.generate(35);
		System.out.println(word);
		
		word = wordGenerator.generate(36);
		System.out.println(word);
		
		word = wordGenerator.generate(1331);
		System.out.println(word);
		
		word = wordGenerator.generate(1332);
		System.out.println(word);
		
		word = wordGenerator.generate(47987);
		System.out.println(word);
		
		word = wordGenerator.generate(47988);
		System.out.println(word);
		
		word = wordGenerator.generate(1727603);
		System.out.println(word);
		
		word = wordGenerator.generate(1727604);
		System.out.println(word);
		
		word = wordGenerator.generate(62193779);
		System.out.println(word);
		
		word = wordGenerator.generate(62193780);
		System.out.println(word);
		
		word = wordGenerator.generate(2238976115L);
		System.out.println(word);
		
		word = wordGenerator.generate(2238976116L);
		System.out.println(word);
		
		word = wordGenerator.generate(80603140211L);
		System.out.println(word);
	}
	
	private static void simpleCharset(){
		String charset = "a";
		WordGenerator wordGenerator = new WordGenerator(charset);
		
		String word = "";
		
		word = wordGenerator.generate(0);
		System.out.println(word);
		
		word = wordGenerator.generate(1);
		System.out.println(word);
		
		word = wordGenerator.generate(2);
		System.out.println(word);
		
		word = wordGenerator.generate(3);
		System.out.println(word);
		
		word = wordGenerator.generate(4);
		System.out.println(word);
		
		word = wordGenerator.generate(5);
		System.out.println(word);
		
		word = wordGenerator.generate(6);
		System.out.println(word);
		
		word = wordGenerator.generate(7);
		System.out.println(word);
		
		word = wordGenerator.generate(8);
		System.out.println(word);
	}

}
