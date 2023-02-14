package control;

import java.time.YearMonth;
import java.util.Scanner;

/**
 * while    --> kiểm tra từ điều kiện đầu tiên
 * do while --> body (do{}) ít nhất thực hiện 1 lần 
 * 			--> bỏ qua lần kiểm tra điều kiện đầu tiên
 */

public class Ex05LoopDoWhhile {
	public static void main(String[] args) {
		// Nhập vào năm sinh   --> in ra tuổi
		// Nếu nhập thành công --> in ra tuổi       --> thoát chương trình
		// Nếu nhập thất bại   --> yêu cầu nhập lại --> quay lại bước 2
		int wrongTimes = 0;
		Scanner ip = new Scanner(System.in);

		String preYob = "";
		do {
			// Toán tử 3 ngôi
			// Số lần nhập sai
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + "):" : ": ";
			System.out.print("Please enter valid year of birth" + suffix);
			
			// Tiền xử lý phần input
			preYob = ip.nextLine();
			if (isNumber(preYob)) {
				break;
			}
			wrongTimes++;
			if (wrongTimes == 3) {
				System.out.println("Wrong times = 3 ... Exit ...");
				System.exit(0); // thoát khỏi chương trình
			}
		} while (true);

		int yob = Integer.parseInt(preYob);

		int currentYear = YearMonth.now().getYear();
		System.out.println("Current year: " + currentYear);

		System.out.println("==> Your age: " + (currentYear - yob));

	}

	private static boolean isInvalidNumber(String text) {
		return !isNumber(text);
	}

	// text: 123x789 ==> length = 7 ==> index = [0, 7)
	private static boolean isNumber(String text) {
		if (text.length() == 0) {
			return false;
		}
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (letter < '0' || letter > '9') { // number: [0, 9] => ngoài [0, 9] là invalidNumber
				return false;
			}
		}
		return true;
	}

}
