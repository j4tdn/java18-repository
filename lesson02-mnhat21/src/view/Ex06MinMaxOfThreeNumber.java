package view;

import java.util.Scanner;

public class Ex06MinMaxOfThreeNumber {
	public static void main(String[] args) {

		String sa = "", sb = "", sc = "";
		int a, b, c;
		a = input(sa);
		b = input(sb);
		c = input(sc);
		System.out.println("===================");
		System.out.println("Max value --> " + maxOfThree(a, b, c));
		System.out.println("Min value --> " + minOfThree(a, b, c));

	}

	private static int minOfTwo(int a, int b) {
		return a < b ? a : b;
	}

	private static int maxOfTwo(int a, int b) {
		return a > b ? a : b;
	}

	private static int minOfThree(int a, int b, int c) {
		return minOfTwo(a, minOfTwo(b, c));
	}

	private static int maxOfThree(int a, int b, int c) {
		return maxOfTwo(a, maxOfTwo(b, c));
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

	private static int input(String sn) {
		Scanner ip = new Scanner(System.in);
		int wrongTimes = 0;
		while (isNumber(sn) == false) {
			System.out.print(wrongTimes == 0 ? "Enter number : " : "Please enter valid number : ");
			sn = ip.nextLine();
			wrongTimes++;
		}
		int n = Integer.parseInt(sn);
		return n;
	}
}
