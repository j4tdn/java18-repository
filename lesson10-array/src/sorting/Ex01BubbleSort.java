package sorting;

import java.util.Arrays;

public class Ex01BubbleSort {
	public static void main(String[] args) {
		int[] elements = {1, 9, 5, 8, 4, 12};
		bubbleSort(elements);
		System.out.println(Arrays.toString(elements));
	}
	
	public static void bubbleSort(int[] input) {
		for(int round = 0; round < input.length; round++) {
			for(int i = 0; i < input.length - round - 1; i++) {
				if(input[i] > input[i+1]) {
					int temp = input[i];
					input[i] = input[i+1];
					input[i+1] = temp;
				}
			}
		}
	}
}
