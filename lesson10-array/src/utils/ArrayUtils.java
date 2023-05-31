package utils;

import java.util.Arrays;

import common.SortOrder;

public class ArrayUtils {

	private ArrayUtils() {

	}

	public static void sort(int[] input, SortOrder sortOrder) {
		Arrays.sort(input);
		if (SortOrder.DESC == sortOrder) {
			reverse(input);
		}
	}

	public static void sort(int[] input) {
		Arrays.sort(input);
	}

	public static void reverse(int[] input) {
		for (int i = 0; i < input.length / 2; i++) {
			swap(input, i, input.length - i - 1);
		}
	}

	public static void swap(int[] input, int i, int j) {
		int tmp = input[i];
		input[i] = input[j];
		input[j] = tmp;
	}

}