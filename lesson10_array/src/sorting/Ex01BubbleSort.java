package sorting;
/*
 *  Sắp xếp nổi bọt
 */

import java.util.Arrays;

import functional.interfface.ComparableStrategy;

public class Ex01BubbleSort {
	public static void main(String[] args) {
		int[] element = {1, 9, 5, 7, 4, 8};
		System.out.println("element --> " + Arrays.toString(element));
		System.out.println("==========================");
		BubbleSort(element, (e1, e2) -> {
			return e1 - e2;
		});
		System.out.println("bubbleSort --> " + Arrays.toString(element));
	}
	
	public static void BubbleSort(int[] input, ComparableStrategy cs) {
		for ( int round = 0; round < input.length; round++) {
			for (int i = 0; i < input.length - round -1; i++) {
				
				if (cs.compare(input[i], input[i + 1]) > 0) {
					int tmp = input[i];
					input[i] = input[i + 1];
					input[i+ 1] = tmp;
				}
			}
		}
	}

}
