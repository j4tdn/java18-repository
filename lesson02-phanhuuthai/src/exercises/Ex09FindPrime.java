package exercises;

import java.util.Scanner;

public class Ex09FindPrime {
	public static void main(String[] args) {
		int n = 1, i = 0;
		while (i < 200) {
			n++;
			if (isPrime(n)) {
				i++;
			}
		}
		System.out.println("Prime 200: " + n);
	}

	private static boolean isPrime(int a) {
		for (int i = 2; i <= (a / 2); i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

}
