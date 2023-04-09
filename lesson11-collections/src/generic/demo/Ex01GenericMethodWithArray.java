package generic.demo;

import java.time.LocalDate;
import java.util.Arrays;

import bean.Store;

public class Ex01GenericMethodWithArray {

	// Viết 1 phương thức dùng để in danh sách
	// Các phần tử trong mảng 1 chiều
	// Mảng: số nguyên, số thực, chuỗi, đối tượng

	public static void main(String[] args) {
		Integer[] numbers = { 1, 2, 3, 4, 5 };
		String[] sequences = { "A", "B", "C", "D" };
		Double[] points = { 1.1d, 1.2d };
		Store[] stores = {
				new Store(1, "A", LocalDate.now(), 0),
				new Store(2, "B", LocalDate.now(), 0),
		};
		
		// sort(stores); error lúc runtime
		sort(points);
		printf("numbers", numbers);
		printf("sequences", sequences);
		printf("points", points);
		
		// Arrays.sort(elements) --> từng element phải là con của Comparable
		// Arrays.sort(elements, Comparator)
		

	}
	
	//Upper bound: giới hạn trên
	// E là Comparable<E> hoặc implementation của Comparable<E>
	private static <E extends Comparable<E>> void sort(E[] elements) {
		Arrays.sort(elements);
	}

	private static void printf(String title, Object[] elements) {
		System.out.println("title --> " + title);
		for (Object element : elements) {
			System.out.println(element + " ");
		}
		System.out.println();

	}
}
