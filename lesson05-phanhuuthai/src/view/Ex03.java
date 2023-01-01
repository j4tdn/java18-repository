package view;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhập chuỗi: ");
		String s = sc.nextLine();
		//s = s.replaceAll("[^0-9]", ",");

		//String[] b = s.split("[a-zA-Z]+");	
		//System.out.println(Arrays.toString(b));
		System.out.println("số lớn nhất trong chuỗi là: " + getNumberFromString(s));
	}

	public static int getNumberFromString(String s) {
		String[] tokens = s.split("[a-zA-Z]+");
		int max = Integer.MIN_VALUE;
		for(String token : tokens) {
			if(!token.isEmpty()) {
				Integer validNumber = Integer.parseInt(token);
				if(validNumber > max) {
					max = validNumber;
				}
			}
		}
		return max;
	}

}