package view;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("nhập chuỗi ký tự: ");
		String s = ip.nextLine();
		System.out.println("1. in ra mỗi ký tự 1 dòng");
		for(int i = 0; i< s.length();i++) {
			System.out.println(s.charAt(i));
		}
		System.out.println("2. in mỗi từ trên 1 dòng");
		String[] as = s.split("\\s");
		for(String n : as) {
			System.out.println(n);
		}
		
		System.out.println("3. in ra chuỗi đảo ngược theo ký tự");
		for(int i = s.length() - 1; i >= 0;i--) {
			System.out.println(s.charAt(i));
		}
		
		System.out.println("4. in ra chuỗi đảo ngược theo từ");
		for(int i = as.length - 1; i >= 0;i--) {
			System.out.println(as[i]);
		}
	}
}
