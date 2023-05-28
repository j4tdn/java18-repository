package utils;

import java.util.List;

/*
 * utils class --> chứa những hàm static
 * --> chỉ phụ thuộc vào tham số tryền vào, không phụ thuộc vào đối tượng 
 * 
 * --> tất cả đều hàm static
 * --> tạo ra n đối tượng gọi hàm static thì KQ đều giống nhau
 * --> tốn memmory
 * 
 * --> private constructor --> cấm tạo ra đối tượng
 * --> chỉ được phép lấy class gọi thôi
 */
public class PrintUtils {
	private PrintUtils() {
		
	}
	
	public static <T> void print(String prefix, Iterable<T> elements) {
		System.out.println("\n" + prefix);
		
		System.out.println("=====================");
		elements.forEach(System.out::println);
		System.out.println("=====================");
	}
}
