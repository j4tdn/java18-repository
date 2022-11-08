package control;

import java.util.Scanner;

public class Ex01IfElseDemo {
	public static void main(String[] args) {
		// 1. kiểm tra 1 số là chẵn hay lẻ
		// + Nếu chẵn ==> 'this is even number'
		// + Nếu lẻ ==> 'this is odd number'
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap n: ");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("this is even number");
		} else {
			System.out.println("this is odd number");
		}
		
		System.out.print("Enter point: ");
		float n2 = sc.nextFloat();
		System.out.println(getLevel(n2));
		
	}
	
	private static String getLevel(float point) {
		
		if(point < 5f){
			return "BAD";
		}
		if(point <= 6.4f) {
			return "MEDIUM";
		}
		if(point <= 7.9f) {
			return "PRETTY_GOOD";
		}
		
		return "GOOD";
		
	}
}
