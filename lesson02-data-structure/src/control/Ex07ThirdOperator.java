package control;

import java.util.Random;

public class Ex07ThirdOperator {
	public static void main(String[] args) {
		Random rd = new Random();
		int n = rd.nextInt(10);
		String result = n%2==0?"even":"odd";
		System.out.println(n+" --> "+result);
	}
}
