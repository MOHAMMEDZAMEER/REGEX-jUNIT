package com.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.junit.User;

public class RegexJunit {

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
		boolean output = user.phoneNumber("hi@@gmail.com");
		assertEquals(false, output);
	}
	
	@Test
	public void passwordHappy() {
		User user = new User();
		boolean output = user.password("hi5!There");
		assertEquals(true, output);
	}
	
	@Test
	public void passwordSad() {
		User user = new User();
		boolean output = user.password("hi!!therekfjslkf");
		assertEquals(false, output);
	}
	
	@Test
	public void emailHappy() {
		User user = new User();
		boolean output = user.email("hi@gmail.com");
		assertEquals(true, output);
	}
	
	@Test
	public void emailSad() {
		User user = new User();
		boolean output = user.email("hi@@gmail.com");
		assertEquals(false, output);
	}
	
}
