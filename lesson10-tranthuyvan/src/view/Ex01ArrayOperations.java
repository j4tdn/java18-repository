package view;

import java.util.Arrays;
import java.util.Random;

/**
 * Tạo mảng số nguyên ngẫu nhiên gồm n phần tử. Viết các phương thức:
 * Loại bỏ những phần tử trùng nhau VD: {1,2,3,4,3,1} Kết quả: {2,4}
 * So sánh giá trị trung bình của n/2 phần tử đầu tiên với n/2 phần tử cuối cùng
 * Tìm số lớn thứ 3 trong mảng. 
 * Lưu ý trường hợp các phần tử lớn nhất trùng nhau VD: {7 8 8 8 6 2 5 1} Kết quả: 6
 */

public class Ex01ArrayOperations {
	public static void main(String[] args) {
		int[] arr = generateRandomArray(10);
		System.out.println("Original array: " + Arrays.toString(arr));

		int[] uniqueEle = removeDuplicates(arr);
		System.out.println("1. New array which contains unique elements: " + Arrays.toString(uniqueEle) + "\n");

		System.out.println("The average value of the first n/2 elements: "
				+ calculateAverage(Arrays.copyOfRange(arr, 0, arr.length / 2)));
		System.out.println("The average value of the last n/2 elements: "
				+ calculateAverage(Arrays.copyOfRange(arr, arr.length / 2, arr.length)));
		System.out.println("2. Compare result" + "\n ↓");
		compareAvg(arr);

		int thirdLargest = findThirdLargest(arr);
		System.out.println("\n3. Third largest element in array: " + thirdLargest);
	}

	public static int[] generateRandomArray(int n) {
		int[] arr = new int[n];
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = random.nextInt(10);
		}
		return arr;
	}

	private static int[] removeDuplicates(int[] arr) {
		int[] newArr = new int[arr.length];
		int index = 0;
		boolean isDuplicate;

		for (int i = 0; i < arr.length; i++) {
			isDuplicate = false;
			for (int j = 0; j < index; j++) {
				if (arr[i] == arr[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				newArr[index++] = arr[i];
			}
		}

		int[] result = Arrays.copyOfRange(newArr, 0, index);

		return result;
	}

	private static double calculateAverage(int[] arr) {
		int len = arr.length;
		double sum = 0;
		double average = 0;

		for (int i = 0; i < len; i++) {
			sum += arr[i];
		}

		average = sum / len;
		return average;
	}

	public static void compareAvg(int[] arr) {
		double avgFirstHalf = calculateAverage(Arrays.copyOfRange(arr, 0, arr.length / 2));
		double avgSecondHalf = calculateAverage(Arrays.copyOfRange(arr, arr.length / 2, arr.length));
		if (avgFirstHalf > avgSecondHalf) {
			System.out.println("The average of the first half is greater.");
		}
		if (avgFirstHalf < avgSecondHalf) {
			System.out.println("The average of the second half is greater.");
		} else {
			System.out.println("The averages of the two halves are equal.");
		}
	}

	public static int findThirdLargest(int[] arr) {
		int len = arr.length;

		if (len < 3) {
			System.out.println("Array must have at least three elements!!!");
		}

		// Sort the array in descending order using bubbleSort
		for (int round = 0; round < len - 1; round++) {
			for (int i = 0; i < len - round - 1; i++) {
				if (arr[i] < arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}

		// Iterate each element of the array to find the third largest number
		int count = 1;
		int thirdLargest = -1;
		for (int i = 0; i < len; i++) {
			if (count == 3) {
				thirdLargest = arr[i];
				break;
			}
			if (i < len - 1 && arr[i] != arr[i + 1]) {
				count++;
			}
		}
		return thirdLargest;
	}
}