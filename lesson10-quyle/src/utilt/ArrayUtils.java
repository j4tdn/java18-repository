package utilt;

import java.util.Arrays;

import common.SortOrder;

public class ArrayUtils {
	private ArrayUtils() {
		
	}
	public static void swap(int[] input , int pivot , int i) {
		int tmp=i;
		i=pivot;
		pivot=tmp;
	}
	public static void sort(int[] input,SortOrder sortOrder) {
		ArrayUtils.sort(input);
		if(sortOrder.ASC==sortOrder) {
			reverse(input);
		}
	}
	public static void sort(int[] input) {
		Arrays.sort(input);
	}
	public static void reverse(int[] input) {
		for(int i=0;i<input.length/2;i++) {
			int tmp = input[i];
			input[i]=input[input.length-1-i];
			input[input.length-1-i]=tmp;
			
		}
	}
}
