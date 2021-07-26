package com.bridzelabz.regex;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {

		String regex_for_FirstName = "^[A-Z][a-z]{0,5}";
		String regex_for_LastName = "^[A-Z][a-z]{0,5}";
		String regex_for_email = "^[a-zA-Z0-9+._-]+@[a-zA-Z0-9.]+$";
		String regex_for_mobileNumber = "^[0-9]{0,2}[0-9]{0,10}";
		String regex_for_Password = "[A-Za-z0-9@_#$%!]{8,}";

		Pattern pattern = Pattern.compile(regex_for_FirstName);
		Matcher matcher = pattern.matcher("Meghna");
		System.out.println("FirstName Valid : " + matcher.matches());

		Pattern pattern1 = Pattern.compile(regex_for_LastName);
		Matcher matcher1 = pattern.matcher("Meghna");
		System.out.println("LastName Valid : " + matcher1.matches());

		Pattern pattern2 = Pattern.compile(regex_for_email);
		Matcher matcher2 = pattern2.matcher("Meghna.borkar@gmail.com");
		System.out.println("Email Valid : " + matcher2.matches());


		Pattern pattern3 = Pattern.compile(regex_for_mobileNumber);
		Matcher matcher3  = pattern3.matcher("9158921359");
		System.out.println("Mobile number : " + matcher3.matches());
		
		Pattern pattern4 = Pattern.compile(regex_for_Password);
		Matcher matcher4  = pattern4.matcher("Meghn@2395");
		System.out.println("Password : " + matcher4.matches());
	}

}
