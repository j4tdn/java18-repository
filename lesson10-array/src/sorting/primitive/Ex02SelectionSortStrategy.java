package sorting.primitive;

import java.util.Arrays;

import functional.interfface.ComparableStrategy;
import utils.ArrayUtils;

/**
 * Sắp xếp nổi b�?t
 * 
 * @author qphan
 *
 */
public class Ex02SelectionSortStrategy {
	public static void main(String[] args) {
		int[] elements = { 1, 9, 5, 8, 4, 12 };
		System.out.println("elements --> " + Arrays.toString(elements));

		System.out.println("\n============\n");

		selectionSort(elements, (e1, e2) -> {
			return e2 - e1;
		});
		System.out.println("elements sorted --> " + Arrays.toString(elements));
	}

	// default: ascending
	// Quan tr�?ng
	// Hiểu thuật toán(đoạn if) như thế nào
	// Hiểu e1, e2 là phần tử nào trong mảng
	public static void selectionSort(int[] input, ComparableStrategy cs) {
		// pivot: phần tử chốt
		for (int pivot = 0; pivot < input.length - 1; pivot++) {
			for (int i = pivot + 1; i < input.length; i++) {
				// input[i] < input[pivot] --> asc --> input[i] - input[pivot] < 0
				if (cs.compare(input[pivot], input[i]) < 0) {
					ArrayUtils.swap(input, i, pivot);
				}
			}
		}
	}
}
