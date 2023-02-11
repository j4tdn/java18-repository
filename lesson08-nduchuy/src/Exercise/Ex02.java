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
				if(isStr) {
					break;
				}
			} while (true);
			upcaseFirstLetter(str);
	}
	public static boolean check(String str) {
		return str.matches(".*[a-z A-Z]+.$");
	}
	public static void upcaseFirstLetter(String str) {
		String[] words = str.split(" ");
		StringBuilder result = new StringBuilder();
		for(String word: words) {
			result.append(Character.toUpperCase(word.charAt(0)))
			.append(word.substring(1).toLowerCase())
			.append(" ");
		}
		System.out.println(result);
	}
}
