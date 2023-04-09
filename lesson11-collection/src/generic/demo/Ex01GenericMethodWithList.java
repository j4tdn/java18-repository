package generic.demo;

import java.util.List;

public class Ex01GenericMethodWithList {
	/*
	 * 
	 * Viết 1 phương thức dùng để
	 * in danh sách các phần tử trong 
	 * mảng 1 chièu
	 * Mảng: số nguyên, số thực, chuỗi, đối tượng
	 */
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		
		List<String> messages = List.of("Hello", "Bonjour", "Konichiwa");
		printf("numbers --> ", numbers);
		printf("String --> " , messages);
	}
	// 	common method
	// 	Object là cha của Integer, String, Double
	// 	Object[] là cha của Integer[], String[], Double[]
	// 	List<Object> không phải là cha của List<Integer>, List<String>, ...
	
	//	List<E> --> E là generic.demo type, tham số mà người dùng
	//	phải truyền KDL đối tượng vào
	// <E> là phần khai báo biến
	private static <E> void printf(String title, List<E> elements) {
		System.out.print(title + " ");
		for (E e: elements) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
	
}
