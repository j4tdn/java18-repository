package homework;

import java.util.Random;

public class Ex04Random {

	private static Random rd = new Random();

	public static void main(String[] args) {

		System.out.println("[min, max] of int --> [" + Integer.MAX_VALUE + "," + Integer.MIN_VALUE + "]");
		System.out.println("max int + 1 -->" + (Integer.MIN_VALUE + 1));

		System.out.println("max int + 2 -->" + (Integer.MAX_VALUE + 2));

		System.out.println("max int + max in -->" + (Integer.MAX_VALUE + Integer.MAX_VALUE));

		int a = random(1, 6);
		int b = random(1, 6);
		int c = random(5, 10);

		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
		System.out.println("c --> " + c);

		System.out.println("fact(a) --> " + fact(a));
		System.out.println("fact(b) --> " + fact(b));
		System.out.println("fact(c) --> " + fact(c));

		int sum = fact(a) + fact(b) + fact(c);
		System.out.println("sum factorial of " + a + ", " + b + ", " + c + " --> " + sum);
	}

	private static int random(int inclusiveStart, int inclusiveEnd) {
		Random rd = new Random();
		return inclusiveEnd + rd.nextInt(inclusiveEnd - inclusiveStart + 1);
	}

	private static int fact(int n) {
		System.out.println("===============");

		int f = 1;
		while (n > 1) {
			int prev = f;
			f *= n--;
			System.out.println("f(" + n + ") --> " + f);
			if (f < prev) {
				System.out.println("factorial exceed max int");
				return Integer.MAX_VALUE;
			}
		}
		return f;
	}
}
