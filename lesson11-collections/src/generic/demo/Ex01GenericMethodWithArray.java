package generic.demo;

import java.time.LocalDate;
import java.util.Arrays;

import bean.Store;

/**
 * Viết một phương thức dùng để in danh sách các phần tử trong mảng một chiều
 * Mảng: số nguyên, số thực, chuỗi, đối tượng bất kỳ
 * 
 * Arrays.sort(elements) --> từng element phải là con của Comparable (chỉ bắt lỗi tại lúc runtime)
 * ↓
 * Để bắt lỗi tại lúc Compile --> sử dụng Generic type (tham khảo hàm sort() bên dưới)
 */

public class Ex01GenericMethodWithArray {
	public static void main(String[] args) {
		Integer[] numbers = { 1, 2, 3, 4, 5 };
		String[] sequences = { "A", "B", "C", "D" };
		Double[] points = {7.8d, 2.2d, 6.4d};
		Store[] stores = {
				new Store(1, "S1", LocalDate.now(), 0),
				new Store(2, "S2", LocalDate.now(), 0)};
		
		sort(points);
		
		printf("numbers", numbers);
		printf("sequences", sequences);
		printf("points", points);
	}

	// common method
	// Object là cha của Integer, String, Double,... 
	// --> Object[] là cha của Integer[], String[],...
	private static void printf(String title, Object[] elements) {
		System.out.println(title + " -->");
		for (Object element : elements) {
			System.out.println(element + " ");
		}
		System.out.println();
	}
	
	// upper bound
	// E là 
	// + Comparable<E> hoặc 
	// + implementation của Comparable<E> (tức là con của Comparable<E>)
	private static <E extends Comparable<E>> void sort(E[] elements) {
		Arrays.sort(elements);
	}
}