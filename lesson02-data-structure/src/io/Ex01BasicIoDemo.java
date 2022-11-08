package io;

import java.util.Scanner;

public class Ex01BasicIoDemo {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter first name: ");
		String firstName = ip.nextLine();
		
		System.out.print("Enter last name: ");
		String lastName = ip.nextLine();
		
		System.out.print("Enter email: ");
		String email = ip.nextLine();
		
		System.out.print("Enter age: ");
		int age = Integer.parseInt(ip.nextLine());
		
		System.out.println(firstName+ "-" + lastName + "-" + email);
	}

}
