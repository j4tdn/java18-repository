package homework;

import java.util.Scanner;

public class Bt06SmallestAndLargest {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String atest = "", btest = "", ctest = "";
		int wrongtime = 0;
		do {
			String inra = wrongtime > 0 ? "sai rồi , nhập lại " : "nhập";
			System.out.println(inra + "a = ");
			atest = ip.nextLine();
			if (isNumber(atest)) {
				break;
			}
			wrongtime++;
		} while (true);
		int a = Integer.parseInt(atest);
		wrongtime = 0;
		do {
			String inra = wrongtime > 0 ? "sai rồi , nhập lại " : "nhập";
			System.out.println(inra + "b = ");
			btest = ip.nextLine();
			if (isNumber(btest)) {
				break;
			}
			wrongtime++;
		} while (true);
		int b = Integer.parseInt(btest);
		wrongtime = 0;
		do {
			String inra = wrongtime > 0 ? "sai rồi , nhập lại " : "nhập";
			System.out.println(inra + "c = ");
			ctest = ip.nextLine();
			if (isNumber(ctest)) {
				break;
			}
			wrongtime++;
		} while (true);
		int c = Integer.parseInt(ctest);
		int max = 0, min = 0;
		if (a >= b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		if (max <= c) {
			max = c;
		}
		if (min >= c) {
			min = c;
		}
		System.out.println("số lớn nhất là " + max);
		System.out.println("số bé nhất là " + min);
	}

	private static boolean isNumber(String a) {
		if (a.length() == 0) {
			return false;
		}
		for (int i = 0; i < a.length(); i++) {
			char letter = a.charAt(i);
			if (letter < '0' || letter > '9') {
				return false;
			}
		}
		return true;
	}
}
