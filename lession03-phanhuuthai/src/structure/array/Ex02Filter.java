package structure.array;

import java.sql.Array;
import java.util.Arrays;

/**
 * 
 * 1. Tìm những phần từ lẻ trong mảng số nguyên
 * 	Input(Prameter): Mảng
 * 	Output(return type): Mảng số l
 */

public class Ex02Filter {
	public static void main(String[] args) {
		int[] numbers = { 23, 25, 16, 33, 16 };
		int[] oddNumbers = findOddNumbers(numbers);
		System.out.println(Arrays.toString(oddNumbers));
	}
	
	private static int[] findOddNumbers(int[] elements) {
		int[] oddElemens = new int[elements.length];
		int count = 0;
		for(int element: elements) {
			if(element % 2 !=0) {
				oddElemens[count] = element;
				count++;
			}
		}
		int[] result = new int[count];
		for(int i = 0; i < count; i++) {
			result[i] = oddElemens[i];
		}
		
		return result;
	}
}
