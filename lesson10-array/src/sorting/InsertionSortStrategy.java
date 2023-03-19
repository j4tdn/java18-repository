package sorting;

import java.util.Arrays;

import functional.interfaces.CompareStrategy;
import utils.ArrayUtils;

public class InsertionSortStrategy {
	public static void main(String[] args) {
		int[] elements = {1, 9, 5, 8, 4, 12};
		insertionSort(elements, new CompareStrategy<Integer>() {
			@Override
			public int compare(Integer e1, Integer e2) {
				return e1 - e2;
			}
		});
		System.out.println(Arrays.toString(elements));
	}
	
	private static void insertionSort(int[] input, CompareStrategy<Integer> cs) {
		for(int i = 1; i < input.length; i++) {
			int j = i;
			while(cs.compare(input[j], input[j-1]) < 0) {
				ArrayUtils.swap(input, j, j-1);
				j--;
			}
		}
	}
}
