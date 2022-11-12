package view;

import java.util.Scanner;

/**
 * 
 * 	Viết chương trình tìm số nguyên lớn, nhỏ nhất trong 3 chữ số a,b,c
	Biết rằng a,b,c là số nguyên được nhập từ bàn phiasm và nhỏ hơn 20 [0, 20)
	VD: Nhập a = 6
		Nhập b = “xyz” -> báo lỗi, yêu cầu nhập lại
		Nhập b = 12
		Nhập c = 8
		Số lớn nhất là 12
		Số nhỏ nhất là 6
 *
 */
public class Ex06MaxMinNumber {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String a = "";
		String b = "";
		String c = "";
		do {
			System.out.print("Enter valid a ( < 20 ): ");
			a = ip.nextLine();
			if (isNumber(a)) {
				break;
			}
			System.out.println("\n==================Error=================\n");
		} while (true);
		do {
			System.out.print("Enter valid b ( < 20 ): ");
			b = ip.nextLine();
			if (isNumber(b)) {
				break;
			}
			System.out.println("\n==================Error=================\n");
		} while (true);
		do {
			System.out.print("Enter valid c ( < 20 ): ");
			c = ip.nextLine();
			if (isNumber(c)) {
				break;
			}
			System.out.println("\n==================Error=================\n");
		} while (true);
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		int c1 = Integer.parseInt(c);
		System.out.println("Max(" + a + "," + b + "," + c + ") = " + max(a1, b1, c1));
		System.out.println("Min(" + a + "," + b + "," + c + ") = " + min(a1, b1, c1));
	}

	private static boolean isNumber(String txt) {
		if (txt.length() == 0) {
			return false;
		}
		for (int i = 0; i < txt.length(); i++) {
			if (txt.charAt(0) == '-') {
				for (int j = i + 1; j < txt.length(); j++) {
					char c = txt.charAt(j);
					if (c < '0' || c > '9') {
						return false;
					}
				}
				return true;
			}
			char letter = txt.charAt(i);
			if (letter < '0' || letter > '9') {
				return false;
			}
		}
		int n = Integer.parseInt(txt);
		if (n >= 20) {
			return false;
		}
		return true;
	}

	private static int max(int a2, int b2, int c2) {
		int max = a2;
		if (max < b2) {
			max = b2;
		}
		if (max < c2) {
			max = c2;
		}
		return max;
	}

	private static int min(int a2, int b2, int c2) {
		int min = a2;
		if (min > b2) {
			min = b2;
		}
		if (min > c2) {
			min = c2;
		}
		return min;
	}
}