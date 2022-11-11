package view;

import java.util.Scanner;

public class Ex06MaxMinNumber {
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.print("enter first number: ");
		int a = ip.nextInt();
		System.out.print("enter second number: ");
		int b = ip.nextInt();
		System.out.print("enter third number: ");
		int c = ip.nextInt();
		
		if(a>=b && a>=c) {
			System.out.println(a+" is max number");
		}
		else if(b>=a && b>=c) {
			System.out.println(b+" is max number");
		}
		else if(c>=a && c>=b) {
			System.out.println(c+" is max number");
		}
		if(a<=b && a<=c) {
			System.out.println(a+" is min number");
		}
		else if(b<=a && b<=c) {
			System.out.println(b+" is min number");
		}
		else if(c<=a && c<b) {
			System.out.println(c+" is min number");
		}
			

	}

}
