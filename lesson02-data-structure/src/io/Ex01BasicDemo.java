package io;

import java.util.Scanner;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		// nhập vào Enter firstname, lastname, email
		Scanner ip = new Scanner(System.in); 
		
		System.out.println("Enter first name: ");
		String firstName = ip.nextLine();
		
		System.out.println("Enter last name: ");
		String lastName = ip.nextLine();
		
		System.out.println("Enter age: ");
		// int age = ip.nextInt();
		// ip.nextLine(); save enter to fly
		int age = Integer.parseInt(ip.nextLine());
		
		System.out.println("Enter email: ");
		String email = ip.nextLine();

		
		System.out.println("Infor ==> " + firstName + " " + lastName + "," + email);
		System.out.println("Age: " + age);
		
		// nextLine()[String]  --> input nothing --enter-- value=""
		// cùng KDL String thì sẽ không có gì
		// khác KDL String thì nó sẽ không lưu giá trị Enter (String) 
		// Cách thông dụng để in: int age = Integer.parseInt(ip.nextLine()); 
	
	}
}
