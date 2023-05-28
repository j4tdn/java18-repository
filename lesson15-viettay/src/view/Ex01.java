package view;

/**
Bài 1: Viết chương trình nhập vào 1 số thực có phần thập phân khác 0. Yêu cầu nhập lại
nếu nhập sai. Nếu số lần nhập sai vượt quá 3 lần  thông báo lỗi và kết thúc chương
trình
Nếu nhập đúng yêu cầu  tìm phân số tối giản của số thập phân đó. 
Ví dụ
		0.1  1/10
		0.2  1/10
		0.04  1/25
		0.75  2/3
		1.5  3/2
 */
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int count = 0;
		double number;
		do {
			System.out.print("Nhập số thực có phần thập phân khác 0: ");
			number = ip.nextDouble();
			count++;
			if (check(number)) {
				result(number);
				break;
			} else {
				System.out.println("Số thực không hợp lệ!");
			}
			if (count > 3) {
				System.out.println("Vượt quá số lần nhập sai cho phép.");
				return;
			}
		} while (true);
	}

	public static boolean check(double number) {
		return number != (int) number;
	}

	public static void result(double number) {
		int numerator = (int) (number * 100);
		int denominator = 100;
		int gcd = getGCD(numerator, denominator);
		numerator /= gcd;
		denominator /= gcd;
		System.out.println("Phân số tối giản của số thập phân là: " + numerator + "/" + denominator);
	}

	public static int getGCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}

