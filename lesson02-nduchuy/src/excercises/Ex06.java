package excercises;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {;
		int compareNumber[] = new int[3];
		for (int i = 0; i < 3; i++) {
			compareNumber[i] = input(i);
		}
		compare(compareNumber);
	}

	private static boolean isNumber(String text) {
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

	private static int input(int index) {
		Scanner sc = new Scanner(System.in);
		String preNumber = "";

		do {
			System.out.print("Please enter valid number "+(index + 1)+" :");
			preNumber = sc.nextLine();
			if (isNumber(preNumber)) {
				if (Integer.parseInt(preNumber) < 20) {
					break;
				}
			}
		} while (true);

		int number = Integer.parseInt(preNumber);
		return number;
	}

	private static void compare(int compareNumber[]) {
		int max=0;
		int min=20;
		for(int i = 0;i<compareNumber.length;i++) {
			if(max<compareNumber[i]) {
				max=compareNumber[i];
			}
		}
		for(int i = 0;i<compareNumber.length;i++) {
			if(min>compareNumber[i]) {
				min=compareNumber[i];
			}
		}
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
	}
}
