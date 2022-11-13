package Lesson02Exercises;

import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		String preNum = "";
		
		do {
			
			System.out.print("Enter number: " );
			preNum = ip.nextLine();
			if (isValidNumber(preNum)) {
					break;
			}
		} while (true);
		
		int Num = Integer.parseInt(preNum);
		System.out.println(Num + " = " + convertBinary(Num));
	}
	
	private static boolean isValidNumber (String text) {
		if (text.length() == 0) {
			return false;
		}
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (letter < '0' || letter > '9') {
				return false;
			}
		}
		return true;
	}
	
	private static String convertBinary (int Num) {
		int binary [] = new int [40];
		int index = 0;
		String result = "";
		while (Num > 0) {
			binary [index++] = Num % 2 ;
			Num = Num / 2;
		}
		for (int i = index -1 ; i >= 0; i--) {
			result += binary[i];
		}
		return result;
	}
}
