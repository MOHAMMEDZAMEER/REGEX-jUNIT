package com.regex;

import java.util.Scanner;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.println("Enter User PassWord");

		String  name = z.nextLine();
		
		User user = new User();
		user.Password(name);
			
			z.close();
		
	}

}
