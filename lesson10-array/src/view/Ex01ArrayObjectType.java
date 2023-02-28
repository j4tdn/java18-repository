package view;

import java.util.Arrays;

public class Ex01ArrayObjectType {
	public static void main(String[] args) {
		// Mảng là KDL đối tượng --> Giá trị lưu trữ ở heap
		// Mỗi phần tử có thể là KDL nguyên thủy int[]
		// 						 KDL đối tượng Item[]
		
		int[] numbers = {1, 2, 3, 4};
		// System.out.println("numbers type: " + numbers.getClass());
		// modify(numbers);
		reverse(numbers);
		System.out.println("numbers : " + Arrays.toString(numbers));
	}
	
	private static void modify(int[] elements) {
		elements[2] = 5;
	}
	
	private static void reverse(int[] elements) {
		for(int i = 0; i < elements.length / 2; i++) {
			int temp = elements[i];
			elements[i] = elements[elements.length - 1 - i];
			elements[elements.length - 1 - i] = temp;
		}
	}
}
