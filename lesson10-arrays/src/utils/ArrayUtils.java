package utils;

import java.util.Arrays;
import common.SortOrder;

public class ArrayUtils {
	private ArrayUtils() {
		
	}
	
	/* Cách 1:
	public static void sort(int[] input, boolean isAsc) {
		Arrays.sort(input);
		if (!isAsc) {
			// reverse
			reverse(input);
		}
	}
	*/
	
	// Cách 2 --> recommend to use this method
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