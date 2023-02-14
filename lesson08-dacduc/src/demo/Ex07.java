package demo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Input String : ");
			String strInput = sc.nextLine();
			try {
				if(isValidate(strInput)) {
					
				}	
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			

		} while (true);
	}

	private static boolean isValidate(String input) throws Exception {
		String regix = "[a-z]";
		if (Pattern.matches(regix, input)  && input.length() < 256) {
			return true;
		} else {
			throw new Exception("Invalid input string !");
		}
	}
	private static void maxLengthOfSubsequence(String input) {
		int j = 0;
		for (int i = 0; i < input.length(); i++) {
			
		}
	}
}
