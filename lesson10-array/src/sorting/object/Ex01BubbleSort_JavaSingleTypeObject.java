package sorting.object;

import java.util.Arrays;

import functional.interfaces.CompareStrategy;

/**
 * String, Integer, Character, Double, Boolean
 * 
 * */

public class Ex01BubbleSort_JavaSingleTypeObject {
	public static void main(String[] args) {
		String[] sequences = {"anne", "hello", "zigo", "carlo", "beta"};
		System.out.println("sequences --> " + Arrays.toString(sequences));
		
		System.out.println("================================");
		
		bubbleSort(sequences, (e1, e2) -> {
			if(e1 == null && e2 != null) {
				return -1;
			}
			if(e2 == null) {
				return 1;
			}
			return e1.compareTo(e2);
		});
		System.out.println("sorted --> " + Arrays.toString(sequences));
	}
	
	public static void bubbleSort(String[] input, CompareStrategy<String> cs) {
		for(int round = 0; round < input.length; round++) {
			for(int i = 0; i < input.length - round - 1; i++) {
				if(cs.compare(input[i], input[i+1]) > 0) {
					String temp = input[i];
					input[i] = input[i+1];
					input[i+1] = temp;
				}
			}
		}
	}
}
