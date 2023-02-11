package view;

import java.util.Scanner;
public class Ex06 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập K: ");
		int k = ip.nextInt();
		String string = "";
		for (int i = 1; i < 1000; i++) {
			string += "" + i;
		}
		System.out.println("Result: " + string.charAt(k - 1));
	}

}
