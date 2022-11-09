package view;

public class Ex09The200PrimeNumber {
	public static void main(String[] args) {

		int count = 0;
		int n = 0;
		while (count != 200) {
			n++;
			if (isPrimeNumber(n)) {
				count++;
			}
		}
		System.out.println("The 200 Prime Number --> " + n);
	}

	private static boolean isPrimeNumber(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
