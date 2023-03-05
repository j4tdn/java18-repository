package Utils;

public class ArrayUtils {
	public ArrayUtils() {
		// TODO Auto-generated constructor stub
	}
	public static void swap(int[] input, int pivot , int i ) {
		int tmp = input[pivot];
		input[pivot] = input[i];
		input[i] = tmp;
	}
}
