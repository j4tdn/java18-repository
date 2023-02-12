package view;

/**
 * Xâu s1 có dộ dài m và s2 có độ dài n (m,n là hai số tự nhiên; n,m < 250)
 * Biết rằng s1,s2 chỉ chứa các kí tự ‘A’…’Z’.
 * Yêu cầu: Hãy viết phương trình tìm xâu con chung dài nhất của xâu s1 và s2.
 * Dữ liệu vào: Nhập từ bàn phím 2 xâu s1 và s2.
 * Kết quả: Xuất ra màn hình xâu con chung của 2 xâ s1 và s2.
 * Example:
 * Input: S1:ABCEDEABC
 * 	      S2:ABCEDCBBCK
 * Output: ABCED
 */

import java.util.Scanner;

public class Ex05LongestCommonSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s1 = "";
		String s2 = "";

		do {
			try {
				System.out.print("Input the first string: ");
				s1 = sc.nextLine();
				System.out.print("Input the second string: ");
				s2 = sc.nextLine();

				if (isValidInput(s1) && isValidInput(s2)) {
					System.out.println("The longest common sequence is --> " + getLongestCommonSequence(s1, s2));
				}
				
				break;

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		sc.close();

	}

	private static boolean isValidInput(String input) throws Exception {
		if (!input.matches("[A-Z]+")) {
			throw new Exception("Input must be uppercase characters!!!");
		}
		if (input.length() >= 250) {
			throw new Exception("Input's length mustn't exceed 250!!!");
		}
		return true;
	}

	private static String getLongestCommonSequence(String s1, String s2) {
		int len = s1.length();
		String result = "";

		for (int i = 0; i < len; i++) {
			for (int j = len; j > 0; j--) {
				if (i < len - j) {
					String sub = s1.substring(i, len - j);
					if (s2.indexOf(sub) >= 0) {
						if (sub.length() > result.length()) {
							result = sub;
						}
					}
				}
			}
		}
		return result;
	}
}
