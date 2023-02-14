package control;

import java.util.Scanner;

public class Ex01IfElseDemo {
	public static void main(String[] args) {
		// 1. Nhập vào một số nguyên ==> Kiểm tra một số là chẵn hay lẻ
		//   + Nếu chẵn ==> "This is even number"
		//   + Nếu lẻ   ==> "This is odd number"

		// Input an int number
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter n: ");

		int n = ip.nextInt();

		// Check even or odd
		if (n % 2 == 0) {
			System.out.println("This is even number");
		} else {
			System.out.println("This is odd number");
		}
		
		// Tìm học lực học viên: getLevel(float point): String
		// BAD(<5), MEDIUM[5, 6.4], PRETTY_GOOD[6.5, 7.9], GOOD[>=8]
		
		System.out.println("Enter point: ");
		float point = ip.nextFloat();
		String level = "";
		
		// Cách 1:
		if (point < 5f) {
			level = "BAD";
		} else if (point <= 6.4f) { // of course >=5
			level= "MEDIUM";
		} else if (point <= 7.9f) { // of course >= 6.5
			level= "PRETTY_GOOD";
		} else {
			level = "GOOD";
		}
		
		System.out.println("Level (main) ==> " + level);
		System.out.println("Level (below function) ==> " + getLevel(point));

	}
	
	// Trong 1 hàm, khi gặp từ khóa "return" --> trả về KQ và kết thúc hàm
	// => có thể bỏ "else" cho trường hợp bên dưới nhờ có "return" 
	// Cách 2
	private static String getLevel(float point) {
		if (point < 5f) {
			return "BAD";
		}
		if (point <= 6.4f) { // of course >=5
			return "MEDIUM";
		}
		if (point <= 7.9f) { // of course >= 6.5
			return "PRETTY_GOOD";
		}
		return "GOOD";
	}

}
