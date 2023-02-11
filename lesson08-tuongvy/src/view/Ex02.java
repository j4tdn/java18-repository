package view;

import java.util.Scanner;
import java.util.regex.Pattern;


public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.println("Enter full name: ");
				String s = sc.nextLine();
				if (isValidString(s)) {
					System.out.println("Full name: ");
					firstCapitalization(s);
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}while(true);
		sc.close();
	}
	
	private static boolean isValidString(String s) throws Exception {
		if (!Pattern.matches("[A-Za-z\\s]+", s)) {
			throw new Exception("Enter the full name, including the characters [A-Za-z ]");
		}
		return true;
	}
	
	private static void firstCapitalization(String s) {
		s = s.replaceAll("[\\s]+", " ");
		String[] arr = s.split(" ");
		String resuft = "";
		for (String x : arr) {
			resuft = resuft + (x.substring(0, 1).toUpperCase() + x.substring(1));
			resuft = resuft + " ";
		}
		System.out.println(resuft);
		
	}
}




