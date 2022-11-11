package control;

import java.time.YearMonth;
import java.util.Scanner;

/**
 * while --> kiểm tra từ điều kiện đầu tiêu
 * 
 * do while --> body(do{}) ít nhất thực hiện 1 làn --> bỏ qua lần kiểm tra điều
 * kiện đầu tiên
 * 
 * @author VIET TAY
 *
 */

public class Ex05LookDoWhile {

	public static void main(String[] args) {
		// nhập vào năm sinh
		// nếu nhập thành công --> in ra tuổi của bạn -> thoát chương trình
		// nếu nhập sai --> yêu cầu nhập lại --> quay lại b2
		int wrongTimes = 0;
		Scanner ip = new Scanner(System.in);
		String preYob = "";
		do {
			// toán tử 3 ngôi
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + "):" : ":";
			// nhập lại
			System.out.print("Please enter valid YOB" + suffix);
			preYob = ip.nextLine();
			if (isNumber(preYob)) {
				break;
			}
			wrongTimes++;
			if (wrongTimes == 3) {
				System.out.println("Wrong times = 3 ... Exit ...");
				System.exit(0); // dừng hẳn chương trình
			}
		} while (true);

		int yob = Integer.parseInt(preYob);
		int currentYaer = YearMonth.now().getYear();
		System.out.println("CurrentYaer: " + currentYaer);

		System.out.println("Your age: " + (currentYaer - yob));
	}

	private static boolean isInValidNumber(String txt) {
		return !isNumber(txt);
	}

	/*
	 * txt ="123" true txt ="123x456" false lenght(txt) = 7 index (txt) = [0,7)
	 */
	private static boolean isNumber(String txt) {
		if (txt.length() == 0) {
			return false;
		}
		for (int i = 0; i < txt.length(); i++) {
			char letter = txt.charAt(i);
			if (letter < '0' || letter > '9') {
				return false;
			}
		}
		return true;

	}
}
