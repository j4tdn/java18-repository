package view;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		do {
			try {
				System.out.print("Enter password: ");
				String password = input();
				do {
					System.out.print("Confirm password: ");
					String confirmedPassword = in.nextLine();
					if(confirmedPassword.equals(password) ) {
						System.out.println("Sign up successfully!!");
						break;
					} else {
						System.out.println("Must match the previous entry!!");
					}
				} while (true);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);

	}

	public static String input() throws Exception {
		Scanner in = new Scanner(System.in);
		String password = in.nextLine();
		do {
			if (password.length() < 8 || password.length() > 256)
				throw new Exception("Password must be at from 8 characters to 256 characters ");

			if (!password.matches(".*[a-z].*"))
				throw new Exception("Password must be at least 1 uppercase alphabetic character(a-z)");

			if (!password.matches(".*[A-Z].*"))
				throw new Exception("Password must be at least 1 lowwercase alphabetic character(A-Z)");

			if (!password.matches(".*[0-9].*"))
				throw new Exception("Password must be at least 1 number(0-9)");

			if (!password.matches(".*[^a-z0-9A-Z].*"))
				throw new Exception("Password must be at least 1 special character");
			break;
		} while (true);

		return password;
	}

}
