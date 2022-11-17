package array;

import java.util.Arrays;

/**
 * 
 * 1. Tìm những phần tử lẻ trong mảng số nguyên
 * 2
 *
 */
public class Ex02Filter {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		System.out.println(Arrays.toString(findOddNumbers(numbers)));
	}

	private static int[] findOddNumbers(int[] numbers) {
		int[] oddNumbers = new int[numbers.length];
		int count = 0;
//		for(int i = 0; i < numbers.length; i++) {
//			if(numbers[i]%2!=0) {
//				oddNumbers[count] = numbers[i];
//				count++;
//			}
//		}
//		return oddNumbers;
		for (int number : numbers) {
			if (number % 2 != 0) {
				oddNumbers[count] = number;
				count++;
			}
		}
		int[] resultt = new int[count];
		for(int i = 0; i < count; i++) {
			resultt[i] = oddNumbers[i];
		}
				return resultt;
	}

}
