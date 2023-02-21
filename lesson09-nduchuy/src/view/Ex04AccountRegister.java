package view;

import java.util.Scanner;

public class Ex04AccountRegister {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Enter your user name: ");
			String userName = sc.nextLine();
			System.out.print("Enter your password: ");
			String password = sc.nextLine();
			try {
				accountChecked(userName, password);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
	}

	public static void accountChecked(String userName, String passWord) throws Exception {
		String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[~!@#$%^&*]).{8,}$";
		int countErr = 0;
		if(passWord.length()<5) {
			throw new Exception(
					"Password must contain at least 8 character!!!");
		}
		if (!passWord.matches(pattern)) {
			throw new Exception(
					"Password must contain at least 1 uppercase aphabetic character, 1 number and 1 special char !!!");
		}
		for (int i = 0; i < userName.length(); i++) {
			for (int j = 0; j < passWord.length(); j++) {
				if(userName.charAt(i) == passWord.charAt(j)) {
					++countErr;
				}
			}
		}
		if(countErr > 2) {
			throw new Exception(
					"Password cannot same more than 3 characters with the account  !!!");
		}
		System.out.println("Success Login !!!");
	}
}
