package sorting;

import java.util.Arrays;

import funtional.ComparableStrategy;

public class Ex01BubbleSortStategy {
	public static void main(String[] args) {
		int[] elements = { 1, 7, 4, 3, 9, 5, 2 };
		System.out.println(Arrays.toString(elements));
		System.out.println("==============");
		bubbleSort(elements, (e1, e2) -> {
			return e1 - e2;
		});
		System.out.println(Arrays.toString(elements));
	}

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
