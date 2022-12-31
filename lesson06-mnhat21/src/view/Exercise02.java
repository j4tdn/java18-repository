package view;

import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("Enter password : ");
				String password = ip.nextLine();
				PasswordValidator pw = new PasswordValidator(password);
				pw.validate();
				System.out.println("======================");
				System.out.println("Set up successfully !!");
				break;
			} catch (PasswordException e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
	}
}
