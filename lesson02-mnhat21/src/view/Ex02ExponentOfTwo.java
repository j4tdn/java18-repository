package view;

import java.util.Scanner;

public class Ex02ExponentOfTwo {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int wrongTimes = -1;
		String preCheck = "";
		do {
			wrongTimes++;
			if (wrongTimes == 5) {
				return;
			}

			System.out.print(wrongTimes > 0 ? "Please enter valid number (Wrong times -> " + wrongTimes + ") : "
					: "Enter a number to check : ");

			preCheck = ip.nextLine();
		} while (isNumber(preCheck) == false);

		int n = Integer.parseInt(preCheck);
		if (isExponentOfTwo(n)) {
			System.out.println("=============== \nIs Exponent Of 2");
		} else {
			System.out.println("=============== \nIs not Exponent Of 2");
		}

	}

	private static boolean isExponentOfTwo(int n) {
		if (n == 1) {
			return true;
		}
		int run = 2;
		while (run != n) {
			run = run * 2;
			if (run > n) {
				return false;
			}
		}
		return true;
	}

	private static boolean isNumber(String input) {
		if (input == "") {
			return false;
		}
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) < '0' || input.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}
}
