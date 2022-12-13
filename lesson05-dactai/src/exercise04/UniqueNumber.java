package exercise04;

import java.util.Iterator;

public class UniqueNumber {
	public static void main(String[] args) {
		int[] numbers = { 3, 15, 21, 0, 15, 17, 21 , 1, 1};
		sort(numbers);
		print(numbers);
		System.out.println();
		print(getUniqueNumbers(numbers));
	}

	public static void sort(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] >= numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
	}

	public static void print(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
	
	public static int[] getUniqueNumbers(int[] numbers) {
		int[] temp = new int[numbers.length];
		int index = 1;
		temp[0] = numbers[0];
		for(int i = 1; i < numbers.length - 1; i++) {
			if((numbers[i+1] == numbers[i]) || (numbers[i-1] == numbers[i])) {
				continue;
			}
			temp[index] = numbers[i];
			index++;
			
			
		}
		
		int[] result = new int[index];
		for(int i = 0; i < result.length; i++) {
			result[i] = temp[i];
		}
		
		return result;
	}
}
