package view;

/**
 * Số nguyên tố tương đương
 * Hai số tự nhiên được gọi là nguyên tố tương đương nếu chúng có chung các ước số nguyên tố.
 * Ví dụ: Các số 75 và 15 là nguyên tố tương đương vì cùng có các ước nguyên tố là 3 và 5.
 * Yêu cầu: Cho trước hai số tự nhiên N, M. Hãy viết chương trình kiểm tra xem các
 * số này có là nguyên tố tương đương với nhau hay không?
 * Input: N,M ( 2 ≤ M ≤ N ≤ 300000000000000000).
 * Output: Nếu chúng là nguyên tố tương đương ghi YES, ngược lại: ghi NO
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ex04EquivalentPrimeNumber {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long input1 = checkInput();
		long input2 = checkInput();

		if (Arrays.equals(primeFactorisation(input1), primeFactorisation(input2))) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	private static long checkInput() {
		do {
			try {
				System.out.print("Enter a number: ");
				long input = sc.nextLong();
				return input;
			} catch (Exception e) {
				System.out.println("Input must be a number! Please try again: ");
				sc.nextLine();
			}
		} while (true);
	}

	private static long[] primeFactorisation(long input) {
		long[] primeArray = new long[20];
		int count = 0;
		int prime = 2;
		// lưu các thừa số nguyên tố vào mảng
		while (input > 1) {
			if (input % prime == 0) {
				input /= prime;
				primeArray[count++] = prime;
			} else {
				prime++;
			}
		}
		// kiểm ra các thừa số nguyên tố đã tồn tại trong mảng chưa
		// nếu đã tồn tại thì gán = 1
		for (int i = 0; i < primeArray.length; i++) {
			for (int j = 0; j < primeArray.length; j++) {
				if (i != j && primeArray[i] == primeArray[j]) {
					primeArray[j] = 1;
				}
			}
		}
		// tạo một mảng để lưu kết quả
		long[] result = new long[primeArray.length];
		int length = 0;
		for (int i = 0; i < primeArray.length; i++) {
			if (primeArray[i] > 1) {
				result[length++] = primeArray[i];
			}
		}
		return Arrays.copyOfRange(result, 0, length);
	}

}
