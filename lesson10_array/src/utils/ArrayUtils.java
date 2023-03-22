package utils;

import java.util.Arrays;

import javax.swing.SortOrder;

public class ArrayUtils {
	private ArrayUtils() {
		
	}
	
	private static void sort(int[] input, SortOrder sortOrder) {
		Arrays.sort(input);
		if (SortOrder.DESC == sortOrder) {
			reverse(input);
		}
	}
	
	public static void sort () {
		
	}
	
	public static void reverse(int[] input) {
		
	}
	
	public static void swap(int[] input, int i, int j) {
		int tmp = input[i];
		input[i] = input[j];
		input[j] = tmp;
	}

}
