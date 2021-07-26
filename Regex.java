package com.bridzelabz.regex;

import java.util.regex.Matcher;

import java.util.regex.Pattern;


public class Regex {

	public static void main(String[] args) {
	      
	      String regex_for_FirstName = "^[A-Z][a-z]{0,5}";
	      
	      
	      
      Pattern pattern = Pattern.compile(regex_for_FirstName);
	  Matcher matcher = pattern.matcher("Meghna");
       System.out.println("Name Valid : "+matcher.matches());

	}

}
