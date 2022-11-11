package lesson02_exercises;

import java.util.Scanner;

public class Ex03FactorialOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int wrongNumber = 0;
		String preN = "";

		do {
			String suffix = wrongNumber > 0 ? "(" + wrongNumber + "): " : ":";
			System.out.print("Enter N again" + suffix);
			preN = sc.nextLine();
			if (isNumber(preN)) {
				break;
			}
			wrongNumber++;
			if (wrongNumber == 5) {
				System.out.println("WrongNumber = 5....Exit...");
				System.exit(0);
			}
		} while (true);
		
		int N = Integer.parseInt(preN);
		int a = N;
		while (N > 1) {
			--N;
			a *= N;
		}
		System.out.println(a);
	}
	
	private static boolean isNumber(String text) {
		if (text.length() == 0) {
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

}
