package collections.list;

import java.util.Arrays;
import java.util.List;

/**
 * Toán tử ...
 * gọi là java variables 
 * --> tương tự mảng 1 chiều 
 * nhưng có thể truyền vào thoải mái hơn 
 * + có thể truyền mảng 
 * + truyền danh sách rồi đưa vô mảng
 * VD: new String[] {"a", "b"} or "a", "b"
 * 
 * ====
 * new ArrayList (java.util) 	 AND 	 Arrays.asList (Arrays.ArrayList)
 * ↓
 * get, set, show, add, remove   ||      get, set, show
 * 
 * Arrays.asList             	 AND 	 List.of
 * ↓
 * get, set, show                ||      get, set, show
 */

public class Ex04ImmutableList {
	public static void main(String[] args) {
		// Tạo 1 ArrayList 		 --> new ArrayList (java.util) --> add 
		// Tạo 1 nhánh ArrayList --> Arrays.asList (Arrays.ArrayList)
		
		List<String> list1 = Arrays.asList("a", "b", "c", "d", null);
		list1.set(2, "bb123");
		list1.forEach(System.out::println);
		
		List<String> list2 = List.of("a", "b", "c");
		
	}

}
