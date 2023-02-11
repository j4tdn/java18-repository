package exercises;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Input something : ");
		String input = ip.nextLine();
		System.out.println("------- 1 -------");
		for (int i = 0; i < input.length(); i++) {
			System.out.println(input.charAt(i));
		}
		System.out.println("------- 2 -------");
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == ' ') {
				System.out.println();
				continue;
			}
			System.out.print(input.charAt(i));
		}
		System.out.println();
		System.out.println("------- 3 -------");
		for(int i = input.length() - 1; i >= 0; i--) {
			System.out.print(input.charAt(i));
		}
		System.out.println();
		System.out.println("------- 4 -------");
		String[] strings = new String[10];
		int count = 0;
		String temp = "";
		for (int i = 0; i < input.length(); i++) {
			temp += input.charAt(i);
			if(input.charAt(i) == ' ' || i == input.length() - 1) {
				strings[count++] = temp;
				temp = "";
				continue;
			}
		}
		for(int i = strings.length - 1; i >= 0; i--) {
			if(strings[i] != null) {
				System.out.print(strings[i] + " ");
			}
		}
	}
}
