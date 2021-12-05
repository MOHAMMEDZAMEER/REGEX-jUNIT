package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {


	 final String FIRST_NAME = "^[A-Z][a-z]{3,}$" ;
	 final String LAST_NAME= "^[A-Z][a-z]{2,}(\\s)?[A-Z][a-z]{2,}$";
	 final String EMAIL = "^[a-zA-Z0-9+_-]+([.][a-zA-Z0-9+_-]+)*@[a-zA-Z0-9]+([.][a-zA-Z0-9+_-]+)+$";
	 final String PHONE = "^[0-9]{1,3}[\\s][0-9]{10}$";
	 
	 public void FirstName(String name){
		
		Pattern pattern = Pattern.compile(FIRST_NAME);
		Matcher match = pattern.matcher(name);
		System.out.println(match.matches());
				
		}
	
	public  void Lastname (String name) {
		 Pattern pattern = Pattern.compile(LAST_NAME);
		 Matcher match = pattern.matcher(name);
		 System.out.println(match.matches());
	 }
	
	public void Email(String name) {
		Pattern pattern = Pattern.compile(EMAIL);
		Matcher match = pattern.matcher(name);
		System.out.println(match.matches());
	
	}

	public void Phone(String name) {
		Pattern pattern = Pattern.compile(PHONE);
		Matcher match = pattern.matcher(name);
		System.out.println(match.matches());
	}
}