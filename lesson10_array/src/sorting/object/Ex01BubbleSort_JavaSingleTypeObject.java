package sorting.object;

import java.util.Arrays;
import java.util.Comparator;	

/*
 * Applies for String, Integer, Character, Double, Boolean
 */
public class Ex01BubbleSort_JavaSingleTypeObject {
	private static final int NEGATIVE = -1;
	private static final int POSITIVE = 1;
	private static final int ZERO = 0;
	public static void main(String[] args) {
		String[] elements = {"DocNet","Java",null,"Javascript","PHP",null,"PyThon","C++"};
		System.out.println(Arrays.toString(elements));
		System.out.println("==============");
		bubbleSort(elements,(s1, s2) -> {
			// 1 --> sort for null elements
			//   + null first --> null < non-null elements --> swap >
			//   + null last  --> null > non-null elements --> swap ?z
			if (s1 == null && s2 != null) { // s2 = null || s2 != null
				return POSITIVE;
			}
			// s1 != null
			if (s2 == null) {
				return NEGATIVE;
			}
			// s1 != null, s2 != null
			// 2 --> sort for non-null elements
			return s1.compareTo(s2);
		});
		System.out.println(Arrays.toString(elements));
	}
	public static void bubbleSort(String[] input, Comparator<String> comparator) {
		for (int round = 0; round < input.length; round++) {
			for (int i = 0; i < input.length - round - 1; i++) {
				if (comparator.compare(input[i], input[i + 1]) > 0) {
					String tmp = input[i];
					input[i] = input[i + 1];
					input[i + 1] = tmp;
				}
			}
		}
	}
	// default: ascending
	public static void bubbleSort(String[] input) {
		for (int round = 0; round < input.length; round++) {
			for (int i = 0; i < input.length - round - 1; i++) {
				// input[i] --> int    ---> input[i] > input[i + 1]
				// input[i] --> String ---> input[i].compareTo(input[i + 1]) > 0
				// Lấy từng kí tự trong input i và i+1 value đi so sánh với nhau
				// Nếu có 1 phần tử tại vị trí x bất kỳ ko bằng nhau --> trả về kết quả
				if(input[i].compareTo(input[i+1]) > 0) {
					String tmp = input[i];
					input[i] = input[i+1];
					input[i+1] =tmp;
				}
			}
		}
	}
}
