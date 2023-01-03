package view;

import java.util.Scanner;

public class Ex03ValidEmail {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		do {
			System.out.print("Enter email: ");
			String email = ip.nextLine();
			try {
				check(email);
				System.out.println("Email for you: " + email);
				break;
			} catch (Exception e) {
				System.out.println(">>> " + e.getMessage());
			}
		} while (true);
	}

	private static void check(String email) throws Exception {
		if (!email.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")) {
			throw new Exception("Invalid email!!!");
		}
	}
}
