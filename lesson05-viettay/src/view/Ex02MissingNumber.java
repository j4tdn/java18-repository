package view;
/**
 *  Bài 2: Cho mảng A gồm n-1 phần tử không trùng nhau, giá trị của mỗi phần
	tử trong mảng, Ak = [1, n].
	Tìm số nguyên còn lại trong khoảng [1, n] không tồn tại trong mảng A.
	 VD1: n = 6, Ak = [3, 2, 1, 6, 5]
	 Phần tử cần tìm có giá trị: 4
	 VD2: n = 10, Ak = [3, 7, 9, 2, 1, 6, 5, 4, 10]
	 Phần tử cần tìm có giá trị: 8
 *
 */
public class Ex02MissingNumber {
	public static void main(String[] args) {
		int n = 6;
		int[] numbers = { 3, 2, 1, 6, 5 };
		System.out.println("Missing element: " + getMissingNumber(numbers, n));
	}

	private static int getMissingNumber(int[] numbers, int n) {
		int sumAll = n * (n + 1) / 2;
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sumAll - sum;
	}
}
