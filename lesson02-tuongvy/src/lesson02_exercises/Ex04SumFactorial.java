package lesson02_exercises;

import java.util.Random;

public class Ex04SumFactorial {
	public static void main(String[] args) {
		Random rd = new Random();

		long a = rd.nextLong(10, 21);
		long b = rd.nextLong(10, 21);
		long c = rd.nextLong(10, 21);
		long d = rd.nextLong(10, 21);
		long S = 0;
		System.out.println(a + " " + b + " " + c + " " + d);

		S = Factorial(a) + Factorial(b) + Factorial(c) + Factorial(d);
		System.out.println("Sum Factorial: " + S);

	}

	private static long Factorial(Long N) {
		long a = N;
		while (N > 1) {
			--N;
			a *= N;
		}
		return a;

	}

}
