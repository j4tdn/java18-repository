package structure;

import java.util.Arrays;

public class Ex02Filter {
	/*
	 * 1. Tìm những phần tử lẻ trong mảng số nguyên
	 *	  Input: Mảng
	 *	  Output: Mảng số lẻ
	 * */

	public static void main(String[] args) {
		int[] numbers = {2,1,3,6,4,7,11,3,8,9};
		int[] oddNumbers = findOddNumbers(numbers);
		System.out.println(Arrays.toString(oddNumbers));

	}
	
	private static int[] findOddNumbers(int[] numbers) {
		int[] oddElements = new int[numbers.length];
		int count = 0;
		for(int number:numbers) {
			if(number % 2 == 1) {
				oddElements[count] = number;
				count++;
			}
		}
		int[] result = new int[count];
		for(int i = 0; i < count; i++) {
			result[i] = oddElements[i];
		}
		return result;
	}

}
