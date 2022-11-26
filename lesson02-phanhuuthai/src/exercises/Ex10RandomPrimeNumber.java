package exercises;

import java.util.Random;

public class Ex10RandomPrimeNumber {
	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(11)+20;
		
		int b = rd.nextInt(11)+20;
		while(b==a) {
			b = rd.nextInt(11)+20;
		}
		
		int c = rd.nextInt(11)+20;
		while(c==b || c == a) {
			c = rd.nextInt(11)+20;
		}
		
		int d = rd.nextInt(11)+20;
		while(d==c || d == b || d == a) {
			d = rd.nextInt(11)+20;
		}
		
		int e = rd.nextInt(11)+20;
		while(e==d || e == c || e == b || e == a) {
			e = rd.nextInt(11)+20;
		}
		
		System.out.println(a + ", " + b + ", " + c + ", " + d + ", " + e);
	}
}
