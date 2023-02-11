package exercise;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Nhap chuoi: ");
	    String input = sc.nextLine();

	    // In ra mỗi kí tự trên một dòng
	    System.out.println("Moi ki tu moi dong: ");
	    for (int i = 0; i < input.length(); i++) {
	      System.out.println(input.charAt(i));
	    }

	    // In ra mỗi từ trên mỗi dòng
	    System.out.println("\nMoi tu moi dong: ");
	    String[] words = input.split(" ");
	    for (String word : words) {
	      System.out.println(word);
	    }

	    // In ra chuỗi đảo ngược theo kí tự
	    System.out.println("\nChuoi dao nguoc theo tung ki tu: ");
	    for (int i = input.length() - 1; i >= 0; i--) {
	      System.out.print(input.charAt(i));
	    }
	    System.out.println();

	    // In ra chuỗi đảo ngược theo từ
	    System.out.println("\nChuoi dao nguoc theo tu: ");
	    for (int i = words.length - 1; i >= 0; i--) {
	      System.out.print(words[i] + " ");
	    }
	}
}
