package io;

import java.util.Scanner;

public class Ex01BasicIoDemo {
	public static void main(String[] args) {
		// Enter firstName, lastName, email
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter first name : ");
		String firstName = ip.nextLine();
		
		System.out.print("Enter last name : ");
		String lastName = ip.nextLine();
		
		// xu li thua bo nho dem
		System.out.print("Enter age : ");
		// int age = ip.nextInt();
		// ip.nextLine(); // Save enter to fly
		int age = Integer.parseInt(ip.nextLine());
		
		System.out.print("Enter email : ");
		String email = ip.nextLine();
		
		System.out.println(firstName + " " + lastName + ", " + email);
		System.out.println("Age : " + age);
	}
}
