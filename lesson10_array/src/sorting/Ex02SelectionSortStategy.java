package sorting;

import java.util.Arrays;

import Utils.ArrayUtils;
import funtional.ComparableStrategy;

public class Ex02SelectionSortStategy {
	public static void main(String[] args) {
		int[] elements = { 1, 7, 4, 3, 9, 5, 2 };
		System.out.println(Arrays.toString(elements));
		System.out.println("==============");
		selectionSort(elements, (e1, e2) -> {
			return e2 - e1;
		});
		System.out.println(Arrays.toString(elements));
	}

	public static void selectionSort(int[] input, ComparableStrategy cs) {
		for (int pivot = 0; pivot < input.length - 1; pivot++) {
			for (int i = pivot + 1; i < input.length; i++) {
				if (cs.compare(input[pivot], input[i]) < 0) {
					ArrayUtils.swap(input, pivot, i);
				}
			}
		}
	}
}
