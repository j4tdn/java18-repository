package view;

import java.util.Arrays;

/**
 * ADD >> METHOD 2
 * B1: Copy to new array
 * B2: Loop elements in "output" array [0, length)
 *  + if i == insertedIndex --> output[i] = insertedValue
 *  + if i < insertedIndex  --> output[i] = input[i]
 *  + if i > insertedIndex  --> output[i] = input[i-1]
 *  ------------------------------
 *  REMOVE >> METHOD 2 (HIGHLY RECOMMEND)
 *  Create a new array with length = preSizeLength - 1;
 *  loop from i=0 -> i<removedIndex --> output[i] = input[i]
 *  loop from i = remmovedIndex -> i < output.length --> output[i] = input[i+1]
 */

public class Ex02ManipulationMethod2 {
	public static void main(String[] args) {
		String[] sequences = {"x", "a", "z", "b", "t"};
		String[] newAddedArray = add(sequences, 0, "v");
		System.out.println("After inserting (M2) --> " + Arrays.toString(newAddedArray));
		
		String[] newRemovedArray = remove(sequences, 2);
		System.out.println("After removing (M2) --> " + Arrays.toString(newRemovedArray));
		
	}
	
	// Thêm một phần tử String có giá trị bất kỳ vào vị trí k[0, length) trong mảng sequences
	// Sau khi add --> ko làm thay đổi origin array 
	// --> cần tạo new array --> viết hàm add() trả về String[]
	// insertedIndex = 2 
	private static String[] add(String[] input, int insertedIndex, String insertedValue) {
		String[] output = new String[input.length + 1];

		// B1
		for (int i = 0; i < input.length; i++) {
			output[i] = input[i];
		}

		// B2
		for (int i = 0; i < output.length; i++) {
			if (i == insertedIndex) {
				output[i] = insertedValue;
			}
			if (i < insertedIndex) {
				output[i] = input[i];
			}
			if (i > insertedIndex) {
				output[i] = input[i - 1];
			}
		}
		return output;
	}
	
	private static String[] remove(String[] input, int removedIndex) {
		String[] output = new String[input.length - 1];

		for (int i = 0; i < removedIndex; i++) {
			output[i] = input[i];
		}

		for (int i = removedIndex; i < output.length; i++) {
			output[i] = input[i + 1];
		}

		return output;
	}
}