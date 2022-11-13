package control;

import java.time.Year;
import java.time.YearMonth;
import java.util.Scanner;

/**
 * while    --> kiểm tra từ điều kiện đầu tiên
 * 
 * do while --> body (do{}) ít nhất thực hiện 1 lần
 *          --> bỏ qua lần kiểm tra điều kiện đầu tiên
 *
 */
public class Ex05LoopDoWhile {
	public static void main(String[] args) {
		// B1: nhập vào năm sinh --> in ra tuổi của bạn --> thoát ctr
		// B2: Nếu nhập thành công (số) --> in ra tuổi của bạn
		// B3: Nếu nhập sai (không phải số) --> yêu cầu nhập lại --> quay lại bước 2
		
		int wrongTimes = 0; 
		Scanner ip = new Scanner(System.in);
		
		// System.out.print("Enter your your of birth: ");	
		String preYOB = "";
		do { 
			// Toán tử 3 ngôi
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + "):" : ":";
			// nhập lại
			System.out.println("Please enter valid YOB " + suffix);
			preYOB = ip.nextLine();
			if (isNumber(preYOB)) {
				break;
			}
			wrongTimes++;
			if (wrongTimes == 3) {
				System.out.println("Wrong time = 3 ... Exit...");
				System.exit(0); // dừng hẳn 1 chương trình
			}
		} while (true);
		
		int YOB = Integer.parseInt(preYOB);
		
		int currentYear = YearMonth.now().getYear();
		System.out.println("Current year: " + currentYear);
		
		System.out.println("Your age: " + (currentYear - YOB));
	}
	
	private static boolean isInValidNumber (String text) {
		return !isNumber(text);
	}
	
	// text : ""   
	// text : "123" --> true
	// text : "udhue" --> false
	// 123x567 ==> length = 7
	//             index = [0,7)
	private static boolean isNumber(String text) {
		if (text.length() == 0) {
			return false;
		}
		for (int i =0; i < text.length();i++) {
			char letter = text.charAt(i);
			if (letter < '0' || letter > '9') {
				return false;
			}
		}
		return true;
	}
}
