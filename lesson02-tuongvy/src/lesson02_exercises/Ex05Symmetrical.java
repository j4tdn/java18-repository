package lesson02_exercises;

import java.util.Scanner;

public class Ex05Symmetrical {
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

		System.out.println(checkSymmetrical(N));

	}

	private static boolean isNumber(String text) {
		if (text.length() < 2) {
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

	private static int reverseNumber(int N) {
		int temp = 0, n;
		while (N != 0) {
			n = N % 10;
			N = N / 10;
			temp = (temp * 10) + n;

		}
		return temp;
	}

	private static boolean checkSymmetrical(int N) {
		if (N == reverseNumber(N)) {
			return true;
		} else {
			return false;
		}

	}

}
