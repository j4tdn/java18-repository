package Lesson02Exercises;

import java.util.Scanner;

	// Kiểm tra số nguyên dương n nhập từ bàn phím
	// Có phải bội của 2
	// Không hợp lệ --> nhập lại tối đa 5 lần

public class Exercise1 {
	public static void main(String[] args) {
		
		int wrongTimes = 0;
		Scanner ip = new Scanner(System.in);
		String preNumber = "";
		
		do {
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + "):" : ":";
			System.out.print("Please enter valid n " + suffix);
			preNumber = ip.nextLine();
			if (isNumber(preNumber)) {
				break;
			}
			wrongTimes++;
			if (wrongTimes == 5) {
				System.out.println("Wrong time = 5 ... Exit...");
				System.exit(0);
			}
		} while (true); 
		
		int Number = Integer.parseInt(preNumber);
		if (Number % 2 == 0 && Number != 0) {
			System.out.println("Is Multiple Of 2");
		} else {
			System.out.println("Is not multiple of 2");
		}
	}
	private static boolean isInValidNumber (String text) {
		return !isNumber(text);	
	}
	
	private static boolean isNumber(String text) {
		if (text.length() == 0) {
			return false;
		}
		for (int i =0; i < text.length();i++) {
			char letter = text.charAt(i);
			if (letter < '0' || letter > '9') {
				return false;
			}
		}
		return true;
	}
}
