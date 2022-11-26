package view;

import utils.InputUtils;

public class Ex03FactorialOfANumber {
	public static void main(String[] args) {
		int num = InputUtils.input("Enter N(N > 0)", 3);
		
		System.out.println("Factorial of number is: " + Factorial(num));
	}
	
	private static long Factorial(int num) {
		int total = 1;
		for (int i = 1; i <= num; i++) {
			total = total * i;
		}
		return total;
	}
}
