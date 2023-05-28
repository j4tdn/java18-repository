package view;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		System.out.print("nhập chuỗi 1: ");
		String s1 = ip.nextLine();
		System.out.print("Nhập chuỗi 2: ");
		String s2 = ip.nextLine();
		
		if(IsLandLanguage(s1, s2)) {
			System.out.println("2 chuỗi đó là đảo ngữ");
		} else {
			System.out.println("2 chuỗi đó không là đảo ngữ");
		}
		
		
	}
	
	private static boolean IsLandLanguage(String s1, String s2) {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		if(s1.length() != s2.length()) {
			return false;
		}
		
		for(int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(s2.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
