package collections.list;

import java.util.Arrays;
import java.util.List;

public class Ex04ImmutableList {
	public static void main(String[] args) {
		// Toán tử ... gọi là java variables --> tương tự 1 mảng 1 chiều
		// nhưng có thể truyền vào thoải mái hơn --> T...
		// VD: new String[] {"a", "b"}
		// "a", "b", "c", "d"
		
		
		// Tạo 1 ArrayList        --> new ArrayList(java.util) --> add
		// Tạo nhanh 1 ArrayList  --> Arrays.asList(Arrays.ArrayList)
		// allowed null
		// --> Fixed-size, không hỗ trợ add/remove
		List<String> list1 = Arrays.asList("a", "b", "c", "d", null);
		list1.set(2, "bb123");
		// errors --> add, remove
		list1.forEach(System.out::println);
		
		System.out.println("=======");
		
		// immutable list
		// un-allowed null
		List<String> list2 = List.of("a", "b", "c", "d");
		list2.set(2, "xyz123");
		// errors --> add, remove
		list2.forEach(System.out::println);
		
	}
	
}
