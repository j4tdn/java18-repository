package exercises;

import utils.InputUtils;

public class Ex10RandomPrimeNumber {
	public static void main(String[] args) {

		int a = InputUtils.random(20, 30);
		int b = InputUtils.random(20, 30);
		do {
			b = InputUtils.random(20, 30);
		} while (b == a);
		int c = InputUtils.random(20, 30);
		do {
			c = InputUtils.random(20, 30);
		} while (c == a || c == b);
		int d = InputUtils.random(20, 30);
		do {
			d = InputUtils.random(20, 30);
		} while (d == a || d == b || d == c);
		int e = InputUtils.random(20, 30);
		do {
			e = InputUtils.random(20, 30);
		} while (e == a || e == b || e == c || e == d);
		System.out.println(a + " " + b + " " + c + " " + d + " " + e);
	}

}
