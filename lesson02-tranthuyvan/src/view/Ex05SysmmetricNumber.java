package view;

import java.util.Scanner;

/**
 * Bài 5: Viết chương trình kiểu tra N có phải là số đối xứng hay không
 * Biết rằng N được nhập từ bàn phím là một số nguyên dương có tối thiểu 2 chữ số
 * VD: Nhập N = abc   → báo lỗi, yêu cầu nhập lại
 * 			  = a123  → báo lỗi, yêu cầu nhập lại
 * 			  = 1     → báo lỗi, yêu cầu nhập lại
 * 			  = 256   → false
 * 			  = 12525 → true
 * 			  = 2662  → true
 */

public class Ex05SysmmetricNumber {
	public static void main(String[] args) {
		// Input from keyboard
		Scanner sc = new Scanner(System.in);

		// Check validation for the input
		String input = "";
		do {
			System.out.print("Please enter a valid number (at least 2 digits): ");

			input = sc.nextLine();
			if (checkValidNumber(input)) {
				break;
			}
		} while (true);

		// Check whether the input number is Multiple of Two or not. And then print
		// result
		int number = Integer.parseInt(input);
		String result = isSymmetric(number) ? " --> is a symmetric number" : " --> is not a symmetric number";
		System.out.println(number + result);

	}

	// Function for checking valid number
	private static boolean checkValidNumber(String text) {
		if (text.length() <= 1) {
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

	// Function for checking whether the input number is Multiple of Two or not
	private static int reverse(int n) {
		int result = 0;
		while (n != 0) {
			int div = n % 10;
			result = result * 10 + div;
			n /= 10;
		}
		return result;
	}

	public static boolean isSymmetric(int n) {
		return n == reverse(n);
	}

}
