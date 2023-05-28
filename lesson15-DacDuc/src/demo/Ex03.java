package demo;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hellloo";

		if (isReverse(str1, str2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static boolean isReverse(String str1, String str2) {

		String s1 = str1.trim().toLowerCase();
		String s2 = str2.trim().toLowerCase();

		if (s1.length() != s2.length()) {
			return false;
		}
		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		return Arrays.equals(charArray1, charArray2);
	}
}
