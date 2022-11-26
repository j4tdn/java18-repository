package view;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n;
		do {

			System.out.println("Enter N:");
			 n = ip.nextInt();
		} while (n < 9);
		// a1 la so ban dau
		// a2 la so dao nguoc
		int a1 = n, a2 = 0, d;
		while (n != 0) {
			d = n % 10;
			a2 = a2 * 10 + d;
			n = n / 10;
		} 

		if (a1 == a2) {
			System.out.println("N la so doi xung");
		} else {
			System.out.println("N la khong phai so doi xung");
		}
		
	}
}
