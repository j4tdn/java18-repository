package structure.array;

import java.util.Arrays;

/*
 * 1. Tìm những phần tử lẻ trong mảng số nguyên
 * 		Input: Mảng
 * 		Output: Mảng số lẻ
 */
public class Ex02Filter {
	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 4, 5, 6 };
		int[] odd = findOddNumber(number);
		System.out.println(Arrays.toString(odd));
	}

	private static int[] findOddNumber(int[] elements) {
		int[] oddElement = new int[elements.length];
		int index = 0;
		for (int element : elements) {
			if (element % 2 != 0) {
				oddElement[index] = element;
				index++;
			}
		}
		int[] result = new int[index];
		for(int i = 0;i<index;i++) {
			result[i]=oddElement[i];
		}
		return result;
	}
}
