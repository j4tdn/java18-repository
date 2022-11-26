package view;

import utils.InputUtils;

public class Ex06MaxAndMinInThreeNumbers {
	public static void main(String[] args) {
		
		int a = InputUtils.input("Enter N(N > 0)", 3);
		int b = InputUtils.input("Enter N(N > 0)", 3);
		int c = InputUtils.input("Enter N(N > 0)", 3);
		
		System.out.println("The max number is: " + findMaxNum(a, b, c));
		System.out.println("The min number is: " + findMinNum(a, b, c));
	}
	
	private static int findMaxNum(int a, int b, int c) {
		if (a >= b && a >= c) {
			return a;
		}
		if (b >= c) {
			return b;
		} else 
			return c;
	}
	
	private static int findMinNum(int a, int b, int c) {
		if (a <= b && a <= c) {
			return a;
		}
		if (b <= c) {
			return b;
		} else 
			return c;
	}
}
