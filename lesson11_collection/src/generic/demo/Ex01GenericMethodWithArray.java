package generic.demo;

import java.time.LocalDate;
import java.util.Arrays;

import bean.Item;

public class Ex01GenericMethodWithArray {
	public static void main(String[] args) {
		/*
		 * Viết 1 phương thức dùng để in danh sánh 
		 * các phần tử trong mảng 1 chiều
		 * Mảng: số nguyên, số thực, chuỗi, dối tượng
		 */
		String[] sequences = {"m","b","c"};
		Item[] store = {
				new Item(1,"s1",LocalDate.now(),2),
				new Item(2,"s2",LocalDate.now(),2),			
		};
		sort(sequences);
		printf(sequences);
		System.out.println("================");
		printf(store);
	}
	//Commom method 
	private static void printf(Object[] elements) {
		System.out.print("Array -> ");
		for(Object element: elements) {
			System.out.print(element + " ");
		}
	}
	
	//Generic Method
	private static <E extends Comparable<E>> void sort(E[] elements) {
		Arrays.sort(elements);
	}
}
