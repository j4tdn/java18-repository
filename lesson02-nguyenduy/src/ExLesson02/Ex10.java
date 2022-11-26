package ExLesson02;

import java.util.Random;

public class Ex10 {
	public static void main(String[] args) {
		int a =1, b=1, c=1, d=1, e=1;
		
		do {
			Random rand = new Random();
			a = rand.nextInt(11)+20;
			b = rand.nextInt(11)+20;
			c = rand.nextInt(11)+20;
			d = rand.nextInt(11)+20;
			e = rand.nextInt(11)+20;
		} while(repeat(a, b, c, d, e));
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		System.out.println("d : "+d);
		System.out.println("e : "+e);
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
