package View;

import java.util.Scanner;

public class Ex05 {
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
				boolean check = (Integer.parseInt(input) >= 9) ? true : false;
				if (check) {
					break;
				}
			}
			wrongTimes++;
		} while (true);
		int inputInt = Integer.parseInt(input);
		System.out.println(input + "--->" + isSymmetricNumber(inputInt));

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

	public static boolean isSymmetricNumber(int input) {
		boolean checkIsSymmetric = false;
		int reversed = 0;
		int temp = input;
		while (temp != 0) {
			int digit = temp % 10;
			reversed = reversed * 10 + digit;
			temp /= 10;
		}
		if (reversed == input) {
			checkIsSymmetric = true;
		}
		return checkIsSymmetric;
	}
}
