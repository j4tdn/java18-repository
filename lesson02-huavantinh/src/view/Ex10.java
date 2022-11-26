package view;
import java.util.Random;

public class Ex10 {
	public static void main(String[] args) {
		Random ran = new Random();
		int a = 20 + ran.nextInt(11);

		int b, c, d, e;

		do {
			b = 20 + ran.nextInt(11);

		} while (a == b);

		do {
			c = 20 + ran.nextInt(11);
		} while (c == a || c == b);

		do {
			d = 20 + ran.nextInt(11);
		} while (d == a || d == b || d == c);

		do {
			e = 20 + ran.nextInt(11);
		} while (e == a || e == b || e == c || e == d);

		System.out.println(a + " " + b + " " + c + " " + d + " " + e);

	}
 
}
