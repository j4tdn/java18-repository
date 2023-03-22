package sorting;

import java.util.Arrays;

import functional.interfface.CompareableStrategy;

public class Ex01BubbleSory {
	
	public static void main(String[] args) {
		int[] elements = {1,9,5,4,8,2,12,39,1,1,0,29};
		
		/*
		bubbleSort(elements, (e1,e2) -> {
			return (e1 - e2)*-1;
		}); */
		SelectionSort(elements);
		
		System.out.println("Bubble sort: " + Arrays.toString(elements));
	}
	public static void bubbleSort(int[] input, CompareableStrategy cs) {
		
		for (int round = 0; round < input.length; round++) {
			
			for (int i = 0; i < input.length - round -1; i++) {
				if (cs.compare(input[i], input[i+1]) > 0) {
					int tmp = input[i];
					input[i] = input[i+1];
					input[i+1] = tmp;
				}
			}
		}
	}
	public static void SelectionSort(int[] input) {
		for (int i = 0; i < input.length; i++) {
			int min_index = i;
			for (int j = i+1; j < input.length; j++) {
				if (input[j] < input[min_index]) {
					min_index = j;
				}
			}
			int temp = input[min_index];
			input[min_index] = input[i]; 
			input[i] = temp;
		}
	}
}
