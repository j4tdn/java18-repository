package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Applies for String, Integer, Character, Double, Boolean
 * Áp dụng cho KDL đối tượng chỉ có 1 thuộc tính bên trong của JAVA
 * 
 * Vì sao không thể dùng toán tử ">" "<" trong String?
 * --> String là KDL đối tượng -> chứa rất nhiều thông tin (thuộc tính) bên trong 
 * --> không biết so sánh thông tin nào 
 * 
 * input[i] --> int --> input[i] > input[i+1]
 * input[i] --> String --> input[i].compareTo(input[i+1]) > 0
 * Lấy từng ký tự trong input i và i+1 value đi so sánh với nhau 
 * Nếu có 1 phần tử tại vị trí x bất kỳ ko bằng nhau --> trả về kết quả
 * 
 * So sánh giá trị của 2 phần tử [String] trong mảng --> sử dụng hàm compareTo
 * --> xử lý NullPointerException (NPE) --> nullFirst, nullLast
 */

public class Ex01BubbeSort_JavaSingleTypeObject {
	private static final int NEGATIVE = -1;
	private static final int POSITIVE = 1;
	private static final int ZERO = 0;
	
	
	public static void main(String[] args) {
		String[] sequences = {"Anne", null, "Hello", "Zigo", null, "Carlo", "Beta"};		
		System.out.println("sequences: " + Arrays.toString(sequences));
		
		System.out.println("\n========================================\n");
		
		/*
		 * 1. Sort for null elements
		 *  + Null first --> null < non-null elements --> no swap
		 *  + Null last  --> null > non-null elements --> no swap
		 * 2. sort for non-null elements
		 */
		bubbleSort(sequences, (s1, s2) -> {
			// 1
			if (s1 == null && s2 != null) {
				return POSITIVE; // > 0 --> swap
			}

			if (s2 == null) { // here --> certainly s1 != null
				return NEGATIVE; // < 0 --> no Swap
			}
			// 2
			return s1.compareTo(s2);
		});
		System.out.println("sequences sorted: " + Arrays.toString(sequences));			
	}
	
	// Comparator<String> (JAVA available function) <=> ComparableStrategy (manual function) --> int compare(String s1, String s2)
	// Bubble sort support asc/desc
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
	
	/*
	public static void bubbleSort(String[] input) {
		for (int round = 0; round < input.length; round++) {
			for (int i = 0; i < input.length - round - 1; i++) {
				if (input[i].compareTo(input[i + 1]) > 0) {
					String tmp = input[i];
					input[i] = input[i + 1];
					input[i + 1] = tmp;
				}
			}
		}
	}
	*/
}