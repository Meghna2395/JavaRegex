package com.bridzelabz;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserValidationTest {

	private UserValidation userValidation;

	public void setup() {
		userValidation = new UserValidation();
	}

	@Test
	public void testFirstName() {
		assertEquals(true, userValidation.validateFirstName("Megh"));
	}

	@Test(expected = NullPointerException.class)
	public void testFirstNameNegativeScenario() {

		assertEquals(true, userValidation.validateFirstName(null));
	}

	@Test
	public void testLastName() {
		assertEquals(true, userValidation.validateLastName("b"));
	}

	@Test(expected = NullPointerException.class)
	public void testLastNameNegativeScenario() {

		assertEquals(true, userValidation.validateLastName(null));
	}

	@Test
	public void testEmail() {
		assertEquals(true, userValidation.validateEmail("meghnaborkar@gmail.com"));
	}

	@Test(expected = NullPointerException.class)
	public void testEmailNegativeScenario() {
		assertEquals(true, userValidation.validateEmail(null));
	}

	@Test
	public void testMobileNumber() {
		assertEquals(true, userValidation.validateMobileNumber("91 9158921359"));
	}

	@Test(expected = NullPointerException.class)
	public void testMobileNumberNegativeScenario() {
		assertEquals(true, userValidation.validateMobileNumber(null));
	}

	@Test
	public void testPassword() {
		assertEquals(true, userValidation.validatePassword("Meghn@2395"));
	}

	@Test(expected = NullPointerException.class)
	public void testPasswordNegativeScenario() {
		assertEquals(true, userValidation.validatePassword(null));
	}

}
