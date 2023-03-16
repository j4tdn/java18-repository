package Utils;

import java.util.Arrays;

import common.SortOrder;

public class ArrayUtils {
	public ArrayUtils() {
		// TODO Auto-generated constructor stub
	}

	public static void sort(int[] input, SortOrder sortOrder) {
		Arrays.sort(input);
		if (sortOrder == SortOrder.DESC) {
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

	public static void swap(int[] input, int pivot, int i) {
		int tmp = input[pivot];
		input[pivot] = input[i];
		input[i] = tmp;
	}
}
