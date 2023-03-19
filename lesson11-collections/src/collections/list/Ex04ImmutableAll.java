package collections.list;

import java.util.Arrays;
import java.util.List;

public class Ex04ImmutableAll {
	public static void main(String[] args) {
		// Toán tử ... gọi là java variable --> tương tự mảng một chiều
		// Nhưng có thể truyền vào thỏa mái hơn --> T...
		// VD: new String[] {"a", "b"}
		//     "a", "b", "C", "d"
		
		// Tạo 1 ArrayList 			--> new ArrayList(java.util) --> add
		// Tạo nhanh một ArrayList  --> Arrays.asList(Arrays.ArrayList)
		// allowed null
		// --> Fixed-size, không hỗ trợ add/remove
		List<String> list1 = Arrays.asList("a", "b", "c", "d", null);
		list1.set(2, "bb123");
		list1.forEach(System.out::println);
		
		System.out.println("\n================\n");
		
		// immutable list
		// un-allowed null
		List<String> list2 = List.of("a", "b", "c", "d");
		list2.set(2, "bb123");
		list2.forEach(System.out::println);
			
	}
}
