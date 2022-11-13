package exercises02;

import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		String preA = "";
		do {
			System.out.print("Enter a: ");
			
			preA = ip.nextLine();
			if (isValidNumber(preA)) {
				break;
			}
		} while (true);
		
		String preB = ""; 
		do {
			System.out.print("Enter b: ");
			
			preB = ip.nextLine();
			if (isValidNumber(preB)) {
				break;
			}
		} while (true);
		
		String preC = "";
		do {
			System.out.print("Enter c: ");
			
			preC = ip.nextLine();
			if (isValidNumber(preC)) {
				break;
			}
		} while (true);
		int a = Integer.parseInt(preA);
		int b = Integer.parseInt(preB);
		int c = Integer.parseInt(preC);
		
		//Max
		if ( a > b && a > c) {
			System.out.println("Max number: " + a);
		} else if (b > a && b > c) {
			System.out.println("Max number: " + b);
		} else {
			System.out.println("Max number: " + c);
		}
		
		// Min
		if ( a < b && a < c) {
			System.out.println("Min number: " + a);
		} else if (b < a && b < c) {
			System.out.println("Min number: " + b);
		} else {
			System.out.println("Min number: " + c);
		}
	}
	
	private static boolean isValidNumber (String text) {
		if (text.length() == 0) {
			return false;
		}
		for (int i = 0; i < text.length();i++) {
			if (text.charAt(i)< '0' || text.charAt(i)> '9') {
				return false;
			}
		}
		return true;
	}
}
