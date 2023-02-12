package exercises;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập K: ");
		int k = ip.nextInt();
		String str = "";
		
		for (int i = 1; i < 1000; i++) {
			str += "" + i;
		}
		System.out.println("Kết quả: " + str.charAt(k - 1));
	}
}