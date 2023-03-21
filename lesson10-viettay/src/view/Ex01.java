package view;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Bài 1: Tạo mảng số nguyên ngẫu nhiên gồm n phần tử. Viết các phương thức:
 * Loại bỏ những phần tử trùng nhau VD: {1,2,3,4,3,1} Kết quả: {2,4} So sánh giá
 * trị trung bình của n/2 phần tử đầu tiên với n/2 phần tử cuối cùng Tìm số lớn
 * thứ 3 trong mảng. Lưu ý trường hợp các phần tử lớn nhất trùng nhau VD: {7 8 8
 * 8 6 2 5 1} Kết quả: 6
 */
public class Ex01 {
	public static void main(String[] args) {
		int[] n1 = { 1, 2, 3, 4, 3, 1 };
		int[] n2 = { 1, 7, 3, 4, 5, 3, 1 };
		int[] n3 = { 7, 8, 8, 8, 6, 2, 5, 1 };
		test1(n1);
		test2(n2);
		test3(n3);
	}

	private static void test1(int[] numbers) {
		HashSet<Integer> uniqueElements = new HashSet<>();
		HashSet<Integer> nonUniqueElements = new HashSet<>();
		for (int number : numbers) {
			if (uniqueElements.contains(number)) {
				uniqueElements.remove(number);
				nonUniqueElements.add(number);
			} else if (!nonUniqueElements.contains(number)) {
				uniqueElements.add(number);
			}
		}
		System.out.println("1. Các phần tử duy nhất: \n" + uniqueElements);
	}

	private static void test2(int[] numbers) {
		double avg1 = 0.0d;
		double avg2 = 0.0d;
		int n = numbers.length / 2;
		for (int i = 0; i < n; i++) {
			avg1 += numbers[i];
		}
		if (numbers.length % 2 != 0) {
			n = n + 1;
		}
		for (int i = n; i < numbers.length; i++) {
			avg2 += numbers[i];
		}
		System.out.println("2. So sánh giá trị trung bình của n/2 phần tử đầu tiên với n/2 phần tử cuối cùng: ");
		if ((avg1 / n - avg2 / n) > 0) {
			System.out.println("avg1 " + " > " + " avg2");
		} else if ((avg1 / n - avg2 / n) < 0) {
			System.out.println("avg1 " + " < " + " avg2");
		} else {
			System.out.println("avg1 " + " = " + " avg2");
		}
	}

	private static void test3(int[] numbers) {
		Arrays.sort(numbers);
		HashSet<Integer> hashSet = new HashSet<>();
		for (int i = numbers.length - 1; i >= 0; i--) {
			hashSet.add(numbers[i]);
			if (hashSet.size() == 3) {
				break;
			}
		}
		int lastElement = 0;
		Iterator<Integer> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			lastElement = iterator.next();
			break;
		}
		System.out.println("3. Số lớn thứ 3 trong mảng: \n" + lastElement);
	}

}