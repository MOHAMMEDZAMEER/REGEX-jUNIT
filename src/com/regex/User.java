package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {


	 final String FIRST_NAME = "^[A-Z][a-z]{3,}$" ;
	 final String LastName= "^[A-Z][a-z]{2,}(\\s)?[A-Z][a-z]{2,}$";
	 
	 public void FirstName(String name){
		
		Pattern pattern = Pattern.compile(FIRST_NAME);
		Matcher match = pattern.matcher(name);
		System.out.println(match.matches());
				
		}
	
	public  void LAST_NAME (String name) {
		 Pattern pattern = Pattern.compile(LastName);
		 Matcher match = pattern.matcher(name);
		 System.out.println(match.matches());
	 }
}