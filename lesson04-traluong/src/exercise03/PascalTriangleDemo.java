package exercise03;

import java.util.Scanner;

public class PascalTriangleDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String prevLine = "1 1";
		String thisLine;
		int n;
		System.out.println("Get number of line: ");
		n = sc.nextInt();
		System.out.println("================");
		
		for (int i = 1; i < n; i++) {
			thisLine = calThisLine(i, prevLine);
			System.out.println(thisLine);
		}
		
	}
	public static String calThisLine(int col, String prevLine) {
		String line = "";
		String st;
		String num;
		
		return line;
	}
	
}
