package control;

import java.time.YearMonth;
import java.util.Scanner;

public class Ex05LoopExercises {
	public static void main(String[] args) {
		//B1: Nhap vao nam sinh
		//B2: Neu nhap dung --> in ra tuoi cua ban --> thoat chuong trinh
		//B3: Neu nhap sai --> yeu cau nhap lai --> quay lai B2
		
		Scanner ip = new Scanner(System.in);
		
		int wrongTime = 0;
		String preYob = "";
		
		do {
			String suffix = wrongTime > 0 ? "(" + wrongTime + ")" : ":";
			System.out.println("Enter your YOB again: " + suffix);
			preYob = ip.nextLine();
			if (isNumber(preYob)) {
				break;
			}
			wrongTime++;
			if (wrongTime ==3) {
				System.out.println("WrongTime = 3....Exit...");
				System.exit(0);
			}
		}while(true);
		int yob = Integer.parseInt(ip.nextLine());
	
		int currentYear = YearMonth.now().getYear();
		System.out.println("Current year: " + currentYear);
		
		System.out.println("==> Your age: " + (currentYear - yob));
	}
	
	private static boolean isInValidNumber(String text) {
		return !isNumber(text);
	}
	
	private static boolean isNumber(String text) {
		if (text.length() == 0) {
			return false;
		}
		for(int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (letter < '0' || letter > '9') {
				return false;
			}
			
		}
		return true;
		
	}

}
