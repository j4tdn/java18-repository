package view;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		int wrongTimes = 0;
		Scanner ip = new Scanner(System.in);

		String text = "";

		do {
			String suffix = wrongTimes > 0 ? "( wrong times: " + wrongTimes + ")" : ":";
			System.out.println("Enter N (N>0)" + suffix);
			text = ip.nextLine();
			if (text.matches("[1-9][0-9]{0,}") || text.matches("[0][0-9]{1,}")) {
				break;
			}

			wrongTimes++;
			if (wrongTimes == 5) {
				System.out.println("wrong times = 5 => exit");
				System.exit(0);
			}
		} while (true);

		// kiem tra
		int N = Integer.parseInt(text);

		if (N % 2 == 0) {
			System.out.println(N + " is an even number !");
		} else {
			System.out.println(N + " is an odd number !");
		}
	}

	private static boolean ValidNumber(String text) {
		return !isNumber(text);
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
