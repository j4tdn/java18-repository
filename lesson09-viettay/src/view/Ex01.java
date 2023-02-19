package view;

import java.util.Arrays;

/**
 * 	Bài 1: Đếm số phần tử chung
	Cho 2 mảng số nguyên đơn điệu có cùng số phần tử là n (4 < n < 40). Viết phương thức tìm số phần
	tử chung của 2 mảng đó
	Example
	Mảng 1: 2 8 9 1 6
	Mảng 2: 2 1 1 8 9
	Output
	1 2 8 9
 * 
 *
 */
public class Ex01 {
	public static void main(String[] args) {
		int[] arr1 = { 2, 8, 9, 1, 6 };
		int[] arr2 = { 2, 1, 1, 8, 9 };
		int[] rs = new int[arr1.length];
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (check(arr1[i], rs)) {
					continue;
				}
				if (arr1[i] == arr2[j]) {
					rs[count++] = arr1[i];
				}
			}
		}
		System.out.println("Rs: " + Arrays.toString(Arrays.copyOfRange(rs, 0, count)));
	}

	private static boolean check(int n, int[] number) {
		for (int i = 0; i < number.length; i++) {
			if (number[i] == n) {
				return true;
			}
		}
		return false;
	}
}
