package view;

import java.util.Random;

/*Viết chương trình tính tổng giải thừa của các số nguyên dương S = a! +b! + c! + d!
Biết rằng a,b,c,d là các số nguyên ngẫu nhiên từ 10 đến 20 -> [10, 20]*/

public class Ex04SumFactorial {
	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(10,20);
		int b = rd.nextInt(10,20);
		int c = rd.nextInt(10,20);
		int d = rd.nextInt(10,20);
		
		long sumFactorial = factorial(a) + factorial(b) + factorial(c) + factorial(d);
		System.out.println("Sum fatorial of " + a + " " + b + " " + c + " " + d + " is: " + sumFactorial); 
		}
	
	private static long factorial(int n) {
		long factorial = 1;
		for(int i =1; i<= n; i++) {
			factorial *=i;
		}
		return factorial;
	}
}


