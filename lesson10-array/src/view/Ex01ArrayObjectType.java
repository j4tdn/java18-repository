package view;

public class Ex01ArrayObjectType {
	public static void main(String[] args) {
		// Mảng là KDL đối tượng --> giá trị sẽ được lưu trữ ở heap
		// Mỗi phần tử có thể là KDL nguyên thuỷ int[]
		//						 KDL đối tượng Item[]
		int[] numbers = {1, 2, 3, 4};
		System.out.println("number type: " + numbers.getClass());
		reverse(numbers);
		for(int i:numbers) {
			System.out.println(i);
		}
	}
	
	//java pass by value at STACK
	// int[] elements = numbers;
	
	private static void modify(int[] elements) {
		elements[2] = 55;
	}
	
	private static void reverse(int[] elements) {
		for(int i = 0; i < elements.length /2; i++) {
			swap(elements, i, elements.length-i-1);
		}
	}
	
	private static void swap(int[] elements, int i, int swapI) {
		int tmp = elements[i];
		
		elements[i] = elements[swapI];
		elements[swapI] = tmp;
	}

}
