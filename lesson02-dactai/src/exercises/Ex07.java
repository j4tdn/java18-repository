package exercises;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		String preInput = "";
		preInput = getInput(preInput);
		int n = Integer.parseInt(preInput);
		System.out.println("N = " + n + " -> " + convertDecToBin(n));

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

	private static String convertDecToBin(int n) {
		String res = "";
		do {
			res = Integer.toString(n % 2) + res;
			n /= 2;
		} while (n != 0);
		return res;
	}

}
