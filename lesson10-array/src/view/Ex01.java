package view;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		String[] sequences = {"x","a","z","b","t"};
		String[] newarray= add(sequences, 2, "new2023");
		System.out.println(Arrays.toString(newarray));
		String[] NewArray = remove(sequences, 2);
		System.out.println(Arrays.toString(NewArray));
	}

	private static String[] add(String[] input, int insertedIndex, String insertedValue) {
		if (insertedIndex < 0 || insertedIndex > input.length) {
			throw new ArrayIndexOutOfBoundsException("----");
		}
		String[] output = new String[input.length + 1];
		for (int i = 0; i < insertedIndex; i++) {
			output[i] = input[i];
		}
		output[insertedIndex] = insertedValue;
		for (int i = insertedIndex + 1; i < output.length; i++) {
			output[i] = input[i - 1];
		}
		return output;
	}

	private static String[] remove(String[] input, int removedIndex) {
		String[] output = new String[input.length - 1];
		for (int i = 0; i < output.length; i++) {
			output[i] = input[i < removedIndex ? i : i + 1];
		}
		return output;

	}
}
