package generic.demo;

import java.util.List;

/**
 * Viết một phương thức dùng để in danh sách các phần tử trong mảng một chiều
 * Mảng: số nguyên, số thực, chuỗi, đối tượng bất kỳ
 */

public class Ex01GenericMethodWithList {
	public static void main(String[] args) {
		List<Integer> numbers = List.of( 1, 2, 3, 4, 5 );
		List<String> sequences = List.of( "A", "B", "C", "D" );
		List<Double> points = List.of(7.8d, 2.2d, 6.4d );
		
		printf("numbers", numbers);
		printf("sequences", sequences);
		printf("points", points);
	}

	// Cần tham số KDL List, từng phần tử trong List là Object
	// Object chỉ là tham số của generic interface list
	// Object là cha của Integer, Double,... 
	// NHƯNG List<Object> không phải là cha của List<Integer>,...
	
	// List<E> --> E là generic type
	// + Lúc compile chưa biết là KDL gì
	// + Là tham số mà người dùng phải truyền KDL đối tượng vào (lúc runtime)
	private static <E> void printf(String title, List<E> elements) {
		System.out.print(title + " --> ");
		for (E element : elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}