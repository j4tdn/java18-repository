package exercises;

import java.util.Random;

public class Ex04SumOfFactorial {
	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(11) + 10;
		int b = rd.nextInt(11) + 10;
		int c = rd.nextInt(11) + 10;
		int d = rd.nextInt(11) + 10;
		System.out.println("Sum of factorial: " + (factorial(a) + factorial(b) + factorial(c) + factorial(d)));

	}

	private static int factorial(int a) {
		int n = 1;
		for (int i = 1; i <= a; i++) {
			n *= i;
		}
		return n;
	}
}
