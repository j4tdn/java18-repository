package utils;

import java.util.Map;

/*
 * utils class --> chưa những hàm static
 * --> chỉ phụ thuộc vào tham số truyền vào, k phụ htuoocj vào dối tượng
 * 
 * --> tất cả đều hàm static
 * --> tạo ra n dối tượng gọi hàm static thì KQ đều giống nhau
 * --> tốn memory
 * 
 * --> private constructor --> cấm tạo ra đối tượng
 * --> chỉ được phép lấy class gọi
 */
public class PrintUtils {

	private PrintUtils() {
		// TODO Auto-generated constructor stub
	}

	public static <T> void print(String prefix, Iterable<T> elements) {
		System.out.println("\n" + prefix);
		System.out.println("==========____---------____=========");
		elements.forEach(System.out::println);
		System.out.println("==========____---------____=========");
	}
	public static <T> void print(String prefix, int count) {
		System.out.println("\n" + prefix);
		System.out.println("==========____---------____=========");
		System.out.println(count);
		System.out.println("==========____---------____=========");
	}

	public static <K, V> void print(String prefix, Map<K, V> map) {

		System.out.println("\n" + prefix);

		System.out.println("===__------------__===");

		map.entrySet().forEach(System.out::println);

		System.out.println("===__------------__===\n");
	}

}
