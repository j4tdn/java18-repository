package view;

import java.util.Scanner;

public class Ex02ValidPassword {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		do {
			System.out.print("Enter password: ");
			String password = ip.nextLine();
			try {
				check(password);
				System.out.println("Successful account registration");
				break;
			} catch (Exception e) {
				System.out.println(">>> " + e.getMessage());
			}
		} while (true);
	}

	private static void check(String password) throws Exception {
		if (password.length() < 8) {
			throw new Exception("At least 8 characters");
		}
		if (password.length() > 256) {
			throw new Exception("At most 256 characters");
		}
		if (!password.matches(".*[a-z].*")) {
			throw new Exception("At least 1 lowercase alphabetic character");
		}
		if (!password.matches(".*[A-Z].*")) {
			throw new Exception("At least 1 uppercase alphabetic character");
		}
		if (!password.matches(".*[0-9].*")) {
			throw new Exception("At least 1 number");
		}
		if (!password.matches(".*[^a-zA-Z0-9].*")) {
			throw new Exception("At least 1 special character");
		}
	}
}
