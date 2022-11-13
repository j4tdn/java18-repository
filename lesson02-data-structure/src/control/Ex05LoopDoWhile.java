package control;

import java.time.YearMonth;
import java.util.Scanner;

/**
 * while --> kiểm tra từ điều kiện đầu tiên do while --> body (do{}) ít nhất
 * thực hiện 1 lần --> bỏ qua kiểm tra điều kiện đầu tiên
 *
 * 
 * 
 *
 */

public class Ex05LoopDoWhile {
	public static void main(String[] args) {
		int wrongTimes = 0;
		Scanner ip = new Scanner(System.in);
		String preYob = " ";
		do {
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + "):" : ":";
			System.out.println("Please enterr vaild YOB" + suffix);
			preYob = ip.nextLine();
			if (isNumber(preYob)) {
				break;
			}
			wrongTimes++;
			if (wrongTimes == 3) {
				System.out.println("wrong times = 3 .. exit ..");
				System.exit(0);
			}
		} while (true);

		int yob = ip.nextInt();

		int currentYear = YearMonth.now().getYear();

		System.out.print("Curent year: " + currentYear);
		System.out.print(" ==> Your age: " + (currentYear - yob));

	}

	private static boolean isNumber(String text) {
		if (text.length() == 0) {
			return false;

		}
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (letter < '0' || letter > '9') {

			}
		}
		return true;
	}
}
