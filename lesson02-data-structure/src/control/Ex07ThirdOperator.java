package control;

import java.util.Random;

public class Ex07ThirdOperator {

	public static void main(String[] args) {
		// kiểm tra 1 số nguyên ngẫu nhiên < 5 là chẵn hay lẽ
		Random rd = new Random();
		int n = rd.nextInt(5);

		System.out.println("n--> " + n);

		String rs = "";
		if (n % 2 == 0) {
			rs = "N is an even number";
		} else {
			rs = "N is an odd number";
		}
		System.out.println(rs);

		System.out.println(n % 2 == 0 ? "N is an even number" : "N is an odd number");

	}

}
