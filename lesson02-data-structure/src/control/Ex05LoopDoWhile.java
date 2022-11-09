package control;

import java.time.YearMonth;
import java.util.Scanner;

public class Ex05LoopDoWhile {
	public static void main(String[] args) {
		// Nhap nam sinh --> in ra tuoi
		
		Scanner ip = new Scanner(System.in);
		int wrongTimes = 0;
		String preYob = "";
		do {
			if(wrongTimes != 0) {
				System.out.println("Wrong time : " + wrongTimes);
			}
			System.out.print("Enter your Year of birth : ");
			preYob = ip.nextLine();
			wrongTimes++;
			if(wrongTimes == 3) {
				System.out.println("Wrong time : " + wrongTimes);
				return;
			}
		} while(isNumber(preYob) == false);
		
		int currentYear = YearMonth.now().getYear();
		int yob = Integer.parseInt(preYob);
		
		System.out.println(currentYear);
		System.out.println("===> Your age : " + (currentYear - yob));
	}
	
	public static boolean isNumber(String s) {
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) < '0' || s.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}
	
	//toán tử 3 ngôi
	// String suffix = wrongTimes > 0 ? "(" + wrongTimes + ") : " : " : ";
	
}
