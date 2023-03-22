package collections.list;

import java.util.Arrays;
import java.util.List;

public class Ex04ArrayListAll {
	public static void main(String[] args) {
		// Toán tử .. gọi là java variables --> tương tự 1 mảng 1 chiều
		// nhưng có thể truyền thoải mái hơn --> T...
		// VD: new String[] {"a", "b"}
		
		// Tạo 1 ArrayList --> new ArrayList --> add
		 // Tạo nhanh 1 ArrayList --> Arrays.asList
		// allowed null
		// --> Fixed size, khong ho tro add/ remove
		List<String> list1 = Arrays.asList("a", "b", "c", "d");
		// errors --> add, remove
		list1.set(2, "bb23");
		
		list1.forEach(System.out::println);
		
		System.out.println("=============================");
		// immutable list
		// un-allowed null
		// errors --> add, remove
		List<String> list2 = List.of("a", "b", "c", "d");
		
	}

}
