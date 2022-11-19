package control;

import java.time.YearMonth;
import java.util.Scanner;

/**
 * while --> kiểm tra từ điều kiện đầu tiên do while --> body(do{}) ít nhất thực
 * hiên 1 lần --> bỏ qua lần kiểm tra điều kiện đầu tiên
 * 
 * @author Admin
 *
 */
public class Ex05LoopDoWhile {
	public static void main(String[] args) {
		// B1: Nhập vào năm sinh
		// B2: Nếu nhập đúng(số) --> in ra tuổi --> thoát chương trình
		// B3: Nếu nhập thất bại(!số) --> yêu cầu nhập lại --> quay lại B2

//		Scanner ip = new Scanner(System.in);
//		
//		System.out.print("Enter ur YoB: ");
//		int YoB = ip.nextInt();
//		
//		int currentYear = YearMonth.now().getYear();
//		System.out.println("Current year: " + currentYear);
//		
//		System.out.println("==> Ur age: " + (currentYear - YoB));
		int wrongTimes = 1;
		Scanner ip = new Scanner(System.in);

		// System.out.print("Enter ur YoB");
		String preYoB = "";
		do {
			// Toán tử 3 ngôi
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + "):" : ":";
			// nhập lại
			System.out.print("Please enter ur YoB" + suffix);
			preYoB = ip.nextLine();
			if (isNumber(preYoB)) {
				break;
			}
			wrongTimes++;
			if (wrongTimes == 3) {
				System.out.println("Wrong times = 3 ... Exit ...");
				System.exit(0); // dừng hẳn chương trình
			}
		} while (true);

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
	// phút 1:19 trên record

	private static boolean isInValidNumber(String text) {
		return !isNumber(text);
	}

}
