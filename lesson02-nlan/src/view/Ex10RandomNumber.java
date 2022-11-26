package view;

import java.util.Random;

/*Viết chương trình in ra 5 số nguyên ngẫu nhiên từ 20 đến 30  [20, 30]
Yêu cầu: 5 số ngẫu nhiên không được trùng nhau
 */

public class Ex10RandomNumber {

	public static void main(String[] args) {
		int a = 1, b = 1, c = 1, d = 1, e = 1;

		do {
			Random rd = new Random();
			a = rd.nextInt(11) + 20;
			b = rd.nextInt(11) + 20;
			c = rd.nextInt(11) + 20;
			d = rd.nextInt(11) + 20;
			e = rd.nextInt(11) + 20;
		} while (repeat(a, b, c, d, e));
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		System.out.println("e : " + e);
	}

	private static boolean repeat(int a, int b, int c, int d, int e) {
		if (a == b || a == c || a == d || a == e) {
			return true;
		}
		if (b == c || b == d || b == e) {
			return true;
		}
		if (c == d || c == e) {
			return true;
		}
		if (d == e) {
			return true;
		}
		return false;
	}
}
