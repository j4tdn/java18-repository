package structure.array;

import java.util.Arrays;

/**
 * 
 * @author PC
 *	
 */
public class Ex02Filter {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9};
//		for(int number : findOddNumbers(numbers)) {
//			System.out.println(number + " ");
//		}
		System.out.println(Arrays.toString(findOddNumbers(numbers)));
	}
	
	private static int[] findOddNumbers(int[] numbers) {
		int[] preResults = new int[numbers.length];
		int count = 0;
		for(int number : numbers) {
			if(number % 2 != 0) {
				preResults[count++] = number;
			}
		}
		int[] results = new int[count];
		for(int i = 0; i < count; i++) {
			results[i] = preResults[i];
		}
		return results;
	}
}
