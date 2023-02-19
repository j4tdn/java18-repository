package exam;

import java.util.Scanner;

public class Ex04AccountRegister {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Email : ");
		String email = ip.nextLine();
		while(true) {
			try {
				System.out.print("Password : ");
				String password = ip.nextLine();
				PasswordValidator pw = new PasswordValidator(password, email);
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
