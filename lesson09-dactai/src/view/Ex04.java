package view;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex04 {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter user name here: ");
		String userName = in.nextLine();
		System.out.print("Enter password here: ");
		String password = in.nextLine();
		
		try {
			if (isValid(userName, password)) {
				System.out.println("Sign up successfully");
			} 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	private static boolean isDuplicate(String userName, String password) {
		int counter = 0;
		String[] letters = password.split("");
		for(String i:letters) {
			if(userName.contains(i)) {
				counter++;
			}
		}
		if(counter > 3) return false;
		return true;
	}
	
	private static boolean isValid(String userName, String password) throws Exception {
		if(password.length() < 8) {
			throw new Exception("Password must contain at least 8 characters");
		}
		if (!Pattern.matches(".*[0-9].*", password)) {
			throw new Exception("Password must contain at least 1 number (1, 2, 3, ...)!!!");
		}
		if (!Pattern.matches(".*[A-Z].*", password)) {
			throw new Exception("Password must contain at least 1 upper characters!!!");
		}
		if (!Pattern.matches(".*[^a-zA-Z0-9].*", password)) {
			throw new Exception("Password must contain at least 1 special character");
		}
		if(!isDuplicate(userName, password)) {
			throw new Exception("Password must note be duplicated more than 3 characters with user name");
		}
		return true;
	}

}
