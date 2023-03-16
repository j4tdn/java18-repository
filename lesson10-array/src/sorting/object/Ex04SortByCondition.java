package sorting.object;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.regex.Matcher;

public class Ex04SortByCondition {
	public static void main(String[] args) {
		String[] sequences = { "4", "-2", "a", "z", "c", "10", "t" };

		// String#value

		// sort sequences asc

		Arrays.sort(sequences);
		System.out.println("sequences asc: " + Arrays.toString(sequences));

		Arrays.sort(sequences, Comparator.comparing(Function.identity()));
		System.out.println("sequences asc: " + Arrays.toString(sequences));

		// gõ code --> JRE(Eclipse chọn) --> 11
		// Chạy --> JDK(OS cài đặt) --> 8

		// unknown class, no suitable class

		// Tăng dần: Special => số âm tăng dần +> số dương tăng dần => chuỗi tăng dần
		String[] strings = { "-2", "-6", "10", "null", "4", "8", "null", "Special", "a", "b", "c", "xx" };

		// cách 1: chia ra từng phần để sort --< gộp lại
		// cách 2:
		Arrays.sort(strings, (String s1, String s2) -> {
			// B1: xử lý null
			if (s1 == null) {
				return -1;
			}
			if (s2 == null) {
				return 1;
			}
			// B2: xử lý special
			if (s1.toLowerCase().equals("special")) {
				return -1;
			}
			if (s2.toLowerCase().equals("special")) {
				return 1;
			}
			// B3: xử lý chuỗi trước mới đến phần còn lại
			// s1 chuỗi, s2 chuỗi
			if (isString(s1)) {
				return isString(s2) ? s1.compareTo(s2) : -1;
			}
			if (isString(s2)) { // --> đúng cho TH 1, xử lý TH 2 phía trên
				return 1;
			}

			// phần còn lại

			return s1.compareTo(s2);
		});
		System.out.println("strings --> " + Arrays.toString(strings));
	}

	private static boolean isString(String s) {
		return s.matches ("[a-zA-Z]+");
	}

}
