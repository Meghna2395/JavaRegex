package com.bridzelabz.regex;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {

		String regex_for_FirstName = "^[A-Z][a-z]{0,5}";
		String regex_for_LastName = "^[A-Z][a-z]{0,5}";
		String regex_for_email = "^[a-zA-Z0-9+._-]+@[a-zA-Z0-9.]+$";

		Pattern pattern = Pattern.compile(regex_for_FirstName);
		Matcher matcher = pattern.matcher("Meghna");
		System.out.println("FirstName Valid : " + matcher.matches());

		Pattern pattern1 = Pattern.compile(regex_for_LastName);
		Matcher matcher1 = pattern.matcher("Meghna");
		System.out.println("LastName Valid : " + matcher1.matches());

		Pattern pattern2 = Pattern.compile(regex_for_email);
		Matcher matcher2 = pattern2.matcher("Meghna.borkar@gmail.com");
		System.out.println("Email Valid : " + matcher2.matches());
	}

}
