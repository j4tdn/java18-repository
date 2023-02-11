package view;

import java.util.Scanner;
public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String string = "";
		do {
			System.out.print("nhap go ten ");
			string = ip.nextLine();
			if (string.matches("[a-zA-Z ]+")) {
				break;
			} else {
				System.out.println("ho va ten gom ca ki tu [A-Za-z]!!!");
			}
		} while (true);
		String capitalizeWord = "";
		String[] words = string.split("\\s");
		for (String w : words) {
			String rs = "";
			String first = w.substring(0, 1);
			String afterfirst = w.substring(1);
			char[] strArr = afterfirst.toCharArray();
			for (int i = 0; i < strArr.length; i++) {
				if (strArr[i] >= 'A' && strArr[i] <= 'Z') {
					strArr[i] = (char) ((int) strArr[i] + 32);
				}
			}
			for (int i = 0; i < strArr.length; i++) {
				rs += strArr[i];
			}
			capitalizeWord += first.toUpperCase() + rs + " ";
		}
		System.out.println("Result: " + capitalizeWord.trim());
	}
	

}
