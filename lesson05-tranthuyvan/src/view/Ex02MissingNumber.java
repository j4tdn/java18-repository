package view;

/**
 * Cho mảng A gồm n-1 phần tử không trùng nhau, giá trị của mỗi phần
 * tử trong mảng, Ak = [1, n].
 * Tìm số nguyên còn lại trong khoảng [1, n] không tồn tại trong mảng A.
 * VD1: n = 6, Ak = [3, 2, 1, 6, 5]
 * Phần tử cần tìm có giá trị: 4
 * VD2: n = 10, Ak = [3, 7, 9, 2, 1, 6, 5, 4, 10]
 * Phần tử cần tìm có giá trị: 8
 * Method signature: int getMissingNumber(...)
 */

public class Ex02MissingNumber {
	public static void main(String[] args) {
		int[] numbers = { 3, 7, 9, 2, 1, 6, 5, 4, 10 };
		System.out.println("Missing number is --> " + getMissingNumber(numbers));

	}

	private static int getMissingNumber(int[] numbers) {
		// Step 1: Find maximum number
		int n = numbers.length + 1;

		// Step 2: Calculate sum of array which contains all elements [1-10]
		int sum = n * (n + 1) / 2;

		// Step 3: Calculate sum of array which have a missing element
		int sumOfElement = 0;
		for (int number : numbers) {
			sumOfElement += number;
		}
		return sum - sumOfElement;
	}

}
