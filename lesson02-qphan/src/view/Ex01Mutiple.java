package view;

import java.util.Scanner;

public class Ex01Mutiple {
	public static void main(String[] args) {
		int wrongTimes = 0;
		Scanner ip = new Scanner(System.in);
		
		// System.out.print("Enter your YOB: ");
		String text = "";
		do {
			// Toán tử 3 ngôi
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + "):" : ":";
			// nhập lại
			System.out.print("Enter N(N>0)" + suffix );
			text = ip.nextLine();
			// {0,} --> so luong ki tu tu 0 den n = *
			if (text.matches("[1-9][0-9]{0,}") || text.matches("[0][0-9]{1,}")) { // 2...
				break;
			}
			wrongTimes++;
			if (wrongTimes == 5) {
				System.out.println("Wrong times = 5 ... Exit ...");
				System.exit(0); // dừng hẳn chương trình
			}
		} while(true);
		
		// utility --> utilities --> utils
		int n = Integer.parseInt(text);
		
		if (isEven(n)) {
			System.out.println(n + " is an even number !");
		} else {
			System.out.println(n + " is an odd number !");
		}
	}
	
	private static boolean isEven(int number) {
		return number % 2 == 0;
	}
}
