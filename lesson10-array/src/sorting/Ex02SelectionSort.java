package sorting;

import java.util.Arrays;

import functional.interfaces.CompareStrategy;
import utils.ArrayUtils;

public class Ex02SelectionSort {
	public static void main(String[] args) {
		int[] elements = {1, 9, 5, 8, 4, 12};
		selectionSort(elements, (e1, e2) -> e1 - e2);
		System.out.println(Arrays.toString(elements));
	}
	
	public static void selectionSort(int[] input, CompareStrategy<Integer> cs) {
		for(int pivot = 0; pivot < input.length; pivot++) {
			for(int j = pivot + 1; j < input.length; j++) {
				if(cs.compare(j, pivot) > 0) {
					ArrayUtils.swap(input, j, pivot);
				}
			}
		}
	}
}

