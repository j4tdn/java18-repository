package view;

import java.util.Scanner;

public class Ex01Mutiple {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	
	String text = "";
	do {
		String suffix = wrongTimes > 0 ? "(" + wrongTimes + "):" : ":";
		text = ip.nextLine();
		if (text.matches("[1-9][0-9]{0,}") || text.matches("[0][0-9]{1,}") {
			wrongTimes++;
			if(wrongTimes == 5) {
				System.out.println("wrongTimes = 5 ... Exit ...");
				System.exit(0);
			}
		}
	}
	int wrongTimes = 0;
	
	
	
	
	System.out.println("Enter N(N>0): ");
	int 
}
}
