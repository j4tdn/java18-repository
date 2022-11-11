package Control;

import java.util.Scanner;

public class Ex01IfElseDemo {
	public static void main(String[] args) {
		// 1. Nhập vào một số nguyên --> Kiểm tra 1 số là chẳn hay lẻ
		// nếu chẵn in ra this is even number
		// nếu lẻ in ra do nothing
		
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter n1: ");
		int n1 = ip.nextInt();
		if (n1 % 2 == 0) {
			System.out.println("this is even number ");
		}
		// 2.Nhập vào 1 số nguyên(n) --> Kiểm tra số đó là chẵn hay lẻ
		// Nếu chẵn ==> this is even number
		// Nếu lẻ ==> this is odd number
		
		System.out.print("Enter n2: ");
		int n2 = ip.nextInt();
		if (n2 % 2 == 0) {
			System.out.println("this is even number ");
		} else {
			System.out.println("this is odd number");
		}
		
		// Tìm học lực học viên: getLevel(float point): String
		// BAD(<5), MEDIUM[5,6.4], PRETTY_GOOD[6.5,7.9], GOOD[>=8]
	
		System.out.print("Enter point: ");
		float point = ip.nextFloat();
		String level = " ";
		
		/*if (point < 5 ) {
			System.out.println("BAD");
		} else {
			if (point <= 6.4) {
				System.out.println("MEDIUM");
			} else {
				if (point >= 7.9) {
					System.out.println("PRETTY_GOOD");
				} else {
					System.out.println("GOOD");
				}
			}
		}*/
		
		
		
		if (point < 5f ) {
			level = "BAD";
		}
		if (point >= 5f && point <= 6.4f) {
			level = "MEDIUM";
		}
		if (point >= 6.5f && point <= 7.9f) {
			level = "PRETTY_GOOD";
		}
		if (point >= 8f) {
			level = "GOOD";
		}
		System.out.println("level 1(main) ==> " + level);
		System.out.println("level 2(getLevel) ==> " + getLevel(point));;
	}
		// trong một hàm khi gặp từ khóa return --> trả về KQ
		// và kết thúc hàm
		
		private static String getLevel(float point) {
			if (point < 5f) {
				return "BAD";
			}
			if (point <= 6.4f) {
				return "MEDIUM";
			}
			if (point <= 7.9f) {
				return "PRETTY_GOOD";
			}
			return "GOOD";
		}
	
}
