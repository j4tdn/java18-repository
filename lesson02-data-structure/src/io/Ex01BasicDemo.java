package io;

import java.util.Scanner;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Hãy nhập thông tin của bạn");
		System.out.print("First Name: ");
		String firstName = ip.nextLine();
		
		System.out.print("Last Name: ");
		String lastName = ip.nextLine();
		
		//Nếu 1 KDL khác String trước 1 KDL String thì khi run thì sẽ không cho nhập KDL String 
		//Fix error 
//		C1:
//			System.out.print("Age: ");
//			int age = ip.nextInt();
//			ip.nextLine();
//		C2:
			System.out.print("Age: ");
			int age = Integer.parseInt(ip.nextLine());
		
		System.out.print("Email: ");
		String email = ip.nextLine();
		
		
		System.out.println("Full Name: "+firstName+" "+lastName);
		System.out.println("Email: "+email);
		System.out.println("Age: "+age);
	}
}
