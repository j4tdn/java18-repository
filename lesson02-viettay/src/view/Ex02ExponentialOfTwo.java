package view;

import java.util.Scanner;

/**
 * 
 * 	Viết chương trình(hàm) kiểm tra số nguyên N có phải là lũy thừa của 2 hay không
   	Biết rằng N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ
   	(tối đa 5 lần) hoặc khai báo biến có sẵn giá trị hợp lệ
   	VD: Nhập N = abc -> báo lỗi, yêu cầu nhập lại
			   = 4 -> true
			   = 6 -> false
			   = 8 -> true
			   = 9 -> false
 *
 */
public class Ex02ExponentialOfTwo {

	public static void main(String[] args) {
		int wrongTimes = 0;
		Scanner ip = new Scanner(System.in);
		String s = "";
		do {
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + "):" : ":";
			System.out.print("Please enter valid N" + suffix);
			s = ip.nextLine();
			if (isNumber(s)) {
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
		if (isExpOf2(number)) {
			s1 = number + " is exponential of 2";
		} else {
			s1 = number + " isn't exponential of 2";
		}
		System.out.println(s1);

	}

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

	private static boolean isExpOf2(int num) {
		if (num == 0) {
			return false;
		}
		while (num != 1) {
			if (num % 2 != 0) {
				return false;
			}
			num = num / 2;
		}
		return true;
	}

}
