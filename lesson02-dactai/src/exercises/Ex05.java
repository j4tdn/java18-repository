package exercises;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		String preInput = "";
		preInput = getInput(preInput);
		int n = Integer.parseInt(preInput);
		if (n == inversedNumber(n)) {
			System.out.println("true");
		} else
			System.out.println(" false");
	}

	private static String getInput(String preInput) {
		Scanner ip = new Scanner(System.in);
		do {
			System.out.print("Enter N: ");
			preInput = ip.nextLine();
			if (isValid(preInput)) {
				break;
			}

		} while (true);
		return preInput;
	}

	private static boolean isValid(String text) {
		if (text.length() < 2) {
			return false;
		}

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) < '0' || text.charAt(i) > '9') {
				return false;
			}

		}
		return true;
	}

	public static int inversedNumber(int n) {
		int res = 0;
		while (n > 0) {
			int k = n % 10;
			res = res * 10 + k;
			n /= 10;
		}
		return res;
	}
}
