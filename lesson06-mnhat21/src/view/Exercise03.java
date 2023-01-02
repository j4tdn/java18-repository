package view;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String email;
		while (true) {
			try {
				System.out.print("Enter email : ");
				email = ip.nextLine();
				EmailValidator ev1 = new EmailValidator(email);
				ev1.validate();
				System.out.println(ev1.getEmail());
				break;
			} catch (EmailException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}
	}
}
