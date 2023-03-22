package utils;

public class ArrayUtils {
	public ArrayUtils() {
		// TODO Auto-generated constructor stub
	}
	public static void swap(int[] input, int i ,int j) {
		int tmp = input[i];
		input[i] = input[j];
		input[j] = tmp;
	}
}
