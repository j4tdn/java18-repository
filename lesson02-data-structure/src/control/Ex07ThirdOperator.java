package control;

import java.util.Random;

public class Ex07ThirdOperator {
	public static void main(String[] args) {
		// kiểm tra 1 số nguyên ngẫu nhiên n là chẵn hay lẻ
		Random rd = new Random();
		int n = rd.nextInt(5);
		System.out.println(n);
		
		System.out.println(n % 2 == 0 ? "N is an even number" : "N is an odd number");
	}
} 
