package Exercise;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		do {
			System.out.print("Enter your fullname: ");
			str = sc.nextLine();
			boolean isStr = check(str);
			if (isStr) {
				break;
			}
		} while (true);
		upcaseFirstLetter(str);
	}

	public static boolean check(String str) {
		return str.matches(".*[a-z A-Z]+.$");
	}

	public static void upcaseFirstLetter(String str) {
		str = str.strip();
		//Xử lý nhiều khoảng trắng thành 1 
		str =str.replaceAll(" {1,}", " ");
		String[] words = str.split(" ");
		StringBuilder result = new StringBuilder();
		for(String word: words) {
			result.append(Character.toUpperCase(word.charAt(0)))
			.append(word.substring(1).toLowerCase())
			.append(" ");
		}
		System.out.println(result);
//		int counter = 1;
//		str = str.strip();
//		for (int i = 0; i < str.length(); i++) {
//			char temp = str.charAt(i);
//			if (temp == ' ') {
//				if (str.charAt(i + 1) != ' ') {
//					++counter;
//				}
//			}
//		}
//		System.out.println("Số lượng từ " + counter);
	}
}
