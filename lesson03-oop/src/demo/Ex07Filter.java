package demo;

import java.util.Arrays;

public class Ex07Filter {
	public static void main(String[] args) {
		int[] numbers = { 23, 25, 2, 4, 8 };
		int[] oddNumbers = findOddNumbers(numbers);
		System.out.println(Arrays.toString(oddNumbers));

	}

	private static int[] findOddNumbers(int[] elements) {
		int[] result = new int[elements.length];
		int count = 0;
		for (int element : elements) {
			if (element % 2 != 0) {
				result[count] = element;
				count++;
			}
		}
		int[] a = new int[count];
		for (int i = 0; i < count; i++) {
			a[i] = result[i];
		}
		return a;
	}
}
