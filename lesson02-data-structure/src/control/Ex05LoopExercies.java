package control;

import java.time.YearMonth;
import java.util.Scanner;

public class Ex05LoopExercies {
	public static void main(String[] args) {
		// nhập vào năm sinh --> in ra tuổi của bạn
		// b2 nhập đúng --> in ra tuổi của bạn --> thoát ctrinh
		// b3 nếu nhập sai --> yêu cầu nhập lại --> quay lại bước 2

		int wrongTimes = 0;

		Scanner ip = new Scanner(System.in);
		// System.out.print("Enter you YOB: ");

		String preYob = " ";
		do {
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + "):" : ":";
			System.out.print("Please enter  valid YOB" + suffix);
			preYob = ip.nextLine();
			if (isNumber(preYob)) {
				break;
			}
			wrongTimes++;
			if (wrongTimes == 3) {
				System.out.println("wrong times =  3 ...exit...");
				System.exit(0);
			}
		} while (true);

		int yob = ip.nextInt();

		int currentYear = YearMonth.now().getYear();
		System.out.println("Current year: " + currentYear);

		System.out.println("==> yor age: " + (currentYear - yob));
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
