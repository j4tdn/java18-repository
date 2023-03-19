package sorting.object;

import java.util.Arrays;
import java.util.function.Function;

import static java.util.Comparator.*;

public class Ex04SortByCondition {
	public static void main(String[] args) {
		// fixed-sized --> implicitly final
		String[] sequences = { "4", "-2", "a", "z", "c", "10", "t" };

		// String#value

		Arrays.sort(sequences);
		System.out.println("sequences asc: " + Arrays.toString(sequences));

		// s -> s ===>
		Arrays.sort(sequences, comparing(Function.identity(), reverseOrder()));
		System.out.println("sequences asc: " + Arrays.toString(sequences));

		// Gõ code --> JRE(Eclipse chọn) --> 11
		// Chạy --> JDK(OS cài đặt) --> 8

		// unknown class, no suitable class

		// Tăng dần: Special => chuỗi tăng dần => số âm tăng dần => số dương tăng dần 
		// --> null first
		String[] strings = { "-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx" };

		// Cách 1: Chia ra từng phần để sort --> gộp lại
		// Cách 2: Tượng tự cách làm null first, null last
		Arrays.sort(strings, (String s1, String s2) -> {
			// B1: Xử lý null
			if (s1 == null) {
				return -1;
			}

			if (s2 == null) {
				return 1;
			}
			
			// B2: Xử lý special
			if (s1.toLowerCase().equals("special")) {
				return -1;
			}

			if (s2.toLowerCase().equals("special")) {
				return 1;
			}
			
			// B3: Xử lý chuỗi trước mới đến phần còn lại
			// s1 chuỗi, s2 chuỗi
			if (isString(s1)) {
				return isString(s2) ? s1.compareTo(s2) : -1;
			}
			
			// s1 ! chuỗi, s2 chưa biết
			// s1 chuỗi, s2 chuỗi
			if (isString(s2)) { // --> đúng cho TH 1, xử lý TH 2 phía trên
				return 1;
			}
			// phần còn lại
			return s1.compareTo(s2);
			
			// thêm: sắp xếp có dấu ko dấu, viết hoa viết thường, locale, region
			// ---> Collator
		});

		System.out.println("strings --> " + Arrays.toString(strings));
	}
	
	private static boolean isString(String s) {
		return s.matches("[a-zA-Z]+");
	}

}
