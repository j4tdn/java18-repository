package View;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int wrongTimes = 0;
		String input = "";
		Scanner sc = new Scanner(System.in);
		do {
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + ") :" : ":";
			System.out.println("Please enter the number " + suffix);
			input = sc.nextLine();
			if (isValidNumber(input)) {
				break;
			}
			wrongTimes++;
			if (wrongTimes == 5) {
				System.out.println("Wrong time = 5...Exit...");
				System.exit(0);
			}
		} while (true);
		int checkResult = Integer.parseInt(input);
		System.out.println(checkResult + "--->" + NumberIsMultipheTwo(checkResult));
	}

	public static boolean NumberIsMultipheTwo(int input) {
		boolean checkNumber = false;
		if (input % 2 == 0) {
			checkNumber = true;
		}
		return checkNumber;
	}

	public static boolean isValidNumber(String input) {
		boolean checkIsValidNumber = true;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) < '0' || input.charAt(i) > '9') {
				checkIsValidNumber = false;
				break;
			}
		}
		return checkIsValidNumber;
	}
}
