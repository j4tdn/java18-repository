package excersies;

import java.util.Random;

public class Ex04SumOfFactorial {
	public static void main(String[] args) {
		Random rd = new Random();
		int a = 10 + rd.nextInt(10);
		int b = 10 + rd.nextInt(10);
		int c = 10 + rd.nextInt(10);
		int d = 10 + rd.nextInt(10);
		long sum = getFac(a) + getFac(b) + getFac(c) + getFac(d);
		System.out.println("A B C D ==> " + a +" "+b +" "+c + " "+d);
		System.out.println("sum ==>" + sum);
		
	}
	private static long getFac(int val) {
		long temp = val;
		for (int i = 1; i < val; i++) {
			temp = temp * i;
		}
		return temp;
	}
}

