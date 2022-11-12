package exercises;

import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {

		int a = getRandom();
		int b = getRandom();
		int c = getRandom();
		int d = getRandom();
		long sum = getFactorial(a) + getFactorial(b) + getFactorial(c) + getFactorial(d);
		System.out.println(a + "! + " + b + "! + " + c + "! + " + d + "! = " + sum);
	}

	public static int getRandom() {
		Random rand = new Random();
		return 10 + rand.nextInt(11);
	}

	private static long getFactorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * getFactorial(n - 1);
	}
}
