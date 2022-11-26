package ExLesson02;

import ultils.Input;

public class Ex08 {
	public static void main(String[] args) {
		int n = Input.input("Enter N(N > 2)", 5);
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
