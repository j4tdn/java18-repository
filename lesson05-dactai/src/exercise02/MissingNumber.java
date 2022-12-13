package exercise02;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		int[] A = {3, 2, 1, 6, 5};
		int[] B = {3, 7, 9, 2, 1, 6, 5, 4, 10};
		
		
		System.out.println(getMissingNumber(A));
		System.out.println(getMissingNumber(B));
	}
	
	public static int getMissingNumber(int[] numbers) {
		int result = 0;
		for(int i = 1; i <= numbers.length + 1; i++) {
			result+=i;

		}
		for(int i = 0; i < numbers.length;i++) {
			result -= numbers[i];
		}
		return result;
	}

}
