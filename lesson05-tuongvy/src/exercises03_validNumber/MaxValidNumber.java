package exercises03_validNumber;

import java.util.Scanner;

public class MaxValidNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	}
	
	private static boolean isNumber(String text) {
		if (text.length() == 0 ) {
			System.out.println("Enter chuoi: ");
		}
		
		for (int i = 0; i < text.length(); i++) {
			
			if (text.charAt(i) > '0' && text.charAt(i) < '9') {
				System.out.println(text.charAt(i));
			}
			
			else if (text.charAt(i) < '0' || text.charAt(i) > '9'){
				System.out.println(text.substring(0, i) + text.substring(i));
			}
		}
		return false;
	
	}
		
		
	public static int getMaxValidNumber() {
		return 0;
		
	}
	
	
}
