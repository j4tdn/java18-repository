package view;

import java.util.Random;

public class Ex04SumOfFactorial {
	public static void main(String[] args) {
//		Random rd = new Random();
		Random rd = new Random();
		long sum ;
		int r1 = Greater10(rd.nextInt(21));
		int r2 = Greater10(rd.nextInt(21));
		int r3 = Greater10(rd.nextInt(21));
		int r4 = Greater10(rd.nextInt(21));
		int r5 = Greater10(rd.nextInt(21));
		sum = Factorial(r1) + Factorial(r2) + Factorial(r3) + Factorial(r4) + Factorial(r5);
	
		System.out.println("Sum factorial of: "+r1+ " , " + +r2+ " , " +r3+ " , " +r4+ " , " + r5 + " : " + sum);	
		
		
	}
	private static int Factorial(int a) {
		int b = 1;
		for (int i=1; i<=a; i++) {
			b= b*i;
		}
		return b;
	}

	private static int Greater10(int a) {
		
		if(a<10)
		{
			return a+10;
		}
		else return a;
	}
	

}
