package view;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Viết chương trình nhập vào một chuỗi kí tự bất kì sau đó thực hiện các công việc sau :
 * Yêu cầu: Chuỗi chỉ chứa các kí tự tiếng việt có dấu, phím space.
 * In ra mỗi kí tự trên một dòng
 * In ra mỗi từ trên mỗi dòng
 * In ra chuỗi đảo ngược theo kí tự
 * In ra chuỗi đảo ngược theo từ
 */

public class Ex01String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";

		do {
			try {
				System.out.print("Input a valid string: ");
				input = sc.nextLine();
				if (isValidInput(input)) {
					System.out.println("\nPrint each character per line: ");
					printCharPerLine(input);
					System.out.println("\nPrint each word per line: ");
					printWordPerLine(input);
					System.out.println("\nPrint the reversed string by characters: ");
					reverseByChar(input);
					System.out.println("\nPrint the reversed string by words: ");
					reverseByWord(input);
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} while (true);
		sc.close();
	}

	private static boolean isValidInput(String input) throws Exception {
		if (!Pattern.matches("[\\p{L}\\s]+", input)) {
			throw new Exception("The string must contain Vietnamese characters with accents and space!!!");
		}
		return true;
	}

	private static void printCharPerLine(String input) {
		for (int i = 0; i < input.length(); i++) {
			System.out.println(input.charAt(i));
		}
	}

	private static void printWordPerLine(String input) {
		String[] words = input.split("\\s+");
		for (String word : words) {
			System.out.println(word);
		}
	}

	private static void reverseByChar(String input) {
		StringBuilder sb = new StringBuilder(input);
		System.out.println(sb.reverse());
	}

	private static void reverseByWord(String input) {
		String[] words = input.split("\\s+");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.println(words[i] + "");
		}
	}

}
