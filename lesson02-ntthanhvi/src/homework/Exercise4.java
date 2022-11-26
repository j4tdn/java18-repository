package homework;

import java.util.Random;


public class Exercise4 {
	
	private static Random rd = new Random();
	
	public static void main(String[] args) {
		
		System.out.println("[min, max] of int --> [" + Integer.MIN_VALUE + ", " + Integer.MIN_VALUE + "]");
		System.out.println("min int + 1--> " + (Integer.MAX_VALUE + 1));
		System.out.println("max int + 2 --> " + (Integer.MAX_VALUE + 2));
		System.out.println("max int + max in --> " + (Integer.MAX_VALUE + Integer.MAX_VALUE + Integer.MAX_VALUE));
		
		int a = random(10, 20);
		int b = random(10, 20);
		int c = random(10, 20);
		int d = random(10, 20);
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("d: " + d);
		
		System.out.println("fact(a) --> " + fact(a));
		System.out.println("fact(b) --> " + fact(b));
		System.out.println("fact(c) --> " + fact(c));
		System.out.println("fact(d) --> " + fact(d));
		
		
		
		int sum = fact(a) + fact(b) + fact(c) + fact(d);
		System.out.println("Sum factorial of " + a + ", " + b + ", " + c + ", " + d + " --> " + sum);
	}
	
	private static int random(int inclusiveStart, int inclusiveEnd) {
		return inclusiveStart + rd.nextInt(inclusiveEnd - inclusiveStart + 1);
	}
	
	private static int fact(int n) {
		System.out.println("===========");
		int f = 1;
		while(n > 1) {
			int prev = f;
			f *= n--;
			System.out.println("f("+n+") --> " + f);
			if (f < prev) {
				System.out.println("Factorial exceed max int ");
				return Integer.MAX_VALUE;
			}
		}
		return f;
	}
}
