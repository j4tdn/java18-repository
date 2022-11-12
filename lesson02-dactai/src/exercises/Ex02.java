package exercises;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		int wrongTimes = 0;
		String preInput = "";
		preInput = getInput(wrongTimes, preInput);
		int n = Integer.parseInt(preInput);
		if (checkExponent(n)) {
			System.out.println("true");
		} else
			System.out.println("false");
	}

	private static String getInput(int wrongTimes, String preInput) {
		Scanner ip = new Scanner(System.in);
		do {
			String suffix = wrongTimes > 0 ? "(" + (int) (wrongTimes + 1) + "): " : ":";
			System.out.print("Enter N" + suffix);
			preInput = ip.nextLine();
			if (isValid(preInput)) {
				break;
			}

			wrongTimes++;
			if (wrongTimes == 5) {
				System.out.println("Wrong times = 5...Exit...");
				System.exit(0);
			}
		} while (true);
		return preInput;
	}

	private static boolean isValid(String text) {
		if (text.length() == 0) {
			return false;
		}

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) < '0' || text.charAt(i) > '9') {
				return false;
			}

		}
		return true;
	}

	private static boolean checkExponent(int n) {
		int remainder = 0;

		do {
			remainder = n % 2;
			n = n / 2;
			if (remainder == 1) {
				return false;
			}
		} while (n > 2);

		return true;
	}

}