package control;

import java.util.Scanner;

public class Ex01IfElseDemo {
	public static void main(String[] args) {
		
		// 1. Nhập vào 1 số nguyên (n) --> kiểm tra 1 số là chẵn hay lẻ
		//   + Nếu chẵn thì "This is even number"
		//   + Nếu lẽ thì do nothing
		
		// 2. Nhập vào 1 số nguyên (n) --> kiểm tra 1 số là chẵn hay lẻ
		//   + Nếu chẵn thì "This is even number"
		//   + Nếu lẽ thì "This is odd number"
		
		Scanner ip = new Scanner(System.in); 
		System.out.println("Number: ");
		float number = ip.nextFloat();
		/* boolean isPower = (number % 2 == 0);
		if (isPower) {
			System.out.println(number + " This is even number ");
		} else {
			System.out.println(number + " This is odd number ");
		} 
		*/
		
		
		// Tìm học lực học viên: getLevel (float point) : String
		// BAD (<5), MEDIUM [5, 6.4], PRETTY_GOOD[6.5, 7.9], GOOD[>=8]
		
		System.out.println(" getLevel ==> " + getLevel (number));
	}
	// trong 1 hàm, khi gặp từ Return thì trả về KQ và kết thúc hàm
	private static String getLevel (float point) {
		if (point < 5f) {
			return "BAD";
		} if (point <= 6.4f) {
			return "MEDIUM";
		} if (point <= 7.9f) {
			return "PRETTY_GOOD";
		} 
		return "GOOD";
	
	}
	
}
