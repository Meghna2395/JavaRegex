package com.bridzelabz.regex;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {

		String regex_for_FirstName = "^[A-Z][a-z]{0,5}";
		String regex_for_LastName = "^[A-Z][a-z]{0,5}";

		Pattern pattern = Pattern.compile(regex_for_FirstName);
		Matcher matcher = pattern.matcher("Meghna");
		System.out.println("FirstName Valid : " + matcher.matches());

		Pattern pattern1 = Pattern.compile(regex_for_LastName);
		Matcher matcher1 = pattern.matcher("Meghna");
		System.out.println("LastName Valid : " + matcher1.matches());
	}

}
