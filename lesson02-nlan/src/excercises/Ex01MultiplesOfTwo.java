package excercises;

import java.util.Scanner;

/**Viết chương trình kiểm ra số nguyên N có phải là bội của 2 hay không
	* Yêu cầu: N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu
	* N không hợp lệ (tối đa 5 lần)
	* Vd: Nhập N = abc -> báo lối, yêu cầu nhập lại
	*  			 = 4 -> true
	*			 = 6 -> true
	*			 = 7 -> false
	*/			

public class Ex01MultiplesOfTwo {
	public static void main(String[] args) {
		
		int wrongTimes = 0;
		
		Scanner ip = new Scanner(System.in);
		String n = "";
		do {
			String suffix = "(" + wrongTimes + "):";
			if (wrongTimes > 0) {
				System.out.print("Please enter valid interger" + suffix);
			} else {
				System.out.print("Please enter your number: ");
			}
			n = ip.nextLine();
			if (isNumber(n)) {
				break;
			}
			wrongTimes++;
			if (wrongTimes == 5) {
				System.out.println("Wrong times = 5 ../ Exit ...");
				System.exit(0);
			}
		}while(true);
		int number = Integer.parseInt(n);
		if (number%2 == 0) {
			System.out.println(number + " -> true");
		} else {
			System.out.println(number + " -> false");
		}
	
	}
	//  text: "4" 	-> true
	//		: "abc"	-> lỗi
	private static boolean isNumber(String text) {
		if (text.length() == 0) {
			return false;
		}
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (letter < '0' || letter > '9') {
				return false;
			}
		}
		return true;
	}
}