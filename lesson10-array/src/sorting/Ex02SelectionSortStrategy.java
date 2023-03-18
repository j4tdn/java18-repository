package sorting;

import java.util.Arrays;

import functional.interfface.ComparableStrategy;
import utils.ArrayUtils;

public class Ex02SelectionSortStrategy {
	public static void main(String[] args) {
		int[] elements = { 4, 2, 6, 1, 9, 3 };
		selectionSort(elements, (e1,e2) -> {
			return e2 - e1;
		});

		System.out.println(Arrays.toString(elements));
	}

	public static void selectionSort(int[] input, ComparableStrategy cs) {
		//pivot: phần tử chốt
		for (int pivot = 0; pivot < input.length; pivot++) {
			for (int i = pivot + 1; i < input.length; i++) {
				if (cs.compare(input[i], input[pivot]) < 0) {
					ArrayUtils.swap(input, pivot, i);
				}
			}
		}
	}

}
