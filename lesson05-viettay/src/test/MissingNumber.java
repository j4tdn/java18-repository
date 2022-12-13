package test;

import java.util.Scanner;

public class MissingNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = ip.nextInt();
		int[] numbers = new int[n - 1];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = ip.nextInt();
		}
		System.out.println("Phần tử cần tìm có giá trị: " + getMissingNumber(numbers));
	}

	private static int getMissingNumber(int[] numbers) {
		int[] temps = new int[numbers.length];
		for (int i = 0; i < temps.length; i++) {
			temps[i] = i + 1;
		}
		for (int temp : temps) {
			int count = 0;
			for (int number : numbers) {
				if (temp == number) {
					count++;
				}
			}
			if (count == 0) {
				return temp;
			}
		}
		return 0;
	}

}
