package sorting;

import java.util.Arrays;

/**
 * Sắp xếp nổi bọt
 * 
 * Idea:
 * round (first round, second round,...) --> vòng 1, vòng 2,...
 * i (duyệt và so sánh "các phần tử liền kề" (số thứ 1 với 2, số thứ 2 với 3,...) 
 * --> duyệt đến length-round-1
 * Nếu preE - nextE > 0 --> swap
 * 
 * 2 phần tử kề nhau sẽ hoán vị khi cs.compare(input[i], input[i + 1]) > 0
 * người dùng tự xử lý hàm compare với phần tử thứ i và i+1
 * 
 * ASC --> e1 - e2
 * DESC --> e2 - e1
 */

public class Ex01BubbleSortStrategy {
	public static void main(String[] args) {
		int[] elements = { 1, 9, 5, 8, 4, 12 };
		System.out.println("Elements --> " + Arrays.toString(elements));
		
		System.out.println("\n==============================\n");
		
		bubbleSort(elements, (e1, e2) -> e1 - e2);
		System.out.println("Elements sorted asc --> " + Arrays.toString(elements));
	}

	// default: ASC
	/*
	public static void bubbleSort(int[] input) {
		for (int round = 0; round < input.length; round++) {
			for (int i = 0; i < input.length - round - 1; i++) {
				if (input[i] > input[i + 1]) { // ASC // DESC --> input[i] < input[i + 1]
					int tmp = input[i];
					input[i] = input[i + 1];
					input[i + 1] = tmp;
				}
			}
		}
	}
	*/
	
	public static void bubbleSort(int[] input, ComparableStrategy cs) {
		for (int round = 0; round < input.length; round++) {
			for (int i = 0; i < input.length - round - 1; i++) {
				if (cs.compare(input[i], input[i + 1]) > 0) {
					int tmp = input[i];
					input[i] = input[i + 1];
					input[i + 1] = tmp;
				}

			}
		}
	}
}