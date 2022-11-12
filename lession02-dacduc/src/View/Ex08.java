package View;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		int i = 0;
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
		System.out.println(checkResult + "--->" + isPrime(checkResult));
	}

	public static boolean isValidNumber(String input) {
		boolean checkIsValidNumber = true;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) <= '0' || input.charAt(i) > '9') {
				checkIsValidNumber = false;
				break;
			}
		}
		return checkIsValidNumber;
	}

	public static boolean isPrime(int input) {
		boolean check = true;
		if (input == 1) {
			check = false;
		}
		for (int i = 2; i <= input / 2; i++) {
			if (input % i == 0) {
				check = false;
				break;
			}
		}
		return check;
	}
}
