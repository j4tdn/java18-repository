package view;

import java.util.Scanner;

public class Ex07BinaryNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Input n : ");
		int n = ip.nextInt();
		if (n != 0) {
			System.out.print("Binary number of n --> ");
			toBinary(n);
		} else {
			System.out.print("Binary number of n --> 0");
		}
	}

	private static void toBinary(int n) {
		// int result = 0;
		// while(n != 0) {
		// int a = n % 2;
		// n = n / 2;
		// result = result * 10 + a;
		// }
		// return result;
		if (n != 0) {
			toBinary(n / 2);
			System.out.print(n % 2);
		}
	}
}
