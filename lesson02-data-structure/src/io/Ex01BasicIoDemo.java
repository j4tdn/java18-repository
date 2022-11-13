package io;

import java.util.Scanner;

// jar: java runtime --> standalone running
// java.base(project) --> jar
//   ..java.util(package)
//       ..Scanner(class)

public class Ex01BasicIoDemo {
	public static void main(String[] args) {
		// Enter firstName, lastName, email
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter first name: ");
		String firstName = ip.nextLine();
		
		System.out.print("Enter last name: ");
		String lastName = ip.nextLine();
		
		System.out.print("Enter age: ");
		// int age = ip.nextInt();
		// ip.nextLine(); save enter to fly
		int age = Integer.parseInt(ip.nextLine());
		
		System.out.print("Enter email: ");
		String email = ip.nextLine();
		
		System.out.println("Infor ==> " + firstName + " " + lastName + ", " + email);
		System.out.println("Age: " + age);
		
		// nextLine()[String]  --> input nothing --enter-- value=""
		// !nextLine()[String] --> require input value ==> finish statement
	}
}
