package View;

import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {
		Random rand = new Random();
		long a = rand.nextInt(10, 20);
		long b = rand.nextInt(10, 20);
		long c = rand.nextInt(10, 20);
		long d = rand.nextInt(10, 20);
		long result = factorialOfNumber(a) + factorialOfNumber(b) + factorialOfNumber(c) + factorialOfNumber(d);
		System.out.println("S = " + a + "! + " + b + "! + " + c + "! + " + d + "! = "+result);
	}

	public static long factorialOfNumber(long input) {
		long fon = 1;
		for (long i = input; i >= 2; i--) {
			fon *= i;
		}
		return fon;
	}

}
