package view;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n = ip.nextInt();
		
		System.out.println("Convert n --> " + mul(n));		
		
		///--- sai
	}
	private static int mul(int n) {
		int result = 0;
		
		for (int i = 0; n != 0 ; i++) {
			n = n / 2;
			return n;
		}
	}
}
