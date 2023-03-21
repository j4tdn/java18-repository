package sorting;

import java.util.Arrays;

/**
 * Sap xep noi bot
 * 
 *
 */
public class Ex01BubbleSort {
	public static void main(String[] args) {
		int[] elements = { 1, 9, 5, 8, 4, 12 };
		System.out.println("elements --> " + Arrays.toString(elements));
		System.out.println("---------");
		bubbleSort(elements, (e1, e2) -> {
			return e1 - e2;
		});
		System.out.println("elements new --> " + Arrays.toString(elements));
		System.out.println("---------");
	}

	public static void bubbleSort(int[] input, Comparable cs) {
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
