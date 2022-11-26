package homework;

import java.util.Scanner;

public class Ex01MultipleOfTwo {
	public static void main(String[] args) {
		int wrongTimes = 0;
		Scanner ip = new Scanner(System.in);
		String text = " ";
		do {
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + "):" : ":";
			System.out.println("Enter N(N>0)" + suffix);
			text = ip.nextLine();
			if (text.matches("[1-9][0-9]{0,}") || text.matches("[0][0-9]{1,}")){
				break;
			}
			wrongTimes++;
			if (wrongTimes == 5) {
				System.out.println("wrong times = 5 .. exit ..");
				System.exit(0);
			}
		} while (true);

		int n = Integer.parseInt(text);

		if (isEven(n)) {
			System.out.println(n + "is an even number !");
		} else {
			System.out.println(n + "is an odd number !");
		}
	}

	private static boolean isEven(int number) {
		return number % 2 == 0;
	}
}
