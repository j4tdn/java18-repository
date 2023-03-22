package sorting;

import java.util.Arrays;

import functional.interfface.ComparableStrategy;

/**
 * Sắp xếp nổi bọt
 * 
 * @author ADMIN
 *
 */
public class Ex01BubbleSortStrategy {
	public static void main(String[] args) {
		int[] elements = { 1, 9, 5, 8, 4, 12 };
		System.out.println("elements --> " + Arrays.toString(elements));
		System.out.println("\n=================\n");
		BubbleSort(elements, (e1, e2) -> {
			return (e1-e2);
		});
		System.out.println("elements sorted asc--> " + Arrays.toString(elements));
	}

	private static void BubbleSort(int[] input, ComparableStrategy cs) {
		for (int round = 0; round < input.length; round++) {
			for (int i = 0; i < input.length - 1- round; i++) {
				if (cs.compare(input[i], input[i + 1]) > 0) {
					int tmp = input[i];
					input[i] = input[i + 1];
					input[i + 1] = tmp;
				}
			}
		}
	}
}
