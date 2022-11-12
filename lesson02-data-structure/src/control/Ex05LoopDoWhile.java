package control;

import java.time.YearMonth;
import java.util.Scanner;


/*
 * while   --> kiểm tra từ điều kiện đầu tiên
 * 
 * do while -->
 */
public class Ex05LoopDoWhile {
	public static void main(String[] args) {
		int wrongTimes = 0;

		Scanner ip = new Scanner(System.in);

		//System.out.println("Enter your YOB: ");

		String preYob = "";
		do {
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + "):" : ":" ;
			System.out.println("Please enter valid YOB: " + suffix);
			preYob =ip.nextLine();
			if (isNumber(preYob)) {
				break;
			}
			wrongTimes++;
			if (wrongTimes == 3) {
				System.out.println("wronTimes = 3 ....Exit...");
				System.exit(0);
			}
		} while (true);
		while (!isNumber(preYob)) {
			System.out.println("Please enter valid YOB: ");
			preYob = ip.nextLine();
		}

		int yob = Integer.parseInt(preYob);

		int currentYear = YearMonth.now().getYear();
		System.out.println("Current year: " + currentYear);
		System.out.println("Your age: " + (currentYear - yob));

	}
	private static boolean isInValidNumber(String text) {
		return !isNumber(text);
	}

	private static boolean isNumber(String text) {
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (letter < '0' || letter > '9') {
				return false;
			}
		}
		return true;
	}

}
