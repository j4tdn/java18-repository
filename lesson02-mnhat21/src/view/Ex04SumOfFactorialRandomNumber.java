package view;

import java.util.Random;

public class Ex04SumOfFactorialRandomNumber {
	public static void main(String[] args) {
		Random rd = new Random();
		int sum = 0;
		for(int i = 0; i < 4; i++) {
			int rand = rd.nextInt(21);
			System.out.println(rand);
			sum += Factorial(rand);
		}
		System.out.println("result --> " + sum);
		
//		int rand1 = rd.nextInt(21);
//		int rand2 = rd.nextInt(21);
//		int rand3 = rd.nextInt(21);
//		int rand4 = rd.nextInt(21);
//		int rand5 = rd.nextInt(21);
//		System.out.println("5 random number from 10 to 20 is : " + rand1 + " " + rand2 + " " + rand3 + " " + rand4 + " "
//				+ rand5 + " ");
//		System.out.println("Result --> " + (Factorial(rand1)) + Factorial(rand2) + Factorial(rand3) + Factorial(rand4)
//				+ Factorial(rand5));
	}

	private static int Factorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		return result;
	}
}
