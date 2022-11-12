package exercises;

import java.util.Random;

public class Ex10 {

	public static void main(String[] args) {

		int a = getRandom();
		int b = getRandom();
		do {
			b = getRandom();
		} while (b == a);
		int c = getRandom();
		do {
			c = getRandom();
		} while (c == a || c == b);
		int d = getRandom();
		do {
			d = getRandom();
		} while (d == a || d == b || d == c);
		System.out.println(a + " " + b + " " + c + " " + d);
	}

	public static int getRandom() {
		Random rand = new Random();
		return 20 + rand.nextInt(11);
	}
}
