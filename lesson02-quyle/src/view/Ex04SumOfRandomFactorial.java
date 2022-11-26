package view;

import java.util.Random;

public class Ex04SumOfRandomFactorial {
	public static void main(String[] args) {
		Random rd = new Random();
		
		int rd1 = 10 + rd.nextInt(11);
		int rd2 = 10 + rd.nextInt(11);
		int rd3 = 10 + rd.nextInt(11);
		int rd4 = 10 + rd.nextInt(11);
		
		System.out.println("Sum of " + rd1 + "! " + rd2 + "! " + rd3 + "! " + rd4 + "! " 
		     + "is: " + (long) (Factorial(rd1) + Factorial(rd2) + Factorial(rd3) + Factorial(rd4)));
	}
	
	private static long Factorial(int num) {
		int total = 1;
		for (int i = 1; i <= num; i++) {
			total = total * i;
		}
		return total;
	}
}