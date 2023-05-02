package utils;

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
	
	public static <T> void printf(String prefix, Iterable<T> elements) {
		System.out.println("\n" + prefix);
		System.out.println("==========____---------____=========");
		elements.forEach(System.out::println);
		System.out.println("==========____---------____=========");
	}
}
