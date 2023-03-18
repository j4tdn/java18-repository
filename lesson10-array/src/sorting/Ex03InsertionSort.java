package sorting;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex03InsertionSort {
	public static void main(String[] args) {
		int[] elements = { 4, 2, 6, 1, 9, 3 };
		insertionSort(elements);

		System.out.println(Arrays.toString(elements));
	}

	public static void insertionSort(int[] input) {
		//pivot: phần tử chốt
		for(int round = 1; round < input.length; round++) {
			for(int i = 0; i < round; i++) {
				if(input[i] > input[round]) {
					ArrayUtils.swap(input, i, round);
				}
			}
		}
	}
}
