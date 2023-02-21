package view;

import java.util.Scanner;

public class Ex03DeleteSpcaceAndReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Plese enter string: ");
		String string = sc.nextLine();
		System.out.println("String after delete space and reverse: " + reverseString(string));
	}

	/**
	 * In ra chuỗi đảo ngược theo kí tự và đão ngược
	 * 
	 * @param str
	 */
	public static String reverseString(String str) {
		str = str.trim();
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		reverse = reverse.replaceAll("\\s+", " ");
		return reverse;
	}
}
