package control;

import java.util.Scanner;

public class Ex01ConditionIfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number need to checked: ");
		float number = sc.nextFloat();
//		
//		if(number>0) {
//			if(number%2==0) {
//				System.out.println("This is even number");
//			}else {
//				System.out.println("this is odd number");
//			}
//		}else {
//			System.out.println("You must import number bigger than 0");
//		}
		getLevel(number);
		sc.close();
	}

	public static void getLevel(float point) {
		if (point < 5f) {
			System.out.println("BAD");
		} else {
			if (point < 6.5f) {
				System.out.println("MEDIUM");
			} else {
				if (point < 8.0f) {
					System.out.println("PRETTY_GOOD");
				} else {
					System.out.println("GOOD");
				}
			}

		}

	}
}
