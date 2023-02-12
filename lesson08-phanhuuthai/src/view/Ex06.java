package view;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("nhập k: ");
		int k = ip.nextInt();
		StringBuilder string = new StringBuilder();
		
		
		for(int i = 0; i<= 1000; i++) {
			string.append(i + "");
		}
		
		System.out.println("số ở vị trí thứ 100: " + string.charAt(k-1));
	}
}
