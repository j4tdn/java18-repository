package view;

import java.util.Random;

public class Ex10RamdomPrime {
	private static Random rd = new Random();

	public static void main(String[] args) {
		int a = random(20, 30);
		int b,c,d,e;
		System.out.println(a);
		do {
			b = random(20, 30);

		} while (b == a);
		System.out.println(b);
		
		do {
			c = random(20,30);
		} while (c==b && c==a);
		System.out.println(c);
		
		do {
			d = random(20,30);
		} while (d==b && d==a && d==c);
		System.out.println(d);
		
		do {
			e = random(20,30);
		} while (e==b && e==a && e==c && e==d);
		System.out.println(e);

	}

	private static int random(int inclusiveStart, int inclusiveEnd) {
		return inclusiveStart + rd.nextInt(inclusiveEnd - inclusiveStart + 1);
	}
}
