package view;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex01PowerNumber {
	public static void main(String[] args) {
		System.out.println("power(2, 8): " + isPowerOf(2, 8));
		System.out.println("power(8, 2): " + isPowerOf(8, 2));
		
		System.out.println("power(3, 9): " + isPowerOf(3, 9));
		System.out.println("power(9, 3): " + isPowerOf(9, 3));
	}
	
//	private static boolean isPower(int a, int b) {
//		return a > b ? isPowerOf(b, a) : isPower(a, b);
//	}
	
	private static boolean isPowerOf(int a, int b) {
		double log = BigDecimal.valueOf(Math.log(Math.max(a, b)) / Math.log(Math.min(a, b)))
				.setScale(6, RoundingMode.HALF_UP)
				.doubleValue();
		return Math.ceil(log) == Math.floor(log);
	}
}
