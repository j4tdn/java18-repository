package control;

import java.time.YearMonth;
import java.util.Scanner;

public class Ex05LoopDoWhile {
	public static void main(String[] args) {
		// Nhap vao nam sinh --> In ra tuoi cua ban
		// Nếu nhập thành công --> in ra tuổi của bạn
		// Nếu nhập sai        --> yêu cầu nhập lại --> Quay lại B1
		
		Scanner ip = new Scanner(System.in);
		
		int wrongTimes = 0;
		
		String preYob = "";
		do {
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + "): " : ": ";
			System.out.print("Enter your YOB" + suffix);
			preYob = ip.nextLine();
			if(isNumber(preYob)) {
				break;
			}
			wrongTimes++;
			if (wrongTimes == 3) {
				System.out.println("wrong times = 3 ... Exit ...");
				System.exit(0); //Dừng hẳn chương trình
			}
		} while(true);
		
		
		int yob = Integer.parseInt(preYob);
		
		int currentYear = YearMonth.now().getYear();
		System.out.println("Current year: " + currentYear);
		
		System.out.println("==> Your age: " + (currentYear - yob));
	}
	
//	private static boolean isInvalidNumber(String text) {
//		return !isNumber(text);
//	}
	
	private static boolean isNumber(String text) {
		if (text.length() == 0) {
			return false;
		}
		for (int i = 0; i < text.length(); i ++) {
			char letter = text.charAt(i);
			if (letter < '0' || letter > '9') {
				return false;
			}
		}
		return true;
	}
}
