package view;

/**
 * Viết hàm kiểm tra một số có phải là lũy thừa của một số khác không
 * VD: (8, 2)(true), (2, 8)(true), (6, 2)(false), (20, 4)(false), (64, 4)(true)
 * Method signature: boolean isPowerOf(int a, int b)
 */

import static java.lang.Math.*;

public class Ex01IsPowerOf {
	public static void main(String[] args) {
		int a = 8;
		int b = 2;
		System.out.println("This number is power of that number --> " + isPowerOf(a, b));
	}

	private static boolean isPowerOf(int a, int b) {
		double base = a > b ? log(a) / log(b) : log(b) / log(a);
		return ceil(base) == floor(base);
	}

}
