package utils;

import java.util.Map;

/**
 * utils class --> chứa những hàm static
 * --> chỉ phụ thuộc vào tham số truyền vào, k phụ thuộc vào đối tượng
 *
 * --> tất cả đều hàm static
 * --> tạo ra n đối tượng gọi hàm static thì KQ đều giống nhau
 * --> tốn memory
 * 
 * ---> private constructor --> cấm tạo ra đối tượng
 * ---> chỉ được phép lấy class gọi thôi
 * 
 *
 */
public class PrintUtils {

	private PrintUtils() {
	}
	
	public static <T> void print(String prefix, Iterable<T> elements) {
		
		System.out.println("\n" + prefix);
		
		System.out.println("===__------------__===");
		
		elements.forEach(System.out::println);
		
		System.out.println("===__------------__===\n");
	}
	
	public static <K, V> void print(String prefix, Map<K, V> map) {
		
		System.out.println("\n" + prefix);
		
		System.out.println("===__------------__===");
		
		map.entrySet().forEach(System.out::println);
		
		System.out.println("===__------------__===\n");
	}
	
}