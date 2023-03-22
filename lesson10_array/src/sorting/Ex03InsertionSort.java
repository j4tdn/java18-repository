package sorting;

import java.util.Arrays;

import functional.interfface.ComparableStrategy;
import utils.ArrayUtils;

public class Ex03InsertionSort {
	public static void main(String[] args) {
		int[] element = { 1, 9, 5, 7, 4, 8 };
		System.out.println("element --> " + Arrays.toString(element));
		System.out.println("==========================");
		insertionSort(element, (e1, e2) -> {
			return e1 - e2;
		});
		System.out.println("InsertionSort --> " + Arrays.toString(element));
	}
	
	// problem solving --> logic, business --> mindset
	// algorithm --> learn theory

	public static void insertionSort(int[] input, ComparableStrategy cs) {
		for (int round = 1; round < input.length; round++) {
			for (int i = 0; i < round; i++) {
				if (input[i] > input[round]) {
					ArrayUtils.swap(input, i, round);
				}
			}
		}
	}
}
