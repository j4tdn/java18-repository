package view;

import java.util.Random;

public class Ex04SumOfFactorial {
	private static Random rd = new Random();
	public static void main(String[] args) {
//		Random rd = new Random();
		long sum;
		int r1 = random(10,20);
		int r2 = random(10,20);
		int r3 = random(10,20);
		int r4 = random(10,20);
		int r5 = random(10,20);
		sum = Factorial(r1) + Factorial(r2) + Factorial(r3) + Factorial(r4) + Factorial(r5);

		System.out.println("Sum factorial of: " + r1 + " , " + +r2 + " , " + r3 + " , " + r4 + " , " + r5 + " : " + sum);

	}

	private static int Factorial(int a) {
		int b = 1;
		for (int i = 1; i <= a; i++) {
			b = b * i;
		}
		return b;
	}

	private static int random(int inclusiveStart, int inclusiveEnd) {
		return inclusiveStart + rd.nextInt(inclusiveEnd - inclusiveStart + 1);
	}

}
