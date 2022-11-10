package view;

import java.util.Scanner;

/**
 * Bài 6: Viết chương trình tìm số nguyên lớn, nhỏ nhất trong 3 chữ số a,b,c
 * Biết rằng a,b,c là số nguyên được nhập từ bàn phím và nhỏ hơn 20 [0, 20)
 * VD: Nhập a = 6
 * 	   Nhập b = “xyz” → báo lỗi, yêu cầu nhập lại
 * 	   Nhập b = 12
 * 	   Nhập c = 8
 * Số lớn nhất là 12
 * Số nhỏ nhất là 6
 */

public class Ex06GreatestLowestNumber {
	public static void main(String[] args) {
		// Input from keyboard
		Scanner sc = new Scanner(System.in);

		// Check validation for the input (a, b, c)
		String inputA = "";
		do {
			System.out.print("Enter a: ");

			inputA = sc.nextLine();
			if (checkValidNumber(inputA) && range(inputA)) {
				break;
			}
		} while (true);

		String inputB = "";
		do {
			System.out.print("Enter b: ");

			inputB = sc.nextLine();
			if (checkValidNumber(inputB) && range(inputB)) {
				break;
			}
		} while (true);

		String inputC = "";
		do {
			System.out.print("Enter c: ");

			inputC = sc.nextLine();
			if (checkValidNumber(inputC) && range(inputC)) {
				break;
			}
		} while (true);

		// Convert to integer number
		int a = Integer.parseInt(inputA);
		int b = Integer.parseInt(inputB);
		int c = Integer.parseInt(inputC);
		
		// Find out the greatest and lowest number
		// Max value
		if (a >= b && a >= c) {
			System.out.println(a + " is the greatest number");
		} else if (b >= c && b >= a) {
			System.out.println(b + " is the greatest number");
		} else {
			System.out.println(c + " is the greatest number");
		}

		// Minimum value
		if (a <= b && a <= c) {
			System.out.println(a + " is the lowest number");
		} else if (b <= c && b <= a) {
			System.out.println(b + " is the lowest number");
		} else {
			System.out.println(c + " is the lowest number");
		}

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

	// Function for checking range --> [0, 20)
	private static boolean range(String input) {
		if (Integer.valueOf(input) >= 20) {
			return false;
		}
		return true;
	}

}
