package sorting;

import java.util.Arrays;

import utils.ArrayUtils;

/**
 * Sắp xếp chọn lọc
 */

public class Ex02SelectionSort {
	public static void main(String[] args) {
		int[] elements = { 1, 9, 5, 8, 4, 12 };
		System.out.println("Elements --> " + Arrays.toString(elements));
		
		System.out.println("\n==============================\n");
		
		selectionSort(elements);
		System.out.println("Elements sorted asc --> " + Arrays.toString(elements));
	}

	// default: ASC
	public static void selectionSort(int[] input) {
		for (int pivot = 0; pivot < input.length - 1; pivot++) { // duyệt đến phần tử kế cuối rồi phần tử đó so sánh với phần tử cuối
			for (int i = pivot + 1; i < input.length; i++) {
				if (input[i] < input[pivot]) { 
					ArrayUtils.swap(input, i, pivot);
				}
			}
		}
	}
}