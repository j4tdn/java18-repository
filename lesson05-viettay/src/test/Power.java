package test;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter n1: ");
		int n1 = ip.nextInt();
		System.out.print("Enter n2: ");
		int n2 = ip.nextInt();
		if (n1 >= n2) {
			System.out.println(isPower(n1, n2));
		} else {
			System.out.println(isPower(n2, n1));
		}

	}

	private static boolean isPower(int power, int number) {
		double result = Math.log(power) / Math.log(number);
		return Math.ceil(result) == Math.floor(result);
	}
}
