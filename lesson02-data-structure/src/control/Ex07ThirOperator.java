package control;

import java.util.Random;

import javax.naming.spi.DirStateFactory.Result;

public class Ex07ThirOperator {
	public static void main(String[] args) {
		// kiểm tra 1 số nguyên ngẫu nhiên n(<5) là chẵn hay lẻ
		Random rd = new Random();
		int n = rd.nextInt(5);

		System.out.println("n --> " + n);

		String result = "";
		if (n % 2 == 0) {
			result = "N is an even number";
		} else {
			result = "N is an odd number";
		}
		System.out.println(result);

		System.out.println(n % 2 == 0 ? "N is an even number" : "N is an odd number");
	}

}
