package sorting.primitive;

import java.util.Arrays;

import functional.ComparableStrategy;
import utils.ArrayUtils;

/**
 * Sắp xếp chọn
 * 
 * @author VIET TAY
 *
 */
public class Ex02SelectionSortStrategy {
	public static void main(String[] args) {
		int[] elements = { 1, 9, 5, 8, 4, 12 };
		System.out.println("elements --> " + Arrays.toString(elements));

		System.out.println("\n==================\n");
		selectionSort(elements, (e1, e2) -> {
			return (e1 - e2) * -1;
		});
		System.out.println("elements sorted asc --> " + Arrays.toString(elements));

	}

	// default: acs (tăng dần)
	// Quang trọng
	// Hiểu thuật toán(đoạn if) như thế nào
	// Hiểu e1, e2 là phần tử nào trong mảng
	public static void selectionSort(int[] input, ComparableStrategy cs) {
		for (int pivot = 0; pivot < input.length - 1; pivot++) {
			for (int i = pivot + 1; i < input.length; i++) {
				// input[pivot] > input[i]
				if (cs.copare(input[pivot], input[i]) > 0) {
					ArrayUtils.swap(input, pivot, i);
				}
			}
		}
	}
}
