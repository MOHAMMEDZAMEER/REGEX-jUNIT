package com.junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class RegexJunit {

	String input;
	boolean expectedResult;
	User user;
	
	public RegexJunit(String input, boolean expectedResult) {

		this.input = input;
		this.expectedResult = expectedResult;
	}
	
	@Before
	public void firstThing() {
		user = new User();
	}
	
	@Parameters(name="emailInputs()")
	public static Collection<Object[]> emailInputs() {
		return Arrays.asList(new Object[][] {
			{"abc@yahoo.com", true},
			{"abc-100@yahoo.com", true},
			{"abc.100@yahoo.com", true},
			{"abc111@abc.com", true},
			{"abc-100@abc.net", true},
			{"abc.100@abc.com.au", true},
			{"abc@1.com", true},
			{"abc@gmail.com.com", true},
			{"abc+100@gmail.com", true},
			{"abc", false},
			{"abc@.com.my", false},
			{"abc123@gmail.a", false},
			{"abc123@.com", false},
			{"abc123@.com.com", false},
			{".abc@abc.com", false},
			{"abc()*@gmail.com", false},
			{"abc@%*.com", false},
			{"abc..2002@gmail.com", false},
			{"abc.@gmail.com", false},
			{"abc@abc@gmail.com", false},
			{"abc@gmail.com.1a", false},
			{"abc@gmail.com.aa.au", false},
		});
	}
	
	@Test
	public void testEmail() {
		
		boolean output = user.email(input);
		assertEquals(expectedResult, output);
	}
	
	@Test
	public void firstNameHappy() {
		User user = new User();
		boolean output =user.firstName("Zameer");
		assertEquals(false,output);
	}
	@Test
	public void firstNameSad() {
		User user = new User();
		boolean output = user.firstName("Zameer");
		assertEquals(false, output);
	}
	
	@Test
	public void phoneNumberHappy() {
		User user = new User();
		boolean output = user.phoneNumber("91 1234567890");
		assertEquals(true, output);
	}
	
	@Test
	public void phoneNumberSad() {
		User user = new User();
		boolean output = user.phoneNumber("hello@@gmail.com");
		assertEquals(false, output);
	}
	
	@Test
	public void passwordHappy() {
		User user = new User();
		boolean output = user.password("hihello8!There");
		assertEquals(true, output);
	}
	
	@Test
	public void passwordSad() {
		User user = new User();
		boolean output = user.password("hi!!ghtsksnxnj");
		assertEquals(false, output);
	}
	
	@Test
	public void emailHappy() {
		User user = new User();
		boolean output = user.email("hello@gmail.com");
		assertEquals(true, output);
	}
	
	@Test
	public void emailSad() {
		User user = new User();
		boolean output = user.email("hello@@gmail.com");
		assertEquals(false, output);
	}
	
}
