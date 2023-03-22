package collection.list;

import java.util.Arrays;
import java.util.List;

public class Ex04ArrayListAll {
	public static void main(String[] args) {
		
		//Toán tử ... gọi là java variable  --> tương tự mảng 1 chiều
		//nhưng có thể truyền vào thoải mái hơn --> T...
		
		// Tạo 1 ArayList --> new ArayList(Arrays.Util) --> Add
		// Tạo nhanh 1 ArayList --> new Array.asList(Array.Util)
		// --> fixed-size, không hỗ trợ add/remove
		// allowed null
		List<String> list1 = Arrays.asList("a", "b", null);
		
		List<String> list2 = List.of("a", "b","c","d");
		
		// cannot add/remove
		// required non null
		
		list2.forEach(System.out::println);
		
	}
}
