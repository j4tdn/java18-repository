package sorting;

import java.util.Arrays;

import functional.interfaces.CompareStrategy;
import utils.ArrayUtils;

public class SelectionSortStrategy {
	public static void main(String[] args) {
		int[] elements = {1, 9, 5, 8, 4, 12};
		selectionSort(elements, (e1, e2) -> e1 - e2);
		System.out.println(Arrays.toString(elements));
	}
	
	private static void selectionSort(int[] input, CompareStrategy<Integer> cs) {
		for(int i = 0; i < input.length - 1; i++) {
			for(int j = i+1; j < input.length; j++) {
				if(cs.compare(input[i], input[j]) > 0) {
					ArrayUtils.swap(input, i, j);
				}
			}
		}
	}
}
