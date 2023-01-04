package Ex02EmailandPasswork;

import java.util.Objects;
import java.util.Scanner;

public class Ex03Email {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String email = null;
		while (true) {
			try {
				email = enterEmail();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
		System.out.println(email + "--> is valid!!!");

	}

	private static String enterEmail() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter email: ");
		String email = sc.nextLine();

		// @ symbol
		if (!email.contains("@")) {
			throw new Exception("Email address must contain @ symbol");
		}

		// prefix and domain
		String prefix = email.substring(0, email.lastIndexOf("@"));
		String domain = email.substring(email.lastIndexOf("@") + 1);

		Objects.requireNonNull(prefix, "Must have prefix part to create email!!!");
		Objects.requireNonNull(domain, "Must have domain part to create email!!!");

		// check for only prefix
		if (!containAllowedCharacters(prefix)) {
			throw new Exception("Prefix contains unallowed character!!!");
		}
		if (prefix.startsWith("_") || prefix.startsWith("-") || prefix.startsWith(".")) {
			throw new Exception("Prefix cannot start with unallowed character!!!");
		}
		if (prefix.endsWith("_") || prefix.endsWith("-") || prefix.endsWith(".")) {
			throw new Exception("Prefix cannot end with unallowed character!!!");
		}
		for (int i = 0; i < prefix.length(); i++) {
			if (beAllowedSpecialCharacter(prefix.charAt(i))) {

				if (beAllowedSpecialCharacter(prefix.charAt(i + 1))) {
					throw new Exception(
							"An underscore, period, or dash must be followed by one or more letter or number");
				}
			}
		}

		// // check for only domain
		if (!domain.contains("gmail.com")) {
			throw new Exception("Format for email's domain --> gmail.com");
		}

		return email;
	}

	private static boolean containAllowedCharacters(String prefix) {
		for (int index = 0; index < prefix.length(); index++) {
			if (!beAllowedCharacters(prefix.charAt(index))) {
				return false;
			}
		}
		return true;
	}

	private static boolean beAllowedCharacters(char character) {
		if (!Character.isLetterOrDigit(character) && !beAllowedSpecialCharacter(character)) {
			return false;
		}
		return true;
	}

	private static boolean beAllowedSpecialCharacter(char character) {
		if (character == '_' || character == '-' || character == '.') {
			return true;
		}
		return false;
	}

}
