package demo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean status = false;
		do {
			System.out.println("Enter a string: ");
			String input = sc.nextLine();
			try {
				if (isValidate(input)) {
					status = true;
					capitalizeFirstLetter(input);
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (!status);	
	}
	private static boolean isValidate(String input) throws Exception {
		String regix = "[a-zA-Z\\s]+";
		if(!Pattern.matches(regix, input)){
			throw new Exception("Invalid input string !");
		}
		return true;
	}
	private static void capitalizeFirstLetter(String input){
		System.out.println("----------------------------");
		String result = "";
		for(int i = 0 ; i<input.length();i++) {
			String value = String.valueOf(input.charAt(i));
			if(i == 0 || String.valueOf(input.charAt(i-1)).equals(" ")) {
				value = String.valueOf(input.charAt(i)).toUpperCase();
			}
			result += value;
		}
		System.out.println(result);
	}
}
