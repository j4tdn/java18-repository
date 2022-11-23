package exercises;

import utils.InputUtils;

public class Ex08PrimeNumber {

	public static void main(String[] args) {
		int n = InputUtils.input("Enter N(N > 0)", 5, Integer.MAX_VALUE);
		System.out.println(n + " -> " + isPrime(n));

	}

	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
