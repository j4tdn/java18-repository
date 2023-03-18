package sorting;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex01BubbleSort {
	public static void main(String[] args) {
		int[] elements = { 4, 2, 6, 1, 9, 3 };
		System.out.println("elements ------> " + Arrays.toString(elements));
		bubbleSort(elements);
		System.out.println("elements after sorting ------> " + Arrays.toString(elements));
	}

	public static void bubbleSort(int[] input) {
		for (int round = 0; round < input.length; round++) {
			for (int i = 0; i < input.length - round - 1; i++) {
				if (input[i] > input[i + 1]) {
					ArrayUtils.swap(input, i, i+1);
				}
			}
		}
	}
	
	

}
