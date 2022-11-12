package view;

import java.util.Scanner;

/**
 *
 * 	Viết chương trình tìm giai thừa của một số nguyên dương N
	Biết rằng: N có thể được nhập từ bàn phím hoặc khai báo sẵn
	Ví dụ: Nhập N = 1 -> 1! = 1
		   Nhập N = 5 -> 5! = 5.4.3.2.1 = 120
 *
 */
public class Ex03Factorial {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter valid N: ");
		int n = ip.nextInt();
		System.out.println(n + "! = " + factorial(n));
	}

	public static int factorial(int num) {
		if (num == 0) {
			return 1;
		}
		return num * factorial(num - 1);
	}

}
