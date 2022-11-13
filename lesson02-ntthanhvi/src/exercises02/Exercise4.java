package exercises02;

import java.util.Random;

public class Exercise4 {
	public static void main(String[] args) {
		Random rd = new Random();
		
		int a = 10 + rd.nextInt(11); 
		
		int b = 10 + rd.nextInt(11); 
		
		int c = 10 + rd.nextInt(11); 
		
		int d = 10 + rd.nextInt(11); 
		
		System.out.print("a-b-c-d is: " + " a: " + a + " b: " + b + " c: " + c + " d: " + d);
		long result = factorial(a) + factorial(b) + factorial(c) + factorial(d);
		System.out.println("\nResult: " + result);
	}
	private static long factorial(long n) {
		long result = 1;
		for (int i = 1; i <=n; i++) {
			result *= i;
		}
		return result;
	}
}
