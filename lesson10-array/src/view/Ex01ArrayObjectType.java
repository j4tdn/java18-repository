package view;

import java.util.Arrays;

public class Ex01ArrayObjectType {
	public static void main(String[] args) {
		// Mảng là KDL đối tượng --> giá trị sẽ được lưu trữ ở heap
		// Mỗi phần tử có thể là KDL nguyên thủy int[]
		// 					     KDL đối tượng Item[]

		int[] numbers = { 1, 2, 3, 4 }; // H1
		System.out.println("numbers type: " + numbers.getClass());
		modify(numbers);
		reverse(numbers);
		System.out.println("numbers: " + Arrays.toString(numbers));
	}
	
	// java pass by value at STACK
	// int[] elements = numbers; // H1
	private static void modify(int[] elements) {
		elements[2] = 55;
	}
	
	// 0 1 2 3 4 (length = 5)
	// a b c d e --> 0 --> <2  = length/2  a[0]-a[4]  a[1]-a[3] swap(i, length-i-1)
	// a b c d   --> 0 --> <2  = length/2
	private static void reverse(int[] elements) {
		int length = elements.length;
		for (int i = 0; i < elements.length / 2; i++) {
			swap(elements, i, length - i - 1);
		}
	}
	
	private static void swap(int[] elements, int i, int swapI) {
		int tmp = elements[i];
		elements[i] = elements[swapI];
		elements[swapI] = tmp;
	}
}