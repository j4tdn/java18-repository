package exercises;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String text = "";
		
		do {
			System.out.println("Nhập họ và tên: ");
			text = ip.nextLine();
			boolean isStr = check(text);
			if(isStr) {
				break;
			}
		} while (true);
		
		upcase(text);
		
	}
	public static boolean check(String text) {
		return text.matches(".*[a-z A-Z]+.$");
	}
	
	public static void upcase(String text) {
		String[] words = text.split(" ");
		StringBuilder upcase = new StringBuilder();
		for( String word:words) {
			upcase.append(Character.toUpperCase(word.charAt(0)))
			.append(word.substring(1).toLowerCase())
			.append(" ");
		}
		System.out.println(upcase);
	}
}
