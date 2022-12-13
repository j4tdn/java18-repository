package test;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumbers {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = ip.nextInt();
		int[] numbers = new int[n];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = ip.nextInt();
		}
		System.out.println(Arrays.toString(result(noRepeat(numbers))));

	}

	private static int[] noRepeat(int[] numbers) {
		int[] temps = new int[numbers.length];
		int count = 0;
		for (int n1 : numbers) {
			int test = 0;
			for (int n2 : numbers) {
				if (n2 == n1) {
					test++;
				}
			}
			if (test == 1) {
				temps[count] = n1;
				count++;
			}

		}
		return Arrays.copyOfRange(temps, 0, count);
	}

	private static int[] result(int[] numbers) {
		int temp = numbers[0];
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					temp = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = temp;
				}
			}
		}
		return numbers;
	}

}
