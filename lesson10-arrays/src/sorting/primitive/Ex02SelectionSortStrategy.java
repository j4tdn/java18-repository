package sorting.primitive;

import java.util.Arrays;
import utils.ArrayUtils;

/**
 * Sắp xếp chọn lọc (Dùng FunctionalInterface)
 * input[i] < input[pivot] --> swap (ASC)
 * 
 * Important point:
 * + Hiểu thuật toán (đoạn if) như thế nào 
 * + Hiểu e1, e2 là phần tử nào trong mảng
 */

public class Ex02SelectionSortStrategy {
	public static void main(String[] args) {
		int[] elements = { 1, 9, 5, 8, 4, 12 };
		System.out.println("Elements --> " + Arrays.toString(elements));
		
		System.out.println("\n==============================\n");
		
		selectionSort(elements, (e1, e2) -> e1 - e2);
		System.out.println("Elements sorted asc --> " + Arrays.toString(elements));
	}

	// default: ASC
	public static void selectionSort(int[] input, ComparableStrategy cs) {
		for (int pivot = 0; pivot < input.length - 1; pivot++) { // duyệt đến phần tử kế cuối rồi phần tử đó so sánh với phần tử cuối
			for (int i = pivot + 1; i < input.length; i++) {
				if (cs.compare(input[i], input[pivot]) < 0) { 
					ArrayUtils.swap(input, i, pivot);
				}
			}
		}
	}
}