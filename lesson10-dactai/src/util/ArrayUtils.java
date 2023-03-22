package util;

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
	
	public static void swap(int[] input, int i, int j) {
		int tmp = input[i];
		input[i] = input[j];
		input[j] = tmp;
	}
	
	public static void reverse(int[] origin) {
		for (int i = 0; i < origin.length / 2; i++) {
			swap(origin, i, origin.length - i - 1);
		}
	}

}
