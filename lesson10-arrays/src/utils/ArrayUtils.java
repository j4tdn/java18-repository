package utils;

public class ArrayUtils {
	private ArrayUtils() {
		
	}

	public static void swap(int[] input, int i, int j) {
		int tmp = input[i];
		input[i] = input[j];
		input[j] = tmp;
	}

}
