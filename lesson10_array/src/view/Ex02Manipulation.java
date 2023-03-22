package view;

import java.util.Arrays;

public class Ex02Manipulation {
	public static void main(String[] args) {
		String[] sequences = {"x", "a", "z", "b", "t"};

		// Thêm 1 phần tử String có giá trị bất kỳ
		// và vị trị thứ k[0, length) trong mảng sequences
		String[] newAddedResuft = add(sequences, 2, "NEW 2023");
		String[] newRemovedResuft = remove(sequences, 3);
		System.out.println("newAddedResuft --> " + Arrays.toString(newAddedResuft));
		System.out.println("newRemovedResuft --> " + Arrays.toString(newRemovedResuft));
		
		
		
	}

	private static String[] add(String[] input, int insertedIndex, String insertedValue) {
		if (insertedIndex < 0 || insertedIndex > input.length) {
			throw new ArrayIndexOutOfBoundsException("Index is out of bound of input array");
		}
		
		String[] output = new String[input.length + 1];

		for (int i = 0; i < insertedIndex; i++) {
			output[i] = input[i];
			
		}
		
		output[insertedIndex] = insertedValue;
		for ( int i = insertedIndex + 1; i < output.length; i++) {
			output[i] = input[i - 1];
		}
		return output;
	}

	private static String[] remove(String[] input, int removedIndex) {
		String[] output = new String[input.length - 1];

		// 
		for (int i = 0; i < output.length; i++) {
			output[i] = input[i < removedIndex ? i : i+1];
		}

		return output;
	}
}