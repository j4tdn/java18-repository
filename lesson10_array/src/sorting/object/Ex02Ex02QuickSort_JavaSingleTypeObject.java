package sorting.object;

import java.util.Arrays;

public class Ex02Ex02QuickSort_JavaSingleTypeObject {
	public static void main(String[] args) {
		String[] sequences = { "anne", "hello", "zigo", "carlo", "beta" };
		System.out.println("sequences: " + Arrays.toString(sequences));

		System.out.println("\n=======================\n");
		
		// Arrays.sort(Object[] objects);
		
		// Sắp xếp mảng đối tượng(1 hoặc nhiều thuộc tính)
		// Yêu cầu: phần tử trong mảng Object --> String implements từ Comparable
		// và override hàm compareTo --> nếu k --> quăng exception
		Arrays.sort(sequences,(s1,s2)->s2.compareTo(s1));
		System.out.println("sequences sorted: " + Arrays.toString(sequences));
		
		// null, desc
	}
}
