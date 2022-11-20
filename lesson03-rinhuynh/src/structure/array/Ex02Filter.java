package structure.array;

import java.util.Arrays;

public class Ex02Filter {
	public static void main(String[] args) {
		int[] numbers = { 23, 25, 16, 33, 66 };
		int[] oddNumbers = findOdNumbers(numbers);
		System.out.println(Arrays.toString(oddNumbers));
	}

	// int[] elements = numbers;
	private static int[] findOdNumbers(int[] elements) {
		// index: 0 1 2 3 4
		// value: 0 0 0 0 0
		int[] oddElement = new int[elements.length];
		int count = 0;
		for (int element : elements) {
			if (element % 2 != 0) {
				oddElement[count] = element;
				count++;
			}

		}
		int[] result = new int[count];
		for (int i = 0; i < count; i++) {
			result[i] = oddElement[i];
		}
		return result;

	}
}
