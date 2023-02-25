package view;

import java.util.Arrays;

public class Ex01ArrayObjectType {
	public static void main(String[] args) {
		// Mảng là KDL đối tượng --> giá trị sẽ được lưu trữ ở HEAP
		// Mỗi phần tử có thể là KDL nguyên thủy (VD: int[],...)
		//				 hoặc là KDL đối tượng (VD: Item[],...)
		
		int[] numbers = { 1, 2, 3, 4 };
		System.out.println("numbers type: " + numbers.getClass());
		modify(numbers);
		System.out.println("numbers: " + Arrays.toString(numbers));
		reverse(numbers);
		System.out.println("Reversed array: " + Arrays.toString(numbers));		
	}
	
	// java --> pass by value at STACK
	// int[] elements = numbers; // H1
	private static void modify(int[] elements) {
		elements[2] = 55;
	}

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