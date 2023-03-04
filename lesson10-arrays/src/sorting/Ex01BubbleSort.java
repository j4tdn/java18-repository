package sorting;

import java.util.Arrays;

/**
 * Sắp xếp nổi bọt
 */

public class Ex01BubbleSort {
	public static void main(String[] args) {
		int[] elements = { 1, 9, 5, 8, 4, 12 };
		System.out.println("Elements --> " + Arrays.toString(elements));
		
		System.out.println("\n==============================\n");
		
		bubbleSort(elements);
		System.out.println("Elements sorted asc --> " + Arrays.toString(elements));
	}

	// default: ASC
	public static void bubbleSort(int[] input) {
		for (int round = 0; round < input.length; round++) {
			for (int i = 0; i < input.length - round - 1; i++) {
				if (input[i] > input[i + 1]) { // ASC // DESC --> input[i] < input[i + 1]
					int tmp = input[i];
					input[i] = input[i + 1];
					input[i + 1] = tmp;
				}
			}
		}
	}
}