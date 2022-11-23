package view;

import java.util.Scanner;

public class Ex01MultiplesOfTwo {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int wrongTimes = -1;
		String preCheck = "";
		do {
			/**
			 * 
			 * if (text.matches("[1-9][0-9]*"){
			 * 	break;
			 * }
			 * 
			 */
			wrongTimes++;
			if (wrongTimes == 5) {
				return;
			}

			System.out.print(wrongTimes > 0 ? "Please enter valid number (Wrong times -> " + wrongTimes + " ) : "
					: "Enter a number to check : ");

			preCheck = ip.nextLine();
		} while (isNumber(preCheck) == false);

		int n = Integer.parseInt(preCheck);
		if (n % 2 == 0) {
			System.out.println("=================== \nIs multiples of 2");
		} else {
			System.out.println("===================== \nIs not multiples of 2");
		}
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

}
