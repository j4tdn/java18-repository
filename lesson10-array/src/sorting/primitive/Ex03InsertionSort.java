package sorting.primitive;

import java.util.Arrays;

import utils.ArrayUtils;

/**
 * Sắp xếp chèn
 * 
 * @author qphan
 *
 */
public class Ex03InsertionSort {
	public static void main(String[] args) {
		int[] elements = { 1, 9, 5, 8, 4, 12 };
		System.out.println("elements --> " + Arrays.toString(elements));

		System.out.println("\n============\n");

		insertionSort(elements);
		System.out.println("elements sorted --> " + Arrays.toString(elements));
	}
	
	// problem solving --> logic, business --> mindset
	// algorithm --> learn theory

	// default: ascending
	public static void insertionSort(int[] input) {
		// pivot: phần tử chốt
		for (int round = 1; round < input.length; round++) {
			for (int i = 0; i < round; i++) {
				if (input[i] > input[round]) {
					ArrayUtils.swap(input, i, round);
				}
			}
		}
	}
}
