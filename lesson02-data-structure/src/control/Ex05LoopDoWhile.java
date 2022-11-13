package control;

import java.time.YearMonth;
import java.util.Scanner;


/**
 * 
 * return; -> dừng hàm void system.exit() -> dưungf hẳn chương trình
 *
 */
public class Ex05LoopDoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int currentYear = YearMonth.now().getYear();
		int wrongTimes = 0;
		String preYob = "";
		do {
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + "): " : ": ";
			System.out.print("Please enter valid YOB" + suffix);
			preYob = sc.nextLine();
			if (isNumber(preYob)) {
				break;
			}
			wrongTimes++;
			if (wrongTimes == 3) {
				System.out.println("wrong time break");
				System.exit(0);
			}
		} while (true);
		
		int yob = Integer.parseInt(preYob);
		System.out.println("Your old: "+(currentYear - yob));
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
}
