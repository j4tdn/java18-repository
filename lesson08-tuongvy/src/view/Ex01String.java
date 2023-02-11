package view;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex01String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.print("Enter string: ");
				String s = sc.nextLine();
				if (isValidString(s)) {
					System.out.println("Print one character per line:");
					characters(s);
					System.out.println("Print out one word per line:");
					phrase(s);
					System.out.println("Print the reversed string by character:");
					reverseCharacters(s);
					System.out.println("Print the reverse string by word:");
					reversePhrase(s);
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} while (true);
		sc.close();
	}

	private static boolean isValidString(String s) throws Exception {
		if (!Pattern.matches("[\\p{L}\\s]+", s)) {
			throw new Exception("The string contains only Vietnamese characters with accents and space keys.");
		}
		return true;
	}

	private static void characters(String s) {
		for (int i = 0; i <= s.length() -1 ; i++) {
			System.out.println(s.charAt(i));
		}
	}
	
	private static void phrase(String s) {
		for (int i = 0; i <= s.length() - 1; i++) {
			if (s.charAt(i) != ' ') {
				System.out.print(s.charAt(i));
			}
			else if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
				System.out.println();
			}
			else if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ') {
				s.replace(" ", "");
			}
			
		}
		System.out.println();
	}
	
	private static void reverseCharacters(String s) {
		s = new StringBuilder(s).reverse().toString();
		System.out.println(s);
	}
	
	private static void reversePhrase(String s) {
		String[] string = s.split(" ");
		for (int i = string.length - 1; i >= 0; i--) {
			System.out.print(string[i] + " ");
		}
		System.out.println();
	}
}