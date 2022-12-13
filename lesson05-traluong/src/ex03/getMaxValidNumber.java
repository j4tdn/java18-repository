package ex03;

import java.util.Scanner;

public class getMaxValidNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		System.out.println("String --> ");
		str = sc.nextLine();
		System.out.println("Max valid number --> " + getMaxNumberFromString(str));
	}

	public static int getMaxNumberFromString(String str) {
		int maxValidNumber;
		int countForArr = 0;
		int[] arrForNumber = new int[str.length()];
		char ch;
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			while (ch >= '0' && ch <= '9') {
				temp += ch;
				i++;
				ch = str.charAt(i);
			}
			if (temp != "") {
				arrForNumber[countForArr++] = Integer.parseInt(temp);
			}
			;
			temp = "";
		}
		for (int num : arrForNumber) {
			System.out.println(num);
		}
		System.out.println(arrForNumber.length);
		maxValidNumber = getMaxNumberFromArray(arrForNumber);

		return maxValidNumber;
	}

	public static int getMaxNumberFromArray(int[] arr) {
		int max = arr[0];

		for (int num : arr) {
			if (num > max)
				max = num;
		}
		return max;
	}
}
