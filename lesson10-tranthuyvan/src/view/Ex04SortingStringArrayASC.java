package view;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Cho mảng string có n phần tử (2 < n < 100). 
 * Mảng cho phép chứa các phần tử là số âm, số dương, chuỗi “special” và các chuỗi kí tự khác. 
 * Viết chương trình sắp xếp mảng string.
 * Biết rằng. Khi chạy chương trình mảng sẽ sắp xếp theo thứ tự như sau
 * Tăng dần: Special => số âm tăng dần => số dương tăng dần => chuỗi tăng dần
 */

public class Ex04SortingStringArrayASC {
	public static void main(String[] args) {
		String[] strings = { "-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx" };
		System.out.println("Original array: " + Arrays.toString(strings));

		Arrays.sort(strings, new MyComparator());
		System.out.println("Sorted array (ASC): " + Arrays.toString(strings));
	}

	private static class MyComparator implements Comparator<String> {
		@Override
		public int compare(String s1, String s2) {
			if (isBothNull(s1, s2)) {
				return 0;
			} else if (isFirstNull(s1, s2)) {
				return 1;
			} else if (isSecondNull(s1, s2)) {
				return -1;
			} else if (isBothSpecial(s1, s2)) {
				return 0;
			} else if (isFirstSpecial(s1, s2)) {
				return -1;
			} else if (isSecondSpecial(s1, s2)) {
				return 1;
			} else if (isBothNumeric(s1, s2)) {
				return compareNumericStrings(s1, s2);
			} else if (isFirstNumeric(s1, s2)) {
				return -1;
			} else if (isSecondNumeric(s1, s2)) {
				return 1;
			} else {
				return s1.compareTo(s2);
			}
		}

		private boolean isBothNull(String s1, String s2) {
			return s1 == null && s2 == null;
		}

		private boolean isFirstNull(String s1, String s2) {
			return s1 == null;
		}

		private boolean isSecondNull(String s1, String s2) {
			return s2 == null;
		}

		private boolean isBothSpecial(String s1, String s2) {
			return s1.equals("Special") && s2.equals("Special");
		}

		private boolean isFirstSpecial(String s1, String s2) {
			return s1.equals("Special");
		}

		private boolean isSecondSpecial(String s1, String s2) {
			return s2.equals("Special");
		}

		private boolean isBothNumeric(String s1, String s2) {
			return isNumericString(s1) && isNumericString(s2);
		}

		private boolean isFirstNumeric(String s1, String s2) {
			return isNumericString(s1);
		}

		private boolean isSecondNumeric(String s1, String s2) {
			return isNumericString(s2);
		}

		private boolean isNumericString(String s) {
			if (s == null) {
				return false;
			}
			try {
				Integer.parseInt(s);
				return true;
			} catch (NumberFormatException e) {
				return false;
			}
		}

		private int compareNumericStrings(String s1, String s2) {
			int numericCompareResult = Integer.compare(Integer.parseInt(s1), Integer.parseInt(s2));
			return numericCompareResult;
		}
	}
}