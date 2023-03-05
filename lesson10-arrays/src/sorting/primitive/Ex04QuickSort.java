package sorting.primitive;

import java.util.Arrays;
import common.SortOrder;
import utils.ArrayUtils;

/**
 * Arrays.sort --> quickSort, insertionSort --> Threshold (ngưỡng giá trị)
 *             --> support ASC only (with primitive type)
 */

public class Ex04QuickSort {
	public static void main(String[] args) {
		int[] elements = { 1, 9, 5, 8, 4, 12 };
		System.out.println("Elements --> " + Arrays.toString(elements));
		
		System.out.println("\n==============================\n");
		
		ArrayUtils.sort(elements, SortOrder.ASC);
		System.out.println("Elements sorted asc --> " + Arrays.toString(elements));
	}

}
