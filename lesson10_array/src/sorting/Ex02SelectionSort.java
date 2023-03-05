package sorting;

import java.util.Arrays;

import Utils.ArrayUtils;

public class Ex02SelectionSort {
	public static void main(String[] args) {
		int[] elements = { 1, 7, 4, 3, 9, 5, 2 };
		System.out.println(Arrays.toString(elements));
		System.out.println("==============");
		selectionSort(elements);
		System.out.println(Arrays.toString(elements));
	}

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
