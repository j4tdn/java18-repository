package ExceptionEx;

import java.util.Scanner;

public class Ex02Password {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter valid password: ");
		do {
			String pass = sc.nextLine();
			try {
				passwordChecked(pass);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
	}
	public static void passwordChecked(String pass) throws Exception{
		if (pass.length() < 8) {
			throw new Exception("Password must contain at least 8 character!!!\nPlease enter again: ");
		}
		if (pass.length() > 256) {
			throw new Exception("Password must contain at most 256 characters!!!\nPlease enter again: ");
		}
		if (!pass.matches(".*[a-z].*")) {
			throw new Exception("Password must contain at least 1 lowercase aphabetic character (a,b,c,..)\nPlease enter again: ");
		}
		if (!pass.matches(".*[A-Z].*")) {
			throw new Exception("Password must contain at least 1 uppercase aphabetic character (A,B,C,..)\nPlease enter again: ");
		}
		if (!pass.matches(".*[0-9].*")) {
			throw new Exception("Password must contain at least 1 number (1, 2, 3, ...)!!!\nPlease enter again: ");
		}
		if (!pass.matches(".*[^a-zA-Z0-9].*")) {
			throw new Exception("Password must contain at least 1 special character (A, B, C, ...)!!!\nPlease enter again: ");
		}
		System.out.println("Success Login!!!");
	}
}
