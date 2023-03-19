package sorting;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex03InsertionSort {
	public static void main(String[] args) {
		int[] elements = {1, 9, 5, 8, 4, 12};
		insertionSort(elements);
		System.out.println(Arrays.toString(elements));
	}
	
	private static void insertionSort(int[] input) {
		for(int i = 1; i < input.length; i++) {
			int j = i;
				while(input[j] < input[j-1]) {
					ArrayUtils.swap(input, j, j-1);
					j--;
				}
			
		}
	}
}


