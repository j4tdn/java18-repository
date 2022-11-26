package view;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// Viết chương trình tìm số nguyên lớn, nhỏ nhất trong 3 chữ số a,b,c
		// Biết rằng a,b,c là số nguyên được nhập từ bàn phiasm và nhỏ hơn 20 [0, 20)
		Scanner ip = new Scanner(System.in);
		int a, b, c;

		do {
			System.out.print("Enter valid number a: ");
			a = ip.nextInt();

		} while (a >= 20);

		do {
			System.out.print("Enter valid number b: ");
 
			b = ip.nextInt();

		} while (b >= 20);

		do {
			System.out.print("Enter valid number c: ");

			c = ip.nextInt();
		} while (c >= 20);

		if (a > b && a > c) {
			System.out.println("Max number: " + a);
		} else if (b > a && b > c) {
			System.out.println("Max number: " + b);
		} else {
			System.out.println("Max number: " + c);
		}
		
		if (a < b && a < c) {
			System.out.println("Min number: " + a);
		} else if (b < a && b < c) {
			System.out.println("Min number: " + b);
		} else {
			System.out.println("Min number: " + c);
		}

	}
}