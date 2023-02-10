package view;

/**
 * Cho dãy các số tự nhiên được viết ra thành một dãy vô hạn trên đường thẳng:
 * 1234567891011121314 ........ (1). Hỏi số ở vị trí thứ 100 trong dãy trên là số nào ?
 */

import java.util.Scanner;

public class Ex06FindNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Input position (a number): ");
		int k = ip.nextInt();
		System.out.println("Position " + k + "th --> number " + findNumberAtPosition(k));
	}

	private static int findNumberAtPosition(int pos) {
		String number = "";
		for (int i = 1; number.length() < pos; i++) {
			number += i;
		}

		return Integer.parseInt(String.valueOf((number.charAt(pos - 1))));
	}

}
