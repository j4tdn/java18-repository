package control;

import java.util.Random;

public class Ex07ThirOperator {
	public static void main(String[] args) {

//	kiem tra 1 so nguyen n la chan hay le
		Random rd = new Random();
		int n = rd.nextInt(5);
		System.out.println(n);
		
//  toan tu 3 ngoi
//	BTDK ? su dung (neu btdk true) : su dung(neu btdk false)   
		System.out.println(n % 2 == 0 ? "N is an even number" : "N is an odd number");
	}
}
