package View;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int wrongTimes = 0;
		String input = "";
		Scanner sc = new Scanner(System.in);
		do {
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + ") :" : ":";
			System.out.println("Please enter the number " + suffix);
			input = sc.nextLine();
			if (isValidNumber(input)) {
				break;
			}
			wrongTimes++;
		} while (true);
		int preResult = Integer.parseInt(input);
		int result = 1;
		System.out.print(preResult +"!=");
		if(preResult == 1) {
			result = preResult;	
		}
		
		for(int i = preResult; i>1; i--) {
			result*=i;
			if(i==2) {
				System.out.print(i + ".1=");
				break;
			}
			System.out.print(i+".");
			
		}
		System.out.print(result);
	}

	public static boolean isValidNumber(String input) {
		boolean checkIsValidNumber = true;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) < '0' || input.charAt(i) > '9') {
				checkIsValidNumber = false;
				break;
			}
		}
		return checkIsValidNumber;
	}
}
