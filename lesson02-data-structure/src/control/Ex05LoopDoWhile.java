package control;

import java.time.Year;
import java.time.YearMonth;
import java.util.Scanner;

/**
 * do while ==> bỏ qua lần kiểm tra điều kiện đầu tiên while ==> kiểm tra từ
 * điều kiện đầu tiên-*
 * 
 * @author ADMIN
 *
 */

public class Ex05LoopDoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int wrongTimes = 0;
		String preYob = "";

		do {
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + ") :" : ":";
			System.out.println("Please enter value YOB" + suffix);
			preYob = sc.nextLine();
			if (isValidNumber(preYob)) {
				break;
			}
			wrongTimes++;
			if (wrongTimes == 3) {
				System.out.println("Wrong time = 3...Exit...");
				System.exit(0);
			}
		} while (true);
		int yob = Integer.parseInt(preYob);
		int currentYear = Year.now().getValue();
		System.out.println("CurrentYear: " + currentYear);
		System.out.println("Your age: " + (currentYear - yob));
	}

	public static boolean isInvalidNumber(String text) {
		return !isValidNumber(text);
	}

	public static boolean isValidNumber(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < '0' || s.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}

}
