package generic.demo;

import java.time.LocalDate;
import java.util.Arrays;

import bean.Store;

public class Ex01GenericMethodWithArray {
	
	// Viết một phương thức dùng để in danh sách
	// các phần tử 1 chi�?u
	// Mảng: số nguyên, số thực, chuỗi, đối tượng
	 
	public static void main(String[] args) {
		Integer[] numbers = {1, 2, 3, 4, 5};
		String[] sequences = {"A", "B", "C", "D", "E"};
		Double[] points = {1.2d, 2.3d, 3.4d, 4.5d};
		
		Store[] stores = {
				new Store(1, "A", LocalDate.now(), 0),
				new Store(2, "B", LocalDate.now(), 0),
				new Store(3, "C", LocalDate.now(), 0),
				};
		
		printf("number",  numbers);
		printf("sequences",  sequences);
		printf("points",  points);
		sort(points);
	}
	
	public static <E extends Comparable<E>> void sort(E[] elements) {
		Arrays.sort(elements);
	}
	
	public static void printf(String title, Object[] elements) {
		System.out.println(title + " ---> ");
		for (Object element : elements) {
			System.out.print(element + " ");
		}
		
		System.out.println();
	}

}
