package view;

import java.util.Scanner;

/**
 * Giải phương trình bậc nhất ax + b = 0 . Các hệ số nhập vào từ bàn phím. 
 * Sử dụng try - catch để bẫy các lỗi khi nhập sai kiểu dữ liệu, ví dụ nhập số nhưng nhập chữ. 
 * Bẫy lỗi chia 0, trường hợp xảy ra lỗi phải thông báo cho người dùng biết và nhập lại đến khi a b hợp lệ 
 * thì in ra kết qua x = -b/a
 */

public class Ex01FirstDegreeEquation {

	public static void main(String[] args) {
		do {
			double a = enterNumber();
			double b = enterNumber();
			try {
				System.out.println(a + " * x " + " + " + b + " = 0 --> x = " + -(divide(b, a)));
				break;
			} catch (NumberFormatException | ArithmeticException e) {
				System.out.println(e.getMessage());

			}

		} while (true);
	}

	private static double enterNumber() {
		Scanner ip = new Scanner(System.in);
		double number = 0d;
		do {
			try {
				System.out.print("Enter a valid number: ");
				number = Double.parseDouble(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("WARNING --> Please input a valid number!!!");
			}
		} while (true);

		return number;

	}

	private static double divide(double b, double a) {
		if (a == 0) {
			throw new ArithmeticException("Denominator cannot be zero!!!");
		}
		return b / a;
	}

}
