package io;

import java.util.Scanner;

public class Ex01BasicDemo {
	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);

		System.out.println("Enter first name: ");
		String firstName = ip.nextLine();

		System.out.println("Enter last name: ");
		String lastName = ip.nextLine();

		System.out.println("Enter email name: ");
		String email = ip.nextLine();

		System.out.println("Enter age: ");
		int age = Integer.parseInt(ip.nextLine());

		System.out.println("Infor ==> " + firstName + ", " + lastName + ", " + email + " ");
		System.out.println("Age: " + age);
	}
}
