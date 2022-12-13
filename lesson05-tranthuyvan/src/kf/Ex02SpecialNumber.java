package kf;

import utils.InputUtils;

/**
 * Viết hàm kiểm tra một số có phải là số đặc biệt không. 
 * Biết rằng nếu tổng tất cả các số nguyên từ 1 đến n bằng S thì S là số đặc biệt. Ví dụ
 * 1 -> 1
 * 3 -> 1 + 2
 * 6 -> 1 + 2 + 3
 * 10 -> 1 + 2 + 3 + 4
 * Method signature: boolean isSpecialNumber(…)
 */

public class Ex02SpecialNumber {
	public static void main(String[] args) {
		int n = InputUtils.input("Enter n (n > 0)", 3);

		// Check whether the input number is special number or not.
		String result = isSpecialNumber(n) ? "--> is a special number" : "--> is not a special number";
		System.out.println(result);

	}

	private static boolean isSpecialNumber(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
			if (n == sum)
				return true;
		}
		return false;
	}

}
