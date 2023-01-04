package Ex02;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Pass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password = null;
		do {
			System.out.print("Enter your password: ");
			password = sc.nextLine();
			try {
				if (isValid(password)) {
					System.out.println("Password is valid!");
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} while (true);

	}

	private static boolean isValid(String password) throws Exception {
		if (password.length() < 8) {
			throw new Exception("Password must contain at least 8 character!!!");
		}
		if (password.length() > 256) {
			throw new Exception("Password must contain at most 256 characters!!!");
		}
		if (!Pattern.matches(".*[a-z].*", password)) {
			throw new Exception("Password must contain at least 1 lowercase aphabetic character (a,b,c,..)");
		}
		if (!Pattern.matches(".*[A-Z].*", password)) {
			throw new Exception("Password must contain at least 1 uppercase aphabetic character (A,B,C,..)");
		}
		if (!Pattern.matches(".*[0-9].*", password)) {
			throw new Exception("Password must contain at least 1 number (1, 2, 3, ...)!!!");
		}
		if (!Pattern.matches(".*[^a-zA-Z0-9].*", password)) {
			throw new Exception("Password must contain at least 1 special character ($, !, @, ...)!!!");
		}
		if (password.contains("Duyne2210")) {
			throw new Exception("Password must not contain your name!!!");
		}
		if (password.contains("@gmail.com")) {
			throw new Exception("Password must not contain your email!!!");
		}

		return true;
	}

}