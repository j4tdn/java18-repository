package view;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex03removeAccent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.println("Enter string: ");
				String s = sc.nextLine();
				if (isValidString(s)) {
					removeAccent(s);
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
	}
	
	private static boolean isValidString(String s) throws Exception {
		if (!Pattern.matches("[\\p{L}\\s]+", s)) {
		throw new Exception("The string contains only Vietnamese characters with accents and space keys.");
		}
	return true;
	}
	
	private static void removeAccent(String s) {
		String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		System.out.println(pattern.matcher(temp).replaceAll(""));
	}
	
}
