package utils;

public class ArrayUtils {
	private ArrayUtils() {
		
	}
	
	public static void swap(int[] input, int a, int b) {
		int temp = input[a];
		input[a] = input[b];
		input[b] = temp;
	}
}
