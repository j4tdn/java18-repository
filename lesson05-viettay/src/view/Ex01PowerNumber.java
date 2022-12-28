package view;

/**
 * 	Bài 1: Viết hàm kiểm tra một số có phải là lũy thừa của một số khác không
 	VD: (8, 2)(true), (2, 8)(true), (6, 2)(false), (20, 4)(false), (64, 4)(true)
 */

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex01PowerNumber {
	public static void main(String[] args) {
		System.out.println("power(2,8): " + isPowerOf(2, 8));
		System.out.println("power(8,2): " + isPowerOf(8, 2));
		System.out.println("power(3,9): " + isPowerOf(3, 9));
		System.out.println("power(3,8): " + isPowerOf(3, 8));
		System.out.println("power(16,4): " + isPowerOf(16, 4));
	}
	/*
	 * a^n(nguyên) = b <--> log a ^ n = log b <--> n.log a = log b <--> n = log b/log a
	 */
	private static boolean isPowerOf(int a, int b) {
		double log = BigDecimal.valueOf(Math.log(Math.max(a, b)) / Math.log(Math.min(a, b)))
				.setScale(6, RoundingMode.HALF_UP).doubleValue();
		// lấy 6 chử số phần thập phân và chuyển sang double để truyền vào biến phía dưới
		return Math.ceil(log) == Math.floor(log);
	}
}
