package ExeLesson02;

import utils.InputUtils;

public class Ex08isPrime {
	public static void main(String[] args) {
		int n = InputUtils.input("Enter N(N > 2)", 5);
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
