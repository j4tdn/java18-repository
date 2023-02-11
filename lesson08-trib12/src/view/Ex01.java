package view;

import java.util.Scanner;
public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("nhap vao chuoi ki tu bat ki: ");
		String string = ip.nextLine();
		System.out.println("in ra 1 ki tu tren 1 dong");
		for (int i = 0; i < string.length(); i++) {
			System.out.println(string.charAt(i));
		}
		System.out.println("in ra moi tu tren moi dong");
		String[] words = string.split("\\s");
		for (String w : words) {
			System.out.println(w);
		}
		System.out.println("in cac ki tu dao nguoc");
		for (int i = string.length() - 1; i >= 0; i--) {
			System.out.println(string.charAt(i));
		}
		System.out.println("chuoi dao nguoc");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.println(words[i]);
		}

	}

}
