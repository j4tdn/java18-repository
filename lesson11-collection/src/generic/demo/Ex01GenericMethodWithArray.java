package generic.demo;

import java.time.LocalDate;
import java.util.Arrays;

import bean.Store;

public class Ex01GenericMethodWithArray {
	
	/* Viết 1 phương thức dùng để in danh sách các phần tử trong mảng 1 chi�?u
	   Mảng: số nguyên, số thực, chuỗi, đối tượng
	*/
	public static void main(String[] args) {
		Integer[] numbers = {1, 2, 3, 4, 5};
		String[] sequences = {"A", "B", "C", "D"};
		Double[] points = {7.8d, 2.2d, 6.4d};
		Store[] stores = {
			new Store(1, "S1", LocalDate.now(), 0),
			new Store(2, "S2", LocalDate.now(), 0)
		};
		
		sort(points);
		
		// sort(stores);
		
		printf("number", numbers);
		printf("sequences", sequences);
		printf("points", points);
	}
	
	// upper bound
	// E: là Comparable<E> hoặc implemenation của Comparable<E>
	private static <E extends Comparable<E>> void sort(E[] elements) {
		Arrays.sort(elements);
	}
	
	private static void printf(String title,Object[] elements) {
		System.out.print(title + " -----> ");
		for(Object element:elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
