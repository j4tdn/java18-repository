package sorting.object;

/**
 * Sắp xếp mảng đối tượng (1 hoặc nhiều thuộc tính)
 * Yêu cầu: phần tử trong mảng Object --> (VD: String,...) cần implement từ Comparable
 * và override hàm compareTo --> nếu không sẽ quăng exception
 */

import java.util.Arrays;

public class Ex02QuickSort_JavaSingleTypeObject {
	public static void main(String[] args) {
		String[] sequences = { "Anne", "Hello", "Zigo", "Carlo", "Beta" };
		System.out.println("sequences: " + Arrays.toString(sequences));

		System.out.println("\n========================================\n");
		
		// Arrays.sort(Object[] object)
		Arrays.sort(sequences);
		System.out.println("sequences sorted: " + Arrays.toString(sequences));
		
	}
}
