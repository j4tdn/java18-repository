package generic.demo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import bean.Store;

public class Ex01GenericMethodWithArray {
	/*
	 * 
	 * Viết 1 phương thức dùng để
	 * in danh sách các phần tử trong 
	 * mảng 1 chièu
	 * Mảng: số nguyên, số thực, chuỗi, đối tượng
	 */
	public static void main(String[] args) {
		Integer[] numbers = {1, 2, 3, 4, 5};
		String[] messages = {"Hello", "Bonjour", "Konichiwa"};
		Double[] points = {7.8d,2.2d, 6.4d};
		
		Store[] stores = {
				new Store(1, "s1", LocalDate.now(), 0),
				new Store(2, "s2", LocalDate.now(), 0),
		};
		
		sort(points);
		printf("numbers --> ", numbers);
	//	printfWildCard("String --> " , messages);
		printf("Double --> " , points);
		printf("Store --> " , stores);
		//	Arrays.sort(elements) --> Từng element phải là con của Comparable
		// 	Arrays.sort(elements, Comparator);
	}
	
	// common method
	// Object là cha của Integer, String, Double
	// Object[] là cha của Integer[], String, Double

	private static void printf(String title, Object[] elements) {
		System.out.print(title + " ");
		for (Object e: elements) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
	
	// ? extends CharSequence ==> CharSequence or con classes
	// ? super CharSequence ==> CharSequence or cha classes
	
	private static void printfWildCard(String title, List<? extends CharSequence> elements) {
		System.out.print(title + " ");
		for (Object e: elements) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
	
	//upper bound
	// E: là Comparable<E> hoặc implementation của Comparable<E>
	private static <E extends Comparable<E>> void sort(E[] elements) {
		Arrays.sort(elements);
	}
	
}
