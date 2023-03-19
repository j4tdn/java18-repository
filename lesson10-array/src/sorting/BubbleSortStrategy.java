package sorting;

import java.util.Arrays;

import functional.interfaces.CompareStrategy;

public class BubbleSortStrategy {
	public static void main(String[] args) {
		int[] elements = {1, 9, 5, 8, 4, 12};
		bubbleSort(elements, (e1, e2) -> {
			return e1 - e2;
		});
		System.out.println(Arrays.toString(elements));
		
	}
	
	public static void bubbleSort(int[] input, CompareStrategy<Integer> cs) {
		for(int round = 0; round < input.length; round++) {
			for(int i = 0; i < input.length - round - 1; i++) {
				if(cs.compare(input[i], input[i+1]) < 0) {
					int temp = input[i];
					input[i] = input[i+1];
					input[i+1] = temp;
				}
			}
		}
	}
}
