package control;

import java.util.Random;

public class Ex07ThirdOperator {
	// kiểm tra 1 số là chẵn hay lẻ
	public static void main(String[] args) {
		Random rd = new Random();
		int n = rd.nextInt(5);
		
		System.out.println("n = " + n);
		System.out.println(n % 2 == 0 ? "n is an even number" : "n is an old number");
	}

}
