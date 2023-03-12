package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import static java.util.Comparator.*;

public class Ex04SortByCondition {
	public static void main(String[] args) {
		String[] sequences1 = { "4", "-2", "a", "z", "20", "10", "xx", "Special" };
		// String#Value

		// sort sequences assc
		Arrays.sort(sequences1);
		System.out.println(Arrays.toString(sequences1));
		System.out.println("======================================");
		Arrays.sort(sequences1, Comparator.comparing(Function.identity(), reverseOrder()));
		System.out.println(Arrays.toString(sequences1));
		System.out.println("======================================");

		// Cách1: Chia ra từng phần để sort
		// Cách2: Tương tự như làm null first, null last(dùng cách này)
		String[] sequences2 = { "4", "-2", "a", null, "z", "20", null, "10", "xx", "Special" };
		Arrays.sort(sequences2, (String s1, String s2) -> {
			// Xử lý null
			if (s1 == null) {
				return -1;
			}
			if (s2 == null) {
				return 1;
			}
			// Sử lý Special
			if (s1.toLowerCase().equals("special")) {
				return -1;
			}
			if (s2.toLowerCase().equals("special")) {
				return 1;
			}
			// Xử lý chuỗi trước mới đến phần còn lại
			// s1 chuỗi, s2 chuỗi và s1 chuổi, s2 đéo phải
			if (isString(s1)) {
				return isString(s2) ? s1.compareTo(s2) : -1;
			}
			//S2 là chuổi còn s1 kệ mẹ nó
			if (isString(s2)) {
				return 1;
			}
			// phần còn lại
			return s1.compareTo(s2);
		});
		System.out.println(Arrays.toString(sequences2));
	}
//	public static String itself(String s) {
//		return s;
//	}

//	public static Function<String, String> itself(){
//		return s -> s;
//	}
	public static boolean isString(String s) {
		return s.matches("[a-zA-Z]");
	}
}
