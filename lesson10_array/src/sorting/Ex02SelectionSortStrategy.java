package sorting;

import java.util.Arrays;

import functional.interfface.ComparableStrategy;
import utils.ArrayUtils;

public class Ex02SelectionSortStrategy {
	public static void main(String[] args) {
		int[] element = { 1, 9, 5, 7, 4, 8 };
		System.out.println("element --> " + Arrays.toString(element));
		System.out.println("==========================");
		SelectionSort(element, (e1, e2) -> {
			return e1 - e2;
		});
		System.out.println("SeletionSort --> " + Arrays.toString(element));
	}

	public static void SelectionSort(int[] input, ComparableStrategy cs) {
		for (int pivot = 0; pivot < input.length; pivot++) {
			for (int i = pivot + 1; i < input.length; i++) {
				if (cs.compare(input[pivot], input[i]) < 0) {
					ArrayUtils.swap(input, i, pivot);
				}
			}
		}
	}

}
