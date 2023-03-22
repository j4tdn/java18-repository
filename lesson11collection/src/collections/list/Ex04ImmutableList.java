package collections.list;

import java.util.Arrays;
import java.util.List;

public class Ex04ImmutableList {
	public static void main(String[] args) {
		// Toán tử ... gọi là Java variables --> tương tự 1 mảng 1 chiều
		// nhưng có thể truyền vào thoái mái hơn --> T...
		// new String[] {"a","b"}
		// "a","b","c","d"

		// Tạo 1 ArrayList --> new ArrayList --> add
		// Tạo nhanh 1 ArrayList --> Arrays.asList(Arrays.ArrayList)
		// --> Fixed-size ,không hỗ trợ add//remove
		List<String> list1 = Arrays.asList("a", "b", "c", "d", null);
		list1.set(2, "bb125");
		// error --> add, remove
		list1.forEach(System.out::println);
		System.out.println("==============");

		
		//imutablie list
		//un-allowed null
		List<String> list2 = List.of("a", "b", "c", "d");
		list2.set(2, "xyz123");
		// error --> add, remove
		list2.forEach(System.out::println);
	}
}
