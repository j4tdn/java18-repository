package sorting.primitive;

import java.util.Arrays;

import common.SortOrder;
import utils.ArrayUtils;

public class Ex04QuickSort {
	public static void main(String[] args) {
		int[] elements = { 1, 9, 5, 8, 4, 12 };
		System.out.println("elements --> " + Arrays.toString(elements));

		System.out.println("\n============\n");
		
		// Arrays.sort --> quick sort, insertion sort --> threshold
		//             --> support ascending only(with primitive type)
		
		ArrayUtils.sort(elements, SortOrder.DESC);
		System.out.println("elements sorted --> " + Arrays.toString(elements));
	}
}
