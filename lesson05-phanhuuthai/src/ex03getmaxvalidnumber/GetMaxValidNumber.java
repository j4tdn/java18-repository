package ex03getmaxvalidnumber;

import java.util.Arrays;
import java.util.Scanner;

public class GetMaxValidNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhập chuỗi: ");
		String s = sc.nextLine();
//		s = s.replaceAll("[^0-9]", ",");
//
//		String[] b = s.split(",");
		// System.out.println(Arrays.toString(b));
		System.out.println("số lớn nhất trong chuỗi là: " + getNumberFromString(s));
	}

	public static int getNumberFromString(String s) {
		s = s.replaceAll("[^0-9]", ",");

		String[] b = s.split(",");
		int[] result = new int[b.length];

		for (int i = 0; i < result.length; i++) {
			try {
				result[i] = Integer.parseInt(b[i]);
			} catch(NumberFormatException e) {
				
			}
			
		}

		int max = 0;
		for (int i = 0; i < result.length; i++) {
			if (result[i] > max) {
				max = result[i];
			}
		}

		return max;
	}

}
