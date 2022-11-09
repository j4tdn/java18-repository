package view;

import java.util.Scanner;

public class Ex08PrimeNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int wrongTimes = -1;
		String preCheck = "";
		do {
			wrongTimes++;
			if (wrongTimes == 5) {
				return;
			}

			System.out.print(wrongTimes > 0 ? "Please enter valid number (Wrong times -> " + wrongTimes + " ) : "
					: "Enter a number to check : ");

			preCheck = ip.nextLine();
		} while (isNumber(preCheck) == false);

		int n = Integer.parseInt(preCheck);
		if (isPrimeNumber(n)) {
			System.out.println("============= \nIs Prime Number");
		} else {
			System.out.println("============= \nIs not Prime Number");
		}
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

	private static boolean isPrimeNumber(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
