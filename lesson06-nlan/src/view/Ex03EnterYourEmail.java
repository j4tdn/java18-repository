package view;

import java.util.Scanner;

import custom_exception.EmailException;
import custom_exception.EmailValidator;

public class Ex03EnterYourEmail {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String email;
		while (true) {
			try {
				System.out.println("Enter your email: ");
				email = ip.nextLine();
				EmailValidator e1 = new EmailValidator(email);
				e1.validate();
				// e = new EmailException("Invalid email")
				System.out.println("Your email is successful!");
				break;
			} catch (EmailException e) {
				System.out.println("---> " + e.getMessage());
			}
		}
	}
}
