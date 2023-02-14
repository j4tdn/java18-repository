package demo;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean status = false;
		do {
			try {
				System.out.print("Enter a string : ");
				String input = sc.nextLine();
				if (isValid(input)) {
					status = true;
					System.out.println(replaceChar(input));				
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (!status);
		sc.close();
	}

	private static boolean isValid(String input) throws Exception {
		String regix = "^[\\p{L} ]+$";
		if (!Pattern.matches(regix, input))
			throw new Exception("The string must contain Vietnamese characters with accents and space keys.");
		return true;
	}

	private static String  replaceChar(String input) {
		 try {
	            String temp = Normalizer.normalize(input, Normalizer.Form.NFD);
	            Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
	            return pattern.matcher(temp).replaceAll("");
	     } catch (Exception ex) {
	            ex.printStackTrace();
	      }
	      return null;
	}
}
