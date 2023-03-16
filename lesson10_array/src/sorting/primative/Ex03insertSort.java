package sorting.primative;

import java.util.Arrays;

import Utils.ArrayUtils;

public class Ex03insertSort {
	public static void main(String[] args) {
		int[] elements = { 1, 7, 4, 3, 9, 5, 2 };
		System.out.println(Arrays.toString(elements));
		System.out.println("==============");
		selectionSort(elements);
		System.out.println(Arrays.toString(elements));
	}

	public static void selectionSort(int[] input) {
		for (int round = 0; round < input.length; round++) {
			for (int i = 0; i < round; i++) {
				if (input[round] < input[i]) {
					ArrayUtils.swap(input, round, i);
				}
			}
		}
	}
}
