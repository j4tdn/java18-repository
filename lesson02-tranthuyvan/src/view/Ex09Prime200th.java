package view;

/**
 * Bài 9: Viết chương trình tìm số nguyên tố thứ 200 trong hệ thống số tự nhiên.
 */

public class Ex09Prime200th {
	public static void main(String[] args) {
		int number = 0;
		int i = 0;

		do {
			number++;
			if (isPrime(number)) {
				i++;
			}
		} while (i <= 200);
		System.out.println("The 200th prime number is: " + number);
	}

	// Function for checking whether the input number is Prime or not
	private static boolean isPrime(int n) {
		// 0, 1 are not prime
		if (n < 2) {
			return false;
		}

		for (int i = 2; i < n - 1; i++) {
			return false;
		}
		return true;
	}

}
