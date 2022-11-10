package view;

import java.util.Scanner;

/**
 * Bài 1: Viết chương trình (hàm) kiểm tra số nguyên N có phải là bội của 2 hay không
 * Yêu cầu: N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ (tối đa 5 lần)
 * VD: Nhập N = abc → báo lỗi, yêu cầu nhập lại
 *		      = 4   → true
 *	          = 6   → true
 * 			  = 7   → false
 */

public class Ex01MultipleOfTwo {
	public static void main(String[] args) {
		// 'wrongTimes' is the number of incorrect input
		int wrongTimes = 0;

		// Input from keyboard
		Scanner sc = new Scanner(System.in);

		// Check validation for the input and display incorrect times
		String input = "";
		do {
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + ") : " : ": ";
			System.out.print("Please enter a valid number " + suffix);

			input = sc.nextLine();
			if (checkValidNumber(input)) {
				break;
			}

			wrongTimes++;
			if (wrongTimes == 5) {
				System.out.println(
						"Sorry, you entered incorrectly more than specified times! " 
						 + "\nPlease try again later!");
				System.exit(0);
			}
		} while (true);

		// Check whether the input number is Multiple of Two or not. And then print it.
		int number = Integer.parseInt(input);
		String result = isMultipleOfTwo(number) ? " is multiple of two" : " is not multiple of two";
		System.out.println(number + result);

	}

	// Function for checking valid number
	private static boolean checkValidNumber(String text) {
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

	// Function for checking whether the input number is Multiple of Two or not
	private static boolean isMultipleOfTwo(int n) {
		return n % 2 == 0;
	}

}