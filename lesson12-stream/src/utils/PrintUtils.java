package utils;

/**
 * utils class -> chứa những hàm static
 * --> chỉ phụ thuộc vào tham số truyền vào, k phụ thuộc vào đối tượng
 * 
 * --> tất cả đều là hàm static
 * --> tạo ra n đối tượng gọi hàm static thì KQ đều giống nhau
 * --> tốn memory
 * 
 * --> private constructor --> cấm tạo ra đối tượng
 * --> chỉ được phép lấy class gọi thôi
 * @author VIET TAY
 *
 */
public class PrintUtils {

	private PrintUtils() {

	}

	public static <T> void print(String prefix, T element) {
		System.out.println("\n" + prefix + " --> " + element);
	}

	public static <T> void print(String prefix, Iterable<T> elements) {
		System.out.println("\n" + prefix);

		System.out.println("===__--------------__===");
		elements.forEach(System.out::println);
		System.out.println("===__--------------__===");

	}
}
