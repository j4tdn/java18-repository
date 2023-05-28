package view;

import java.util.Arrays;
import java.util.Scanner;

/**
Bài 3: Thực hành xử lý chuỗi.
Kiểm tra 2 chuỗi Strings có phải là đảo ngữ của nhau không. 2 Strings được gọi là đảo
ngữ nếu chúng sử dụng chung các kí tự, không quan tâm các kí tự trống, không phân biệt
hoa thường. Mỗi kí tự phải có cùng số lượng trong cả 2 Strings
Example
			Word orWd true
			Word Word true
			word DoRw true
			Word worrd false
			Java ajav true
			Vava Avav true
			Hello Hellloo false
 */
public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập chuỗi s1: ");
		String s1 = ip.nextLine();
		System.out.print("Nhập chuỗi s2: ");
		String s2 = ip.nextLine();
		System.out.println(check(s1, s2));
	}

	private static boolean check(String s1, String s2) {
		String ss1 = s1.replaceAll("\\s", "").toLowerCase();
		String ss2 = s2.replaceAll("\\s", "").toLowerCase();
		if (ss1.length() != ss2.length()) {
			return false;
		}
		char[] c1 = ss1.toCharArray();
		char[] c2 = ss1.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);
	}
}
