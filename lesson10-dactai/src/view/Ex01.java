package view;

import java.util.Arrays;

import common.SortOrder;
import util.ArrayUtils;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = { 1, 9, 7, 9, 9, 2, 3, 4, 3, 1, 7 };
		int[] result = removeDuplicate(numbers);
		System.out.println(Arrays.toString(result));

		compare(numbers);
		findThirdMaxNumber(numbers);
	}

	private static int[] removeDuplicate(int[] numbers) {
		int[] removed = new int[numbers.length];
		int count = 0;
		ArrayUtils.sort(numbers, SortOrder.ASC);

		for (int i = 0; i < numbers.length; i++) {

			if (i == 0) {
				if (numbers[0] != numbers[1]) {
					removed[count++] = numbers[0];
				}
			} else if (i == numbers.length - 1) {
				if (numbers[i] != numbers[i - 1]) {
					removed[count++] = numbers[i];
				}
			} else {
				if (numbers[i] != numbers[i - 1] && numbers[i] != numbers[i + 1]) {
					removed[count++] = numbers[i];
				}
			}
		}

		System.out.println(Arrays.toString(numbers));

		return Arrays.copyOfRange(removed, 0, count);
	}

	private static void compare(int[] numbers) {
		float mean1 = 0;
		float mean2 = 0;
		int length = numbers.length;
		if (length % 2 == 0) {
			for (int i = 0; i < length; i++) {
				if (i < length / 2) {
					mean1 += numbers[i];
				} else {
					mean2 += numbers[i];
				}
			}
			mean1 /= (length / 2);
			mean2 /= (length / 2);
		} else {
			for (int i = 0; i < length; i++) {
				if (i < Math.floor(length / 2)) {
					mean1 += numbers[i];
				} else if (i > Math.floor(length / 2)) {
					mean2 += numbers[i];
				}
			}
			mean1 /= Math.floor(length / 2);
			mean2 /= Math.floor(length / 2);
		}
		if (mean1 > mean2) {
			System.out.println("Trung bình cộng cảu n/2 phần tử đầu lớn hơn n/2 phần tử sau");
		} else if (mean1 == mean2) {
			System.out.println("Trung bình cộng cảu n/2 phần tử đầu bằng n/2 phần tử sau");
		} else {
			System.out.println("Trung bình cộng cảu n/2 phần tử đầu nhỏ hơn n/2 phần tử sau");
		}
	}

	private static void findThirdMaxNumber(int[] numbers) {
		ArrayUtils.sort(numbers, SortOrder.DESC);
		System.out.println(Arrays.toString(numbers));
		int count = 0;
		int thirdMax = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (count == 2 ) {
				break;
			}
			if (numbers[i + 1] != numbers[i]) {
				count++;
				thirdMax = numbers[i+1];
			}
		}

		System.out.println("Số lớn thứ 3 là: " + thirdMax);
	}

}
