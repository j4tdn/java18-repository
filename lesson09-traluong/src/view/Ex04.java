package view;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String password = null;
		do {
			System.out.println("Enter your password: ");
			password = sc.nextLine();
			try {
				if (isValidPassword(password)) {
					System.out.println("Password --> " + password);
					break;
				}
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
		} while(true);
		
		
	}
	private static boolean isValidPassword(String password) throws Exception {
	
	if (password.length() < 8) {
		throw new Exception("Password must be longer than 8");
	}
	int numberOfUppercase = 0;
	int numberOfLowercase = 0;
	for (int i = 0; i < password.length(); i++ ) {
		char c = password.charAt(i);
		if (Character.isUpperCase(c)) {
			numberOfUppercase++;
		}
		if (Character.isLowerCase(c)) {
			numberOfLowercase++;
		}
	}
	if (numberOfUppercase == 0) {
		throw new Exception("Password must contain at least 1 uppercase");
	}
	if (numberOfLowercase == 0) {
		throw new Exception("Password must contain at least 1 lowercase");
	}
	
	
		
	return true;
	}
}
