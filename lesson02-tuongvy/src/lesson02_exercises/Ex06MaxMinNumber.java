package lesson02_exercises;

import java.util.Scanner;

public class Ex06MaxMinNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = Integer.parseInt(check());
		System.out.println("Enter b: ");
		int b = Integer.parseInt(check());
		System.out.println("Enter c: ");
		int c = Integer.parseInt(check());

		System.out.println("Max Number: " + checkMax(a, b, c));
		System.out.println("Min Number: " + checkMin(a, b, c));

	}

	private static boolean isNumber(String text) {
		if (text.length() == 0 || text.length() > 2) {
			return false;
		}

		if (text.length() == 1) {
			
			if (text.charAt(0) < '0' || text.charAt(0) > '9') {
				return false;
			}
			return true;
		}
		
		if (text.length() == 2) {
			
			if (text.charAt(0) != '1') {
				return false;
			}
			
			if (text.charAt(1) < '0' || text.charAt(1) > '9') {
				return false;
			}
			return true;
		}

		return true;

	}

	private static String check() {
		int wrongNumber = 0;
		String preN = "";
		Scanner sc = new Scanner(System.in);

		do {
			String suffix = wrongNumber > 0 ? "(" + wrongNumber + "): " : ":";
			System.out.print("Enter Number again" + suffix);
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
		return preN;
	}

	private static int checkMax(int a, int b, int c) {
		int max = a;
		if (b >= max) {
			max = b;
		}
		if (c >= max) {
			max = c;
		}
		return max;

	}

	private static int checkMin(int a, int b, int c) {
		int min = a;
		if (b <= min) {
			min = b;
		}
		if (c <= min) {
			min = c;
		}
		return min;

	}

}
