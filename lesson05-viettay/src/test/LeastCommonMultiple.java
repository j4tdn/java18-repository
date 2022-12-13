package test;

import java.util.Scanner;

public class LeastCommonMultiple {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = ip.nextInt();
		int[] numbers = new int[n];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = ip.nextInt();
		}
		System.out.println("BCNN = " + getLeastCommonMultiple(numbers));
	}

	private static int getLeastCommonMultiple(int[] numbers) {
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			if (max % numbers[i] == 0) {

			}
			max++;
		}

		return max;
	}
}
