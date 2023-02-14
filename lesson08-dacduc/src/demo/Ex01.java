package demo;

import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean status = false;
		do {
			System.out.println("Enter a string: ");
			String input = sc.nextLine();
			try {
				if (isValid(input)) {
					status = true;
					printCharInLine(input);
					printWordPerLine(input);
					printReverseByChar(input);
					printReverseByStr(input);
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (!status);	
	}

	public static boolean isValid(String input) throws Exception {
		String regix = "^[\\p{L} ]+$";
		if (!Pattern.matches(regix, input))
			throw new Exception("The string must contain Vietnamese characters with accents and space keys.");
		return true;
	}
	public static void printCharInLine(String input){
		System.out.println("------------------------------");
		for (int i = 0; i < input.length(); i++) {
			System.out.println(input.charAt(i));
		}
	}
	public static void printWordPerLine(String input){
		System.out.println("------------------------------");
		String[] line = input.split(" ");
		for (String value : line) {
			System.out.println(value);
		}
	}
	public static void printReverseByChar(String input){
		System.out.println("------------------------------");
		StringBuilder newString = new StringBuilder(input);
		System.out.println(newString.reverse());
	}
	public static void printReverseByStr(String input){
		System.out.println("------------------------------");
		String[] line = input.split(" ");
		String space = " ";
		for(int i = line.length-1;i>=0;i--) {
			if(i != 0) line[i]+=space;
			System.out.print(line[i]);
		}
	}
	

}
