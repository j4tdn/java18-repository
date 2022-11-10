package view;

import java.util.Random;

/**
 * Bài 4: Viết chương trình tính tổng giải thừa của các số nguyên dương S = a! +b! + c! + d!
 * Biết rằng a,b,c,d là các số nguyên ngẫu nhiên từ 10 đến 20 → [10, 20]
 */

public class Ex04RandomAndFactorial {
	public static void main(String[] args) {
		// Random a number [10, 20]
		Random rd = new Random();

		int a = 10 + rd.nextInt(11);
		System.out.println("a: " + a);

		int b = 10 + rd.nextInt(11);
		System.out.println("b: " + b);

		int c = 10 + rd.nextInt(11);
		System.out.println("c: " + c);

		int d = 10 + rd.nextInt(11);
		System.out.println("d: " + d);

		System.out.println("===========================");

		// Calculate factorial
		long result = factorial(a) + factorial(b) + factorial(c) + factorial(d);
		System.out.println("Total --> " + result);
	}

	private static long factorial(int n) {
		long factorial = 1;
		while (n > 1) {
			factorial *= n;
			n--;
		}
		return factorial;
	}

}
