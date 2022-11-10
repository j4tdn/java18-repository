package control;

import java.util.Random;

public class Ex07TernaryOperator {
	public static void main(String[] args) {

		Random rd = new Random();
		int n = rd.nextInt(5);

		System.out.println("n --> " + n);

		String result = n % 2 == 0 ? "N is an even number" : "N is an odd number";
		System.out.println(result);
	}

}
