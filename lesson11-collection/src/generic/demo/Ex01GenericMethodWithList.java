package generic.demo;

import java.util.List;

public class Ex01GenericMethodWithList {
	
	/* Viết 1 phương thức dùng để in danh sách các phần tử trong mảng 1 chi�?u
	   Mảng: số nguyên, số thực, chuỗi, đối tượng
	*/
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4 ,5);
		List<String> sequences = List.of("A", "B", "C", "D");
		List<Double> points = List.of(7.8d, 2.2d, 6.4d);
		printf("number", numbers);
		printf("sequences", sequences);
		printf("points", points);
	}
	
	// Cần tham số KDL List, từng phần tử trong List là object
	// Object chỉ là tham số của generric interface List
	// Object là cha của Interger, Double
	// List<Object> ko phải là cha của List<Integer>, List<Double>
	
	// List<E> --> E là generic type, tham số mà ngư�?i dùng phải truy�?n KDL đối tượng vào
	private static <E> void printf(String title,List<E> elements) {
		System.out.print(title + " -----> ");
		for(Object element:elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
