package view;

import java.util.Arrays;

public class Ex01ArrayObjectType {
	public static void main(String[] args) {
		// Mảng là KDL đối tượng --> giá trị sẽ được lưu trữ ở heap
		// Mỗi phần tử có thể là KDL nguyên thủa int[]
		// 						 KDL đối tượng 	 Item[]
		
		int[] numbers = {1, 2, 3, 4};
		
		System.out.println("number type: " + numbers.getClass());
		modify(numbers);
		System.out.println("numbers: " + Arrays.toString(numbers));
		reverse(numbers);
		System.out.println("reverse: " + Arrays.toString(numbers));
	}
	
	private static void modify(int[] elements) {
		elements[2] = 55;
	}
	
	private static void reverse(int[] elements) {
		int length = elements.length;
		for(int i = 0; i < length/2; i++) {
			swap(elements, i, length - i - 1);
		}
	}
	
	private static void swap(int[] elements, int i, int swapI) {
		int temp = elements[i];
		elements[i] = elements[swapI];
		elements[swapI] = temp;
	}
}

