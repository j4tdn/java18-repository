package sorting.primitive;

import java.util.Arrays;

import utils.ArrayUtils;

/**
 * Sắp xếp chọn
 * 
 * @author VIET TAY
 *
 */
public class Ex02SelectionSort {
	public static void main(String[] args) {
		int[] elements = { 1, 9, 5, 8, 4, 12 };
		System.out.println("elements --> " + Arrays.toString(elements));

		System.out.println("\n==================\n");
		selectionSort(elements);
		System.out.println("elements sorted asc --> " + Arrays.toString(elements));

	}

	// default: acs (tăng dần)
	public static void selectionSort(int[] input) {
		for (int pivot = 0; pivot < input.length - 1; pivot++) {
			for (int i = pivot + 1; i < input.length; i++) {
				if (input[pivot] > input[i]) {
					ArrayUtils.swap(input, pivot, i);
				}
			}
		}
	}
}
