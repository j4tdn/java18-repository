package view;

import java.util.Scanner;

/**
 * Bài 8: Viết chương trình (hàm) kiểm tra số nguyên N có phải là số nguyên tố hay không
 * Biết rằng N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ
 * (tối đa 5 lần) hoặc khai báo biến có sẵn giá trị hợp lệ
 * VD: Nhập N = abc → báo lỗi, yêu cầu nhập lại
 * 			  = 4   → false
 * 			  = 7   → true
 */

public class Ex08Prime {
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
		// result
		int number = Integer.parseInt(input);
		String result = isPrime(number) ? " is a prime number" : " is not a prime number";
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

	// Function for checking whether the input number is Prime or not
	private static boolean isPrime(int n) {
		// 0, 1 are not prime number.
		if (n < 2) {
			return false;
		}

		for (int i = 2; i < n - 1; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
