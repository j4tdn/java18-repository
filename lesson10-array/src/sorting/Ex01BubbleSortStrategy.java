package sorting;

import java.util.Arrays;

import functional.interfface.ComparableStrategy;

/**
 * Sắp xếp nổi bọt
 * 
 * @author qphan
 *
 */
public class Ex01BubbleSortStrategy {
	public static void main(String[] args) {
		int[] elements = { 1, 9, 5, 8, 4, 12 };
		System.out.println("elements --> " + Arrays.toString(elements));

		System.out.println("\n============\n");

		bubbleSort(elements, (e1, e2) -> {
			return e2 - e1;
		});
		System.out.println("elements sorted --> " + Arrays.toString(elements));
	}

	// default: ascending
	public static void bubbleSort(int[] input, ComparableStrategy cs) {
		for (int round = 0; round < input.length; round++) {
			for (int i = 0; i < input.length - round - 1; i++) {
				// asc: input[i] > input[i + 1] --> true
				// desc: input[i] < input[i + 1] --> true
				// input[i] - input[i+1] > 0
				// 2 phần tử kề nhau sẽ hoán vị khi cs.compare(input[i], input[i+1]) > 0
				// người dùng tử xử lý hàm conpare vs phần tử thứ i và i + 1
				if (input[i] < input[i+1]) {
					int tmp = input[i];
					input[i] = input[i + 1];
					input[i + 1] = tmp;
				}
			}
		}
	}
	
}
