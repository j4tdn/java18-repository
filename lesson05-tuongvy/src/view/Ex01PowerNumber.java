package view;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex01PowerNumber {
	public static void main(String[] args) {
		System.out.println("Power(2,8): " + isPowerOf(2, 8));
		System.out.println("Power(8,2): " + isPowerOf(8, 2));
		System.out.println("Power(3,9): " + isPowerOf(3, 9));
		System.out.println("Power(16,4): " + isPowerOf(16, 4));
		System.out.println("Power(5,64): " + isPowerOf(5, 64));
	}
	
	private static boolean isPowerOf(int a, int b) {
		
		double log = BigDecimal.valueOf(Math.log(Math.max(a, b)) / Math.log(Math.min(a, b))).setScale(6, RoundingMode.HALF_UP).doubleValue();
		return Math.ceil(log) == Math.floor(log);
		
	}

}
