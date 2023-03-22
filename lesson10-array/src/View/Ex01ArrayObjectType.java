package View;

import java.util.Arrays;

public class Ex01ArrayObjectType {
	public static void main(String[] args) {
		//Mảng là KDL đối tượng
		//MỖi phần tử có thể là KDL nguyên thuỷ int[]
		//						KDL đói tượng  item[]
		int[] numbers = {1,2,3,4};
		System.out.println("number type : "+ numbers.getClass());
		modify(numbers);
		revers(numbers);
		System.out.println(Arrays.toString(numbers));
		
	}
	private static void modify(int[] elements) {
		elements[2] = 55;
	}
	private static void revers(int[] elements) {
		int length= elements.length;
		for(int i = 0; i<length/2;i++) {
			swap(elements,i,length-i-1);
		}
	}
	private static void swap(int[] elements,int i ,int swapI) {
		int tmp = elements[i];
		 elements[i] = elements[swapI];
		 elements[swapI] = tmp;
	}
}
