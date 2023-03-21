package sorting;

import java.util.Arrays;

import common.SortOrder;
import utilt.ArrayUtils;

public class Ex02 {
	public static void main(String[] args) {
		int[] elements = { 1, 9, 5, 8, 4, 12 };
		System.out.println("elements --> " + Arrays.toString(elements));
		/*
		 * System.out.println("---------"); selectionSort(elements);
		 * System.out.println("elements new --> " + Arrays.toString(elements));
		 * System.out.println("---------");
		 */
		ArrayUtils.sort(elements, SortOrder.DASC);
		System.out.println("elements new --> " + Arrays.toString(elements));
	}

	public static void selectionSort(int[] input) {
		for(int pivot =0;pivot < input.length;pivot ++) {
			for(int i= pivot +1 ;i<input.length;i++) {
				ArrayUtils.swap(input, pivot, i);
			}
		}
	}
}
