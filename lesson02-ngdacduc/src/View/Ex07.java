package View;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = Integer.parseInt(sc.nextLine());
		int temp = number;
		String preResult = "";
		String result = "";
		System.out.print(number + "-->");
		if (number == 0) {
			preResult += 0;
		} else {
			while (true) {
				if (temp == 0)
					break;
				int remainder;
				remainder = temp % 2;
				preResult += remainder;
				temp = temp / 2;
			}
		}
		if (preResult.length() == 1) {
			result = preResult;
		}
		else {
			int i = preResult.length()-1;
			while(i>=0) {
				result+=preResult.charAt(i);
				--i;
			}
		}
		System.out.print(result);
	}
}
