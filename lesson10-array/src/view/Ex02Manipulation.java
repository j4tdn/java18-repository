package view;

import java.util.Arrays;

public class Ex02Manipulation {
	public static void main(String[] args) {
		String[] sequences = {"x", "a", "z", "b", "t"};
		System.out.println(Arrays.toString(add(sequences, 5, "t")));
		System.out.println(Arrays.toString(remove(sequences, 1)));
		// Thêm 1 phần tử String có giá trị bất kỳ
		// và vị trị thứ k[0, length) trong mảng sequences
	}
	
	// Add --> shift left to right --> loop right to left a[i] = a[i-1]
	// Remove --> shift right to left --> loop left to right a[i] = a[i+1]
	
	private static String[] add(String[] input, int insertedIndex, String insertedValue) {
		String[] output = new String[input.length + 1];
//      C1:
//		for (int i = 0; i < input.length; i++) {
//			output[i] = input[i];
//		}
//		for (int i = output.length - 1; i >= insertedIndex; i--) {
//			output[i] = output[i - 1];
//		}
//		output[insertedIndex] = insertedValue;
//      C2:
//		for (int i = 0; i < insertedIndex; i++) {
//			output[i] = input[i];
//		}
//		output[insertedIndex] = insertedValue;
//		for (int i = insertedIndex + 1; i < output.length; i++) {
//			output[i] = input[i-1];
//		}
		if (insertedIndex < 0 || insertedIndex > input.length) {
		throw new ArrayIndexOutOfBoundsException("Index is out of bound of input array");
		}
		for(int i = 0; i< output.length; i++) {
			output[i] = i == insertedIndex ? insertedValue : input[i < insertedIndex ? i : i -1];
		}
		return output;
	}

	private static String[] remove(String[] input, int removedIndex) {
		String[] output = new String[input.length - 1];
//		for (int i = 0; i < removedIndex; i++) {
//			output[i] = input[i];
//		}
//		for (int i = removedIndex; i < output.length; i++) {
//			output[i] = input[i + 1];
//		}
		for (int i = 0; i < output.length; i++) {
			output[i] = input[i < removedIndex ? i : i + 1];
		}
		return output;
	}
}