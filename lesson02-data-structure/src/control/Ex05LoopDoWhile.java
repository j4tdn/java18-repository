package control;

import java.time.YearMonth;
import java.util.Scanner;

public class Ex05LoopDoWhile {

	public static void main(String[] args) {
		//Nhập vào năm sinh --> in ra tuổi của bạn
		//Nếu nhập thành công --> in ra tuổi
		//Nếu nhập sai --> yêu cầu nhập lại
		Scanner ip = new Scanner(System.in);
		int wrongTimes = 0;

		String preYob = "";
//		while(!isDigit(preYob)) {
//			System.out.print("Enter your YOB again: ");
//			preYob = ip.nextLine();
//		}
		
		do {
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + "): " : ":";
			System.out.print("Enter your YOB" + suffix);
			preYob = ip.nextLine();
			if(isNumber(preYob)) {
				break;
			}
			
			wrongTimes++;
			if(wrongTimes == 3) {
				System.out.println("Wrong times = 3...Exit...");
				System.exit(0);
			}
		} while(true);
		
		int yob = Integer.parseInt(preYob);
		int currentYear = YearMonth.now().getYear();
		System.out.println("Current year: " + currentYear);
		System.out.println("==> Your age: " + (currentYear - yob));

	}
	
	private static boolean isInValidNumber(String text) {
		return !isNumber(text);
	}
	
	private static boolean isNumber(String text) {
		if(text.length() == 0) {
			return false;
		}
		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) < '0' || text.charAt(i)> '9') {
				return false;
			}

		}
		return true;
	}

}
