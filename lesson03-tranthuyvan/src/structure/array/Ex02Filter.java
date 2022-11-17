package structure.array;

import java.util.Arrays;

/**
 * Tìm những phần tử lẻ trong mảng số nguyên
 * Input (parameter): Mảng 
 * Output (return type): Mảng số lẻ
 */

public class Ex02Filter {
	public static void main(String[] args) {
		int[] numbers = { 23, 25, 16, 33, 16 };
		int[] oddNumbers = findOddNumbers(numbers);
		// System.out.println(oddNumbers); => in ra địa chỉ ô nhớ
		System.out.println(Arrays.toString(oddNumbers));
	}

	// Hàm tìm số lẻ
	// int[] elements = numbers;
	private static int[] findOddNumbers(int[] elements) {
		// Tạo một mảng để chứa số lẻ (chứa các element số lẻ sau khi duyệt xong)
		// Độ dài tối đa của mảng => elements.length
		// index: 0 1 2 3 4
		// value: 23 25 33 0 0
		// count: 0 1 2 => số lượng phần tử lẻ
		int[] oddElements = new int[elements.length];
		int count = 0;
		for (int element : elements) {
			if (element % 2 != 0) {
				oddElements[count] = element;
				count++;
			}
		}

		// KQ: 23 25 33 0 0 => có vấn đề ở số 0
		// --> 23 25 33
		// Độ dài length = count (số lượng phần tử lẻ)
		// copy qua mảng mới (result)
		int[] result = new int[count];
		for (int i = 0; i < count; i++) {
			result[i] = oddElements[i];
		}

		return result;
	}

}
