package view;

import java.util.Arrays;

public class Ex02Manipulation {
	public static void main(String[] args) {
		String[] sequences = { "x", "a", "b", "z", "t" };
		String[] result = add(sequences, "p", 2);
		result = remove(result, 4);
		System.out.println(Arrays.toString(result));
	}

	private static String[] add(String[] input, String value, int index) {
		if (index < 0 || index > input.length) {
			throw new ArrayIndexOutOfBoundsException("Index is out of bound of input array");
		}

		String[] output = new String[input.length + 1];
		for (int i = 0; i < input.length; i++) {
			output[i] = input[i];
		}

		output[index] = value;
		for (int i = index + 1; i < output.length; i++) {
			output[i] = input[i - 1];
		}

		return output;
	}

	private static String[] remove(String[] input, int index) {
		String[] output = new String[input.length - 1];
		for (int i = 0; i < output.length; i++) {
//			if(i < index) {
//				output[i] = input[i];
//			} else {
//				output[i] = input[i+1];
//			}

			output[i] = input[i < index ? i : i + 1];
		}

		return output;
	}

}
