package excercises;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int wrongTimes = 0;
		String preNumber = "";

		do {
			wrongTimes++;
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + "): " : ": ";
			System.out.print("Please enter valid number" + suffix);

			preNumber = sc.nextLine();
			if (isNumber(preNumber)) {
				break;
			}

			if (wrongTimes == 5) {
				System.out.println("Over five times ===> Lock");
				System.exit(0);
			}
		} while (true);

		int number = Integer.parseInt(preNumber);
		if (isSymmetricalNumber(number)) {
			System.out.println(number + " is symmetrical number");
		} else
			System.out.println(number + " is not symmetrical number");
		sc.close();
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

	private static boolean isSymmetricalNumber(int number) {
		int num2, rev=0;
		num2 = number;
		while (number != 0) {
			int digit = number % 10;
			rev = rev * 10 + digit;
			number /= 10;
		}

		if (rev == num2) {
			return true;
		} else {
			return false;
		}
	}
}
