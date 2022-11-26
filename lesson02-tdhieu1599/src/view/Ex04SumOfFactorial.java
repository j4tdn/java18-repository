package view;

import java.util.Random;

public class Ex04SumOfFactorial {
	
	private static Random rd = new Random();
	
	public static void main(String[] args) {
		
		System.out.println("[min, max] of int --> [" + Integer.MIN_VALUE + ", " + Integer.MIN_VALUE + "]");
		System.out.println("min int + 1--> " + (Integer.MAX_VALUE + 1));
		System.out.println("max int + 2 --> " + (Integer.MAX_VALUE + 2));
		System.out.println("max int + max in --> " + (Integer.MAX_VALUE + Integer.MAX_VALUE + Integer.MAX_VALUE));
		
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
		System.out.println("sum factorial of " + a + ", " + b + ", " + c + "  --> " + sum);
	}
	
	// [10, 20]
	private static int random(int inclusiveStart, int inclusiveEnd) {
		return inclusiveStart + rd.nextInt(inclusiveEnd - inclusiveStart + 1);
	}
	
	// validation --> n! > MAX --> error(re-enter) (convert long)
	private static int fact(int n) {
		
		// n! = n*(n-1)*(n-2)*...2
		System.out.println("========================");
		int f = 1;
		while(n > 1) {
			int prev = f;
			f *= n--;
			System.out.println("f("+n+") --> " + f);
			if (f < prev) {
				System.out.println("factorial exceed max int ");
				return Integer.MAX_VALUE;
			}
		}
		return f;
	}
}
