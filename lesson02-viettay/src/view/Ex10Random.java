package view;

import java.util.Random;

/**
 * 
 * 	Viết chương trình in ra 5 số nguyên ngẫu nhiên từ 20 đến 30 -> [20, 30]
	Yêu cầu: 5 số ngẫu nhiên không được trùng nhau	
 *
 */
public class Ex10Random {

	public static void main(String[] args) {
		Random rd = new Random();

		int a = 20 + rd.nextInt(11);
		int b = 20 + rd.nextInt(11);
		int c = 20 + rd.nextInt(11);
		int d = 20 + rd.nextInt(11);
		int e = 20 + rd.nextInt(11);

		if (!repeat(a, b, c, d, e)) {
			System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d + ", e = " + e);
		} else {
			System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d + ", e = " + e);
			System.out.println("=================REPEAT===============");
		}
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
