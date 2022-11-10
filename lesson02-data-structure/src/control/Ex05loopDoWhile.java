package control;

import java.time.YearMonth;
import java.util.Scanner;

public class Ex05loopDoWhile {
	public static void main(String[] args) {
//		nhap vao nam sinh --> in ra tuoi
//		neu nhap thanh cong --> in ra
//		neu nhap sai --> yeu cau nhap lai
		
		
		int wrongTime = 0;
		Scanner ip = new Scanner(System.in);
		
		String preYob ="";
		do {
			 String suffix = wrongTime > 0 ? "(" + wrongTime + "):" : ":";
			 System.out.println("please enter valid YOB: "+ suffix);
			 preYob = ip.nextLine();
			 if(isNumber(preYob)) {
				 break;
			 }
			 wrongTime++;
			 if(wrongTime == 3) {
				 System.out.println(" wrong 3 ");
				 System.exit(0);
			 }
		}while (true);
			int yob = Integer.parseInt(preYob);
			int currentyear = YearMonth.now().getYear();
			System.out.println(" current year: "+ currentyear);
			System.out.println("==>your age: "+ (currentyear - yob));
			
		
		

				
			
		
	}
	private static boolean isNumber(String text) {
		if(text.length() == 0) {
			return false;
		}
		for (int i = 0; i<text.length(); i++) {
			char letter = text.charAt(i);
			if (letter <'0' || letter > '9') {
				return false;
			}
		}
		return true;
			
	}
	private static boolean isInValidNumber(String text) {
		return !isNumber(text);
	}
	

}
