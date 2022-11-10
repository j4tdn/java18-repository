package control;

import java.util.Random;

public class Ex07ThirdOperator {
	public static void main(String[] args) {
		// Kiểm tra 1 số nguyên ngẫu nhiên n(<5) là chẵn hay lẻ
		Random rd = new Random();
		int n = rd.nextInt(5);

		System.out.println("n ----> " + n);

		System.out.println(n % 2 == 0 ? "n is an even number" : "n is an odd number");
	}
}
