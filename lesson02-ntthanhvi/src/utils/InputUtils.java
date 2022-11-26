package utils;

import java.util.Scanner;

public class InputUtils {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static int input(String prefix, int maxWrongTimes) {
		int wrongTimes = 0;
		String text = "";
		
		do {
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + "):" : ":";
			System.out.print(prefix + suffix);
			text = ip.nextLine();
			// {0,} --> số lượng ký tự từ 0 đến n = *
			if (text.matches("[1-9][0-9]*")|| text.matches("[0][0-9]*")) {
				break;
			}
			wrongTimes++;
			if (wrongTimes == maxWrongTimes) {
				System.out.println("Wrong time = " + maxWrongTimes + "... Exit...");
				System.exit(0);
			}
		} while (true); 
		
		 return Integer.parseInt(text);
	}
}
