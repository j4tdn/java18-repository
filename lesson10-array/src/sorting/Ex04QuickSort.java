package sorting;

import java.util.Arrays;

public class Ex04QuickSort {
	public static void main(String[] args) {
		int[] elements = {1, 9, 5, 8, 4, 12};
		// selectionSort(elements, (e1, e2) -> e1 - e2);
		
		Arrays.sort(elements);
		System.out.println(Arrays.toString(elements));
	}
	
	
}
