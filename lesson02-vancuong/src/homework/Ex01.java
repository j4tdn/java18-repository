package homework;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int wrongTimes = 0;
		Scanner sc = new Scanner(System.in);

		String preNum = "";
		do {
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + "):" : ":";

			System.out.print("Please enter number" + suffix);
			preNum = sc.nextLine();
			if (isNumber(preNum)) {
				break;
			}
			wrongTimes++;
			if (wrongTimes == 5) {
				System.out.println("Wrong times = 5 ... Exit ...");
				System.exit(0);
			}
		} while (true);

		int n;
		n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
		}
	}	

	private static boolean isEnterNumber(String text) {
		return !isNumber(text);
	}

	private static boolean isNumber(String text) {
		if (text.length() == 0) {
			return false;
		}
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (letter < '0' || letter > '9') {
				return false;
			}
		}
		return true;

	}
}
