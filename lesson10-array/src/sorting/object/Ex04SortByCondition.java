package sorting.object;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

import java.util.Arrays;
import java.util.function.Function;

public class Ex04SortByCondition {
	public static void main(String[] args) {
		String[] sequences = { "4", "-2", "a", "z", "c", "10", "t" };

		// String#value

		// sort sequences asc
		Arrays.sort(sequences);
		System.out.println("sequences asc: " + Arrays.toString(sequences));

		// sort desc
		// s -> s ==>
		Arrays.sort(sequences, comparing(Function.identity(), reverseOrder()));
		System.out.println("sequences desc: " + Arrays.toString(sequences));

		// Tăng dần: Special => chuỗi tăng dần => số âm tăng dần => số dương tăng dần
		String[] strings = { "-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx" };

		// C1: Chia ra từng phần để sort --> gộp lại
		// C2: Tương tự cách làm null first, null last
		Arrays.sort(strings, (String s1, String s2) -> {
			// B1: Xử lí null
			if (s1 == null) {
				return -1;
			}
			if (s2 == null) {
				return 1;
			}

			// B2: xử lí special
			if (s1.toLowerCase().equals("special")) {
				return -1;
			}

			if (s2.toLowerCase().equals("special")) {
				return 1;
			}

			// B3: xử lý chuỗi trước mới đến phần còn lại
			// s1 chuỗi, s2 chuổi
			if (isString(s1)) {
				return isString(s2) ? s1.compareTo(s2) : -1;
			}

			if (isString(s2)) {
				return 1;
			}
			
			// phần còn lại
			return s1.compareTo(s2);
		});
		System.out.println("result: " + Arrays.toString(strings));

	}

	private static boolean isString(String s) {
		return s.matches("[a-zA-Z]+");
	}

}
