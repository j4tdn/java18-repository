package exercises;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {

		int a = Integer.parseInt(insert());
		int b = Integer.parseInt(insert());
		int c = Integer.parseInt(insert());
		checkMax(a, b, c);
		checkMin(a, b, c);
	}

	private static void checkMax(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println("Max number: " + a);
		} else if (b > a && b > c) {
			System.out.println("Max number: " + b);
		} else {
			System.out.println("Max number: " + c);
		}
	}

	private static void checkMin(int a, int b, int c) {
		if (a < b && a < c) {
			System.out.println("Min number: " + a);
		} else if (b < a && b < c) {
			System.out.println("Min number: " + b);
		} else {
			System.out.println("Min number: " + c);
		}
	}

	private static String insert() {
		int wrongTimes = 0;
		Scanner ip = new Scanner(System.in);
		String preNum = "";

		do {
			String a = wrongTimes > 0 ? "(" + wrongTimes + "): " : ": ";
			System.out.print("Enter your number" + a);
			preNum = ip.nextLine();
			if (isNumber(preNum) && Integer.parseInt(preNum) < 20) {
				break;
			}
			wrongTimes++;
			if (wrongTimes == 5) {
				System.out.println("wrongTimes = 5 ........... Exit.........");
				System.exit(0);
			}
		} while (true);
		return preNum;
	}

	private static boolean isNumber(String text) {
		if (text == "") {
			return false;
		}
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) < '0' || text.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}
}
