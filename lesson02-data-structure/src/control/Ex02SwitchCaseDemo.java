package control;

import java.util.Scanner;

public class Ex02SwitchCaseDemo {

	public static void main(String[] args) {
		// khi các biểu thức if else cho toán tử == ( nhớ )
		// --> thay thế bằng switch case
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = ip.nextInt();
		String s = "";
//		switch (n) {
//		case 1:
//			s ="1";
//			break;
//		case 2:
//			s ="2";
//			break;
//		case 3:
//			s ="3";
//			break;
//		default:
//			s ="4";
//		}
//		System.out.println("s = " +s);
		switch (n) {
		case 1:

		case 3:

		case 5:

		case 7:

		case 8:

		case 10:

		case 12:
			System.out.println("Tháng này có 31 ngày !!");
			break;
		case 4:

		case 6:

		case 9:

		case 11:
			System.out.println("Tháng này có 30 ngày !!");
			break;

		default:
			System.out.println("Input không hợp lệ !!");
		}
	}

}
