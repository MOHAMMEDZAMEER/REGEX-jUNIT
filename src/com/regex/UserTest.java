package com.regex;

import java.util.Scanner;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.println("Plese Enter Valid FirstName With First Latter Caps ");

		String  name = z.nextLine();
		
		User LastName = new User();
		LastName.LAST_NAME(name);
			
			z.close();
		
	}

}
