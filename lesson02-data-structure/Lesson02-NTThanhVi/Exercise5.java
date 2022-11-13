package Lesson02Exercises;

import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		String num = ""; 
		int reversed = 0;
		do {
			System.out.println("Enter a valid number: ");
			
			num = ip.nextLine();
			if (isValidNumber(num)) {
				break;
			}
		} while (true);
		
		int Number = Integer.parseInt(num);
		String result = isSymmetric (Number ) ? " Is a Symmetric number" : " Is not a Symmetric number";
		System.out.println(Number + result);
		
	}
	private static boolean isValidNumber (String text) {
		if (text.length() <= 1) {
			return false;
		}
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (letter < '0' || letter > '9') {
				return false;
			}
		}
		return true;
	}
	private static int reversed (int n) {
		int result = 0;
		while (n != 0) {
			int div = n % 10;
			result = result *10 + div;
			n /= 10;
		}
		return result;
	}
	public static boolean isSymmetric (int n) {
		return n == reversed(n);
	}
}
