package exam;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("input: ");
		String input = ip.nextLine();
		System.out.println(reverst(input));
	}
	public static String reverst(String input) {
		input = input.trim();
		input = input.replaceAll("\\s+", " ");
		
		String reverse = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			reverse += input.charAt(i);
		}
		return reverse;
	}
}
