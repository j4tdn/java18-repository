package generic.demo;

import java.util.List;

public class Ex01GenericMethodWithList {
	
	/* 
	 	Viết 1 phương thức dùng để in danh sách 
     	các phần tử trong mảng 1 chi�?u
     	Mảng: số nguyên, số thực, chuỗi, đối tượng
    */
	
	public static void main(String[] args) {
		List<Number> numbers = List.of(1, 2, 3, 4, 5);
		List<String> sequences = List.of("A", "B", "C", "D");
		List<CharSequence> charSequences = List.of("A", "B", "C", "D");
		List<Double> points = List.of(7.8d, 2.2d, 6.4d);
		
		printf("numbers", numbers);
		printf("sequences", sequences);
		printf("points", points);
		
		System.out.println("===============");
		
		// printfWildCard("numbers", numbers);
		printfWildCard("sequences", sequences);
		printfWildCard("charSequences", charSequences);
		// printfWildCard("points", points);
	}
	
	// Cần tham số KDL List, từng phần tử trong List là Object
	// Object chỉ là tham số của generic interface List
	// Object là cha của Integer, Double
	// List<Object> ko phải là cha của List<Integer>, Lits<Double>
	
	// List<E> --> E là generic type, tham số mà ngư�?i dùng
	// phải truy�?n KDL đối tượng vào
	private static <E> void printf(String title, List<E> elements) {
		System.out.print(title + " ---> ");
		for(E element: elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	// ? extends CharSequence --> CharSequence or sub(con) classes
	// ? super String --> String or parent(cha) classes
	private static void printfWildCard(String title, List<? super String> elements) {
		System.out.print(title + " ---> ");
		for(Object element: elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}