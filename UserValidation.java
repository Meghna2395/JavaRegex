package com.bridzelabz;

import java.util.regex.Pattern;

public class UserValidation {

	private final String regex_FirstName = "[A-Z{1}[a-z]{0,6}";
	private final String regex_LastName = "[a-zA-Z]{4}";
	private final String regex_Email = "[a-zA-Z]{4}";
	private final String regex_MobileNumber = "^[0-9+ ]{0,3}[0-9]{0,10}";
	private final String regex_Password = "[A-Za-z0-9@_#$%!]{8,}";

	public boolean validateFirstName(String firstName) {

		return Pattern.matches(regex_FirstName, firstName);

	}

	public boolean validateLastName(String lastName) {
		return Pattern.matches(regex_LastName, lastName);

	}
	
	public boolean validateEmail(String email) {
		return Pattern.matches(regex_Email, email);
	}

	public boolean validateMobileNumber(String number) {
		return Pattern.matches(regex_MobileNumber, number);
	}

	public boolean validatePassword(String password) {
		return Pattern.matches(regex_Password, password);
	}

}