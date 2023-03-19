package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex04ImmutableList {
	// Toán tử .. gọi là java variables --> tương tự mảng 1 chiều
	// nhưng có thể truyền vào thoải mái hơn
	// VD : new String[] {"a", "b"}
	public static void main(String[] args) {
		// Tạo 1 ArrayList --> new ArrayList
		// Tạo nhanh 1 ArrayList --> Arrays.asList()

		// allowed null

		List<String> list1 = Arrays.asList("a", "b", "c", null);
		list1.set(0, "hello");
		System.out.println(list1);

		List<String> list2 = List.of("a", "b", "c", "d", "e");
		list2.set(0, "hi");
		System.out.println(list2);
	}
}
