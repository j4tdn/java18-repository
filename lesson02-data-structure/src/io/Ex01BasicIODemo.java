package io;

import java.util.Scanner;

public class Ex01BasicIODemo {
	public static void main(String[] args) {
		//Enter fistname, lastname, email
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter first name: ");
		String firstname = ip.nextLine();
		
		System.out.print("Enter last name: ");
		String lastname = ip.nextLine();
		
		System.out.print("Enter age: ");
		//int age = ip.nextInt();
		int age = Integer.parseInt(ip.nextLine());
		
		System.out.print("Enter email: ");
		String email = ip.nextLine();
		
		
		System.out.println(firstname + " " +lastname + ", " + age +", " + email);
	}
}
