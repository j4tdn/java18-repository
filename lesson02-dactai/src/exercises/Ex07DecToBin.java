package exercises;

import utils.InputUtils;

public class Ex07DecToBin {

	public static void main(String[] args) {
		int n = InputUtils.input("Enter N(N > 0)", 3, Integer.MAX_VALUE);
		System.out.println("N = " + n + " -> " + convertDecToBin(n));

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
