package exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập chuỗi kí tự: ");
		String text = ip.nextLine();
		
		
		System.out.println("<In ra mỗi ký tự trên một dòng>");
		character(text);
		
		System.out.println("\n<In ra mỗi từ trên mỗi dòng>");
		word(text);
		
		System.out.println("<In ra chuỗi đảo ngược theo kí tự>");
		charReverse(text);
		
		System.out.println("<In ra chuỗi đảo ngược theo từ>");
		wordReverse(text);
	}
	// In ra mỗi ký tự trên một dòng
	public static void character (String text) {
		for(int i = 0; i < text.length(); i++) {
			System.out.print(" " + text.charAt(i));
		}
	}
	
	// In ra mỗi từ trên mỗi dòng
	public static void word(String text) {
		String[] words = text.split(" ");
		for (String word :words) {
			System.out.println(word);
		}
	}
	
	// In ra chuỗi đảo ngược theo kí tự
	public static void charReverse(String text) {
		StringBuilder str = new StringBuilder(text);
		System.out.println(str.reverse().toString());
	}
	
	// In ra chuỗi đảo ngược theo từ ***
	public static void wordReverse(String text) {
		String[] words = text.split(" ");
		Collections.reverse(Arrays.asList(words));
		System.out.println(String.join(" ", words));
	}
}
	