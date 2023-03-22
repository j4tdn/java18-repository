package view;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		String[] strings = { "Special", "-2", "-6", "10", null, "4", "8", null, "a", "c", "b", "xx" };
		System.out.println(Arrays.toString(strings));
		sortAsc(strings);
		sortDesc(strings);
		
	}
	private static void sortAsc(String[] strings) {
		Arrays.sort(strings, (String s1, String s2) -> {
			if (s1 == null && s2 != null) {
				return 1;
			}
			if (s2 == null) {
				return -1;
			}
			if (s1.toLowerCase().equals("special")) {
				return -1;
			}
			if (s2.toLowerCase().equals("special")) {
				return 1;
			}
			if (isNumber(s1)) {
				if (isNumber(s2)) {
					return sortNumberAsc(s1, s2);
				}
			}
			return s1.compareTo(s2);
		});
		System.out.println("mảng tăng dần: " + Arrays.toString(strings));
	}

	private static void sortDesc(String[] strings) {
		Arrays.sort(strings, (String s1, String s2) -> {
			if (s1 == null) {
				return -1;
			}
			if (s2 == null) {
				return 1;
			}
			if (s1.toLowerCase().equals("special") && !(s2.toLowerCase().equals("special"))) {
				return 1;
			}
			if (isString(s1)) {
				return isString(s2) ? s2.compareTo(s1) : -1;
			}
			if (isNumber(s1)) {
				if (isNumber(s2)) {
					return sortNumberDesc(s1, s2);
				}
			}
			return s1.compareTo(s2);
		});
		System.out.println("mảng giảm dần: " + Arrays.toString(strings));
	}

	private static boolean isString(String s) {
		return s.matches("[a-zA-Z]+");
	}

	private static boolean isNumber(String s) {
		return s.matches("-?\\d+");
	}

	private static int sortNumberAsc(String s1, String s2) {
		int num1 = Integer.parseInt(s1);
		int num2 = Integer.parseInt(s2);
		if (num1 < 0 && num2 < 0) {
			return Integer.compare(num1, num2);
		}
		if (num1 >= 0 && num2 >= 0) {
			return Integer.compare(num1, num2);
		}
		return 1;
	}

	private static int sortNumberDesc(String s1, String s2) {
		int num1 = Integer.parseInt(s1);
		int num2 = Integer.parseInt(s2);
		if (num1 < 0 && num2 < 0) {
			return Integer.compare(num2, num1);
		}
		if (num1 >= 0 && num2 >= 0) {
			return Integer.compare(num2, num1);
		}
		return -1;
	}

}
