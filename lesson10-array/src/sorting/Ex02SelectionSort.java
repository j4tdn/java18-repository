package sorting;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex02SelectionSort {
	public static void main(String[] args) {
		int[] elements = { 4, 2, 6, 1, 9, 3 };
		selectionSort(elements);

		System.out.println(Arrays.toString(elements));
	}

	public static void selectionSort(int[] input) {
		//pivot: phần tử chốt
		for (int pivot = 0; pivot < input.length; pivot++) {
			for (int i = pivot + 1; i < input.length; i++) {
				if (input[pivot] > input[i]) {
					ArrayUtils.swap(input, pivot, i);
				}
			}
		}
	}

}
