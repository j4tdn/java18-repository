package view;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("nhập họ và tên: ");
		String s = ip.nextLine();
		String n = s.toLowerCase();
		System.out.println(n);
		String[] as = n.split("\\n");
		for(int i = 0; i < as.length; i++) {
			as[i].charAt(0);
		}
		for(int i = 0; i < as.length; i++) {
			System.out.print(as[i] + " ");
		}
	}
}
