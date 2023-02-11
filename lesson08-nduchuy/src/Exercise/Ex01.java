package Exercise;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.nextLine();
//		charSeparate(str);
//		wordSeparate(str);
//		reverseString(str);
		reverseStringWithWord(str);
	}

	/**
	 * In ra mỗi kí tự trên một dòng
	 * 
	 * @param str
	 */
	public static void charSeparate(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println("str[" + i + "]: " + str.charAt(i));
		}
	}

	/**
	 * In ra mỗi từ trên một dòng
	 * 
	 * @param str
	 */
	public static void wordSeparate(String str) {
		String[] words = str.split(" ");

		for (String word : words) {
			System.out.println(word);
		}
	}

	/**
	 * In ra chuỗi đảo ngược theo kí tự
	 * 
	 * @param str
	 */
	public static void reverseString(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		System.out.println(reverse);
	}

	public static void reverseStringWithWord(String str) {
		String reverse = "";
		String[] words = str.split(" ");
		for (int i = words.length - 1; i >= 0; i--) {
			reverse = reverse + words[i] +  " " ;
		}
		System.out.println(reverse);
	}

}
