package view;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex02CreatePassword {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String password = null;
		do {
			System.out.println("Enter your password: ");
			password = ip.nextLine();
			try {
				isValid(password);
				System.out.println("Password successful");
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} while (true);
	}

	private static boolean isValid(String password) throws Exception {
		if (password.length() < 8) {
			throw new Exception("Password must be at least 8 character");
		}
		if (password.length() > 256) {
			throw new Exception("Password must be at most 256 characters");
		}
		if (!Pattern.matches(".*[a-z].*", password)) {
			throw new Exception("Password must be at least 1 lowercase aphabetic character (a,b,c,..)");
		}
		if (!Pattern.matches(".*[A-Z].*", password)) {
			throw new Exception("Password must be at least 1 lowercase aphabetic character (A,B,C,..)");
		}
		if (!Pattern.matches(".*[1-9].*", password)) {
			throw new Exception("Password must be at least 1 number (1, 2, 3, ..");
		}
		if (!Pattern.matches(".*[^a-zA-Z0-9].*", password)) {
			throw new Exception("Password must be at least 1 special character ");
		}
		return true;

	}
}
