package View;

import java.util.Arrays;

public class Ex02Manipulation {
	public static void main(String[] args) {
		String[] sequences = { "x", "a", "z", "b", "t" };

		String[] newAddedResult = add(sequences, 2, "new 2022");
		System.out.println("newAddedResult ==> " + Arrays.toString(newAddedResult));
		String[] newRemoveResult = remove(sequences, 0);
		System.out.println("newRemoveResult ==> " + Arrays.toString(newRemoveResult));
	}

	private static String[] add(String[] input, int insertIndex, String insertedValue) {
		if (insertIndex < 0 || insertIndex > input.length) {
			throw new ArrayIndexOutOfBoundsException("Index is out of input array");
		}

		String[] output = new String[input.length + 1];
		for (int i = 0; i < insertIndex; i++) {
			output[i] = input[i];
		}
		output[insertIndex] = insertedValue;
		for (int j = insertIndex + 1; j < output.length; j++) {
			output[j] = input[j - 1];
		}
		return output;
	}

	private static String[] remove(String[] input, int removeIndex) {
		if (removeIndex < 0 || removeIndex >= input.length) {
			throw new ArrayIndexOutOfBoundsException("Index is out of input array");
		}

		String[] output = new String[input.length - 1];
		for (int i = 0; i < output.length; i++) {
			if (i < removeIndex) {
				output[i] = input[i];
			} else {
				output[i] = input[i + 1];
			}

		}

		return output;
	}
}
