package io;

import java.util.Scanner;

public class Ex01BasicIoDemo {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("nhập họ : ");
		String họ = a.nextLine();
		System.out.println("nhập tên : ");
		String tên = a.nextLine();
		System.out.println("nhập tuổi : ");
		int tuổi = Integer.parseInt(a.nextLine());
		System.out.println("nhập Gmail : ");
		String gmail = a.nextLine();
		
		System.out.println(họ + " " + tên + " " + tuổi + " " + gmail);
	}
}
