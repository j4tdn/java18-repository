package exercise;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter: ");
	    String input = sc.nextLine();

	    String[] words = input.split(" ");

	    for (int i = 0; i < words.length; i++) {
	      words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
	    }

	    String result = String.join(" ", words);
	    System.out.println(result);
	  }
}
