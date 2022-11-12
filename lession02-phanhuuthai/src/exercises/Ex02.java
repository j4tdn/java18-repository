package exercises;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int wrongTimes = 0;
		Scanner ip = new Scanner(System.in);
		String preNum = "";

		do {
			String a = wrongTimes > 0 ? "(" + wrongTimes + "): " : ": ";
			System.out.print("Enter your number" + a);
			preNum = ip.nextLine();
			if (isNumber(preNum)) {
				break;
			}
			wrongTimes++;
			if (wrongTimes == 5) {
				System.out.println("wrongTimes = 5 ........... Exit.........");
				System.exit(0);
			}
		} while (true);

		int N = Integer.parseInt(preNum);
		if (isPowerOf2(N)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	private static boolean isPowerOf2(int num) {
		if (num == 0 || num == 1) {
			return true;
		}

		int x = num / 2;
		int y = num % 2;
		if (y == 1) {
			return false;
		}
		return isPowerOf2(x);
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
