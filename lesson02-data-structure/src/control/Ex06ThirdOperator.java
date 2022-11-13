package control;

import java.util.Random;

public class Ex06ThirdOperator {
	public static void main(String[] args) {
		Random rd = new Random();
		int n = rd.nextInt(5);

		System.out.println("n --> " + n);

		String result = "";
		if (n % 2 == 0) {
			result = "N iss an even number";

		} else {
			result = "N is an odd number";
		}
		System.out.println(result);
		System.out.println(n % 2 == 0 ? "N iss an even number" : "N iss an odd number");

	}
}
