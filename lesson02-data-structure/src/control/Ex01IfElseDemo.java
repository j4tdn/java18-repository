package control;

import java.util.Scanner;

public class Ex01IfElseDemo {
	public static void main(String[] args) {
//		1. kiem tra 1 so la chan hay le 
//		neu chan ==> this even number
//		neu le ==>do nothing
//		2. kiem tra 1 so la chan hay le 
//		neu chan ==> this even number
//		neu le ==> this is odd number
		Scanner ip = new Scanner(System.in);
//		System.out.print("Enter number: ");
//
//		int n = Integer.parseInt(ip.nextLine());
//		if(n%2==0)
//		{
//			System.out.println("this even number");
//		}
//		else
//		{
//			System.out.println("this is odd number");
//		}
		
// tim hoc luc cua hoc vien getLevrl(float point): string
		System.out.println("Enter point: ");
		float n = ip.nextFloat(); 
		if(n < 5) {
			System.out.println("BAD");
		}
		else if(n < 6.5) {
			System.out.println("MEDIUM");
		}
		else if(n < 8) {
		
			System.out.println("pretty");
		}
		else {
			System.out.println("good");
		}
		System.out.println("lv2 "+ getLevel(n));
		


	}
	private static String getLevel(float point) {
		
			if (point < 5f)
			{
				return "BAD";
			}
			else if(point <= 6.4f)
			{
				return "MEDIUM";
			}
			else if(point < 7.9f)
			{
				return "PRETTY-GOOD";
			}
			return "GOOD";
		

		}
	}


