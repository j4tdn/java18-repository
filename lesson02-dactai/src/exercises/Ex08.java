package exercises;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		int wrongTimes = 0;
		String preInput = "";
		preInput = getInput(wrongTimes, preInput);
		int n = Integer.parseInt(preInput);
		System.out.println(n + " -> " + isPrime(n));

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

	private static boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
