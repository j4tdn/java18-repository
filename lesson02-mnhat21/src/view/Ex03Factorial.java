package view;

import java.util.Scanner;

public class Ex03Factorial {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = ip.nextInt();
		System.out.println("Factorial of n --> " + Factorial(n));
	}

	private static int Factorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		return result;
	}
}
