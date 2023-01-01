package view;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		String email = "";
		do {
			
			try {
				System.out.println("Enter email: ");
				email = input();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
	}
	
	public static String input() throws Exception {
		Scanner in = new Scanner(System.in);
		String email = in.nextLine();
		if(!email.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$"))
			throw new Exception("Invalid format email!!!");
		return email;
	}
}
