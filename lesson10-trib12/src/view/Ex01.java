package view;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Ex01 {
	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 3, 1 };
		int[] B = { 1, 7, 3, 4, 5, 3, 1 };
		int[] C = { 7, 8, 8, 8, 6, 2, 5, 1 };
		remove(A);
		compare(B);
		max3(C);
	}

	private static void remove(int[] numbers) {
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
		System.out.println("Các phần tử không trùng nhau "+ uniqueElements);
	}

	private static void compare(int[] numbers) {
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
		System.out.println("So sánh giá trị trung bình của n/2 phần tử đầu tiên với n/2 phần tử cuối cùng: ");
		if ((avg1 / n - avg2 / n) > 0) {
			System.out.println("avg1 " + " > " + " avg2");
		} else if ((avg1 / n - avg2 / n) < 0) {
			System.out.println("avg1 " + " < " + " avg2");
		} else {
			System.out.println("avg1 " + " = " + " avg2");
		}
	}

	private static void max3(int[] numbers) {
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
		System.out.println("Số lớn thứ 3 trong mảng: " + lastElement);
	}
	

}
