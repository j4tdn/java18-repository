package control;

import java.util.Scanner;

public class Ex01IfElseDemo {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.print("Nhap n: ");
		Float n2 = sr.nextFloat();
		/*
		if( n % 2 == 0){
			System.out.println("this is enven number");}
		else {
			System.out.println("this is old number");}
		*/
		String n = getLevel(n2);
		System.out.println(n);
	}
	
	private static String getLevel(float point) {
		String s = "";
		if( point < 5.0f) {
			s =  s + "BAD";
		}
		else if (point <= 6.4f) {
			s = s + "MEDIUM";
		}
		else if (point <= 7.9f) {
			s = s + "PRETTY_GOOD";
		}
		else{
			s = s + "GOOD";
		}
		return s;
	}
}
