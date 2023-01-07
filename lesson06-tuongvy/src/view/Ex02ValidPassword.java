package view;

import java.util.Scanner;

public class Ex02ValidPassword {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.print("Enter Number: ");
				String password = sc.nextLine();
				if (input(password)) {
					System.out.println("Password is valid!");
					break;
				}
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
	}
	
	private static boolean input(String password) throws Exception {
		
			if (password.length() < 8) {
				throw new Exception("Password must contain at least 8 characters!");
			}
			if (password.length() > 256) {
				throw new Exception("Password must contain at most 256 characters!");
			}
			if (!password.matches(".*[a-z].*")) {
				throw new Exception("Password must cotain at least 1 lowercase alphabetic character (a,b,c...)");
			}
			if (!password.matches(".*[A-Z].*")) {
				throw new Exception("Password must cotain at least 1 uppercase alphabetic character (a,b,c...)");
			}
			if (!password.matches(".*[0-9].*")) {
				throw new Exception("Password must cotain at least 1 number (1,2,3...)");
			}
			if (!password.matches(".*[^a-zA-Z0-9]].*")) {
				throw new Exception("Password must cotain at least 1 special character");
			}
			return true;
		
	}

}
