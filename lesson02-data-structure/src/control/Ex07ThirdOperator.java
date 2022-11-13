package control;

import java.util.Random;

public class Ex07ThirdOperator {
	// kiểm tra 1 số nguyên ngẫu nhiên n(<5) là chẵn hay lẻ
	public static void main(String[] args) {
		Random rd = new Random();
		int n = rd.nextInt(5);
		
		System.out.println("n -->  " + n);
		
		String result = "";
		if (n% 2 == 0 ) {
			result = "N is an even number";
		} else {
			result = "N is an odd number";
		}
		System.out.println(result);
		
		// biểu thức 3 ngôi
		// biểu thức điều kiện ? sử dụng (if BTĐK true) : sử dụng (if BTĐK false)
		System.out.println(n % 2 == 0 ? "N is an even number" : "N is an odd number");
	}
	
}
