package sorting;

import java.util.Arrays;

import functional.interfface.ComparableStrategy;
import utils.ArrayUtils;

public class Ex01BubbleSortStrategy {
	public static void main(String[] args) {
		int[] elements = { 4, 2, 6, 1, 9, 3 };
		bubbleSort(elements, (e1, e2) -> {
			return e2 - e1;
		});
		System.out.println(Arrays.toString(elements));
	}

	public static void bubbleSort(int[] input, ComparableStrategy cs) {
		for (int round = 0; round < input.length; round++) {
			for (int i = 0; i < input.length - round - 1; i++) {

				if (cs.compare(input[i], input[i + 1]) > 0) {
					ArrayUtils.swap(input, i, i+1);
				}
			}
		}
	}
	

}
