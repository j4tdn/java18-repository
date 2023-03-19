package collections.list;

import java.util.Arrays;
import java.util.List;

public class Ex04ImmutableListAll {
	public static void main(String[] args) {
		//Toán tử ... gọi là java variables --> tương tự như mảng 1 chiều
		//nhưng có thể truyền vào thoải mái hơn --> T...
		
		//VD: new String[] {"a","b"}
		//    "a","b","c"
		
		/*
		 * Tạo 1 ArrayList  		--> new ArrayList()
		 * Tạo nhanh ArrayList 		--> Arrays.asList()  --> Fixed-size, kh thể dùng add remove nhừng dùng đc function khác
		 * 							--> List.of() --> inmutable --> không thể có giá trị null, không thể sửa, thêm xoá								
		 */
		
		List<String> list1 = Arrays.asList("a","b","c",null);
		System.out.println("aslist ArrayList ==============================");
		list1.forEach(item -> System.out.println(item));
		
		
		List<String> list2 = List.of("a","b","c");
		System.out.println("aslist ArrayList ==============================");
		list2.forEach(item -> System.out.println(item));
	}
}
