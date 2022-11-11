package lesson02_exercises;

import java.util.Scanner;

public class Ex08PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(check());

		for (int i = 2; i < N - 1; i++) {
			if (N % i == 0) {
				System.out.println(N + "--> false");
				break;
			} else {
				System.out.println(N + "--> true");
				break;
			}

		}

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

	private static String check() {
		int wrongNumber = 0;
		String preN = "";
		Scanner sc = new Scanner(System.in);

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

		return preN;
	}

}
