package view;

import java.util.Random;

public class Ex10FiveRandomNum {
	public static void main(String[] args) {
		int n1, n2, n3, n4, n5;
		Random rd = new Random();
		
		n1 = 20 + rd.nextInt(11);
		
		do {
			n2 = 20 + rd.nextInt(11);
		} while (n1 == n2);
		
		do {
			n3 = 20 + rd.nextInt(11);
		} while (n3 == n2 || n3  == n1);
		
		do {
			n4 = 20 + rd.nextInt(11);
		} while (n4 == n3 || n4 == n2 || n4 == n1);
		
		do {
			n5 = 20 + rd.nextInt(11);
		} while (n5 == n4 || n5 == n3 || n5 == n2 || n5 == n1);
		
		System.out.print("The five randow different number is: " + n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " ");
	}
}
