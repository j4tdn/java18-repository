package view;

import java.util.Scanner;

/**
 * Bài 1: Giải phương trình bậc nhất ax + b = 0 . Các hệ số nhập vào từ bàn
 * phím. Sử dụng try - catch để bẫy các lỗi khi nhập sai kiểu dữ liệu, ví dụ
 * nhập số nhưng nhập chữ. Bẫy lỗi chia 0, trường hợp xảy ra lỗi phải thông báo
 * cho người dùng biết và nhập lại đến khi a b hợp lệ thì in ra kết qua x = -b/a
 *
 */

public class Ex01EquationOfTheFirstDegree {

	public static void main(String[] args) {
		do {
			double a = createData();
			double b = createData();
			try {
				System.out.println("x = " + cal(a, b));
				break;
			} catch (IllegalArgumentException e) {
				System.out.println(">>> " + e.getMessage());
			}
		} while (true);
	}

	private static double createData() {
		Scanner ip = new Scanner(System.in);
		double validNumber = 0d;
		while (true) {
			System.out.print("Enter valid number: ");
			try {
				validNumber = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println(">>> " + e.getMessage());
			}
		}
		return validNumber;
	}

	private static double cal(double a, double b) {
		if (a == 0) {
			throw new IllegalArgumentException("a should not be ZERO");
		}
		return -b / a;
	}
}
