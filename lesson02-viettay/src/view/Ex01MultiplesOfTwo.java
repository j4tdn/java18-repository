package view;

import java.util.Scanner;

/**
 * 
 * Viết chương trình(hàm) kiểm tra số nguyên N có phải là bội của 2 hay không
 * Yêu cầu: N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N
 * không hợp lệ (tối đa 5 lần) VD: Nhập N = abc -> báo lỗi, yêu cầu nhập lại = 4
 * -> true = 6 -> true = 7 -> false
 *
 */
public class Ex01MultiplesOfTwo {
	public static void main(String[] args) {
		int wrongTimes = 0;
		Scanner ip = new Scanner(System.in);
		String s = "";
		do {
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + "):" : ":";
			System.out.print("Please enter valid N" + suffix);
			s = ip.nextLine();
//			if (isNumber(s)) {
//				break;
//			}
//			{0,} --> so luong ki tu tu 0 den n = *
			if (s.matches("[1-9][0-9]{0,}") || s.matches("[0][0-9]{1,}")) {
				break;
			}
			wrongTimes++;
			if (wrongTimes == 5) {
				System.out.println("Wrong times = 5 ... Exit ...");
				System.exit(0);
			}
		} while (true);

		int number = Integer.parseInt(s);
		String s1 = "";
		if (checkMulOf2(number)) {
			s1 = number + " is multiple of 2";
		} else {
			s1 = number + " isn't multiple of 2";
		}
		System.out.println(s1);

	}

//	private static boolean isNumber(String txt) {
//		if (txt.length() == 0) {
//			return false;
//		}
//		for (int i = 0; i < txt.length(); i++) {
//			char letter = txt.charAt(i);
//			if (letter < '0' || letter > '9') {
//				return false;
//			}
//		}
//		return true;
//	}

	private static boolean checkMulOf2(int num) {
		if (num == 0) {
			return false;
		}
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}

}
