package control;

import java.util.Random;

public class Ex07ThirdOperator {
	public static void main(String[] args) {
		Random rd = new Random();
		int n = rd.nextInt(5);

		System.out.println("n--->" + n);
		String result = "";
		if (n % 2 == 0) {
			result = "N is an even number";
		} else {
			result = "N is an old number";
		}
		System.out.println(result);
		System.out.println(n % 2 == 0 ? "N is an even number" : "N is an old number");
	}
}
