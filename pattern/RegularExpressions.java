package com.planet.patterns;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegularExpressions {

	/**
	 * @param args
	 */
	public static void main(String... args) {
		// Case sensitive
		Pattern pat = Pattern.compile("Data");
		Matcher mat = pat.matcher("data");
		boolean found = mat.matches();
		System.out.println("Testing Data vs. Data: " + found);
		
		mat = pat.matcher("Data");
		found = mat.matches();
		System.out.println("Testing Data vs. Data 10: " + found);
		
		// Subsequences
		pat = Pattern.compile("data");
		mat = pat.matcher("data 5 4 3 2 1 data");
		
		while (mat.find()) {
			System.out.println("data found at index " + mat.start());
		}
		
		// Using wildcards and quantifiers
		pat = Pattern.compile("H+");
		mat = pat.matcher("H HH HHH");
		
		while (mat.find()) {
			System.out.println("Match1: " + mat.group());
		}
		
		pat = Pattern.compile("r.+g");
		mat = pat.matcher("rolling hub ring fly");
		
		while (mat.find()) {
			System.out.println("Match2: " + mat.group());
		}
		
		pat = Pattern.compile("r.+?g");
		mat = pat.matcher("rolling hub ring fly");
		
		while (mat.find()) {
			System.out.println("Match3: " + mat.group());
		}
		
		// Classes of characters
		pat = Pattern.compile("[a-z]+");
		mat = pat.matcher("read more play less.");
		
		while (mat.find()) {
			System.out.println("Match4: " + mat.group());
		}
		
		// Using replace all
		String str = "Jeb Jebra Bob Mac Grant";
		pat = Pattern.compile("Jeb.*? ");
		mat = pat.matcher(str);
		System.out.println("Original sequence: " + str);
		
		str = mat.replaceAll("Jeb ");
		System.out.println("Modified sequence: " + str);
		
		// Using split
		pat = Pattern.compile("[ ,.-]");
		String[] strs = pat.split("alpha omega,beta5 10-over.big");
		
		for (int i = 0; i < strs.length; i++) {
			System.out.println("Next token: " + strs[i]);
		}
	}
}
