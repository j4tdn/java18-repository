package sorting.primitive;

import java.util.Arrays;
import utils.ArrayUtils;

/**
 * Sắp xếp chèn (Dùng FunctionalInterface)
 */

public class Ex03InsertionSortStrategy {
	public static void main(String[] args) {
		int[] elements = { 1, 9, 5, 8, 4, 12 };
		System.out.println("Elements --> " + Arrays.toString(elements));

		System.out.println("\n==============================\n");

		inserttionSort(elements, (e1, e2) -> e1 - e2);
		System.out.println("Elements sorted asc --> " + Arrays.toString(elements));
	}

	// default: ASC
	public static void inserttionSort(int[] input, ComparableStrategy cs) {
		for (int round = 0; round < input.length; round++) {
			for (int i = 0; i < round; i++) {
				if (cs.compare(input[i], input[round]) > 0) {
					ArrayUtils.swap(input, i, round);
				}
			}
		}
	}
}