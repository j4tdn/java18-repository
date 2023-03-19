package sorting.primitive;

import java.util.Arrays;

/**
 * Sắp xếp nổi bọt
 * 
 * @author VIET TAY
 *
 */
public class Ex01BubbleSort {
	public static void main(String[] args) {
		int[] elements = { 1, 9, 5, 8, 4, 12 };
		System.out.println("elements --> " + Arrays.toString(elements));

		System.out.println("\n==================\n");
		bubbleSort(elements);
		System.out.println("elements sorted asc --> " + Arrays.toString(elements));

	}

	// default: acs (tăng dần)
	public static void bubbleSort(int[] input) {
		for (int round = 0; round < input.length; round++) {
			for (int i = 0; i < input.length - round - 1; i++) {
				// asc: input[i] > input[i+1] --> true
				// desc: input[i] < input[i+1] --> true
				// input[i] - input[i+1] > 0
				// 2 phần tử kề nhau sẽ hoán vị khi cs.compare(input[i], input[i+1]) > 0)
				// người dùng tự xử lí hàm compare với phần tử thứ i và i + 1
				if (input[i] > input[i + 1]) {
					int tmp = input[i];
					input[i] = input[i + 1];
					input[i + 1] = tmp;
				}
			}

		}
	}
}
