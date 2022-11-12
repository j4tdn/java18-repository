package view;

import java.util.Random;

/**
 * 
 * 	Viết chương trình tính tổng giải thừa của các số nguyên dương S = a! +b! + c! + d!
	Biết rằng a,b,c,d là các số nguyên ngẫu nhiên từ 10 đến 20 -> [10, 20]
 *
 */
public class Ex04SumOfFactorial {

	public static void main(String[] args) {
		Random rd = new Random();

		int a = 10 + rd.nextInt(11); // [10,21)
		int b = 10 + rd.nextInt(11);
		int c = 10 + rd.nextInt(11);
		int d = 10 + rd.nextInt(11);

		long s = Ex03Factorial.factorial(a) + Ex03Factorial.factorial(b) + Ex03Factorial.factorial(c)
				+ Ex03Factorial.factorial(d);
		System.out.println(a + "! + " + b + "! + " + c + "! + " + d + "! = " + s);

	}

}
