package Control;

import java.time.YearMonth;
import java.util.Scanner;
/**
 * while 	--> kiểm tra từ điều kiện đầu tiên 
 * 
 * do while --> body(do{}) ít nhất thực hiện 1 lần
 * 			--> bỏ qua lần kiểm tra điều kiện đầu tiên
 *
 */

public class Ex05LoopDoWhile {
	public static void main(String[] args) {
		// B1: Nhập vào năm sinh --> in ra tuổi của bạn
		// B2: Nếu nhập thành công --> in ra tuổi của bạn --> thoát chương trình
		// B3: Nếu nhập sai		--> yêu cầu nhập lại --> Quay lại B2
		
		int wrongTimes = 0;
		
		Scanner ip = new Scanner(System.in);
		String preYob = " ";
		do {
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + "):" : ":";
			System.out.print("Please enter valid YOB" + suffix);
			preYob = ip.nextLine();
			if (isNumber(preYob)) {
				break;
			}
			wrongTimes++;
			if (wrongTimes == 3) {
				System.out.println("Wrong times = 3 ../ Exit ...");
				System.exit(0);
			}
		}while(true);
		int yob = Integer.parseInt(preYob);
		
		System.out.print("Enter your YOB: ");
	
		
		
		int currentYear = YearMonth.now().getYear();
		System.out.println("Current year: " + currentYear);
		
		System.out.println("==> Your age: " + (currentYear - yob));
	
	}	
	private static boolean isInValidNumber(String text) {
		return !isNumber(text);
	}
	
	// text : "123"		--> true
	//		: "a12"		--> false
	// 		: "123x789" --> false
	// 123x789 ==> length(độ dài kí tự) = 7
	//				index 				= [0,7)
	private static boolean isNumber(String text){
		
		if (text.length() == 0) {
			return false;
		}
		// duyệt từng phần tử trong chuỗi
		for (int i = 0; i < text.length(); i++) {
			// lấy giá trị tại chỉ số từ 0 là kí tự 1 -> sau đó tăng i lên
			char letter = text.charAt(i);
			if (letter < '0' || letter > '9') {
				return false;
			}
		}
		return true;
	}
}
