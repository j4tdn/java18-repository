package collections.list;

import java.util.Arrays;
import java.util.List;

public class Ex04ImmutableList {
	public static void main(String[] args) {
		// Toán tử ... gọi là java variable --> tương tự 1 mảng 1 chiều
		// nhưng có thể truyền thoải mái hơn --> T...
		
		//VD: new String[] {"a", "b"}
		
		
		//Tạo 1 ArayList --> new ArrayList --> add
		//Tạo nhanh 1 ArrayList
		// allowed null
		// -> Fixed size, erors --> add, remove
		List<String> list1 = Arrays.asList("a", "b", "c", "d", null);
		list1.set(2, "dgdg");
	
		list1.forEach(System.out::println);
		
		System.out.println("=================");
		
		//immutable list
		//un-allowed null
		List<String> list2 = List.of("a", "b", "c", "d");
		//list2.set(2, "abc");
		//erors --> add, remove, set 
		list2.forEach(System.out::println);
		
	}
}
