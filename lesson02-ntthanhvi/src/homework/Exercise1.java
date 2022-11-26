package homework;

import java.util.Scanner;

	// Kiểm tra số nguyên dương n nhập từ bàn phím
	// Có phải bội của 2
	// Không hợp lệ --> nhập lại tối đa 5 lần

public class Exercise1 {
	public static void main(String[] args) {
		
		int wrongTimes = 0;
		Scanner ip = new Scanner(System.in);
		String preNumber = "";
		
		do {
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + "):" : ":";
			System.out.print("Enter N (N>0)" + suffix);
			preNumber = ip.nextLine();
			// {0,} --> số lượng ký tự từ 0 đến n = *
			if (preNumber.matches("[1-9][0-9]*")|| preNumber.matches("[0][0-9]*")) {
				break;
			}
			wrongTimes++;
			if (wrongTimes == 5) {
				System.out.println("Wrong time = 5 ... Exit...");
				System.exit(0);
			}
		} while (true); 
		
		int n = Integer.parseInt(preNumber);
		if (isEven(n)) {
			System.out.println(n + " Is even number");
		} else {
			System.out.println(n + " Is an odd number");
		}
	}

	private static boolean isEven(int number) {
			return number % 2 == 0;
		
	}
}
