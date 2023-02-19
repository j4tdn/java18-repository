package lesson09_dacduc;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int nNumber = Integer.parseInt(sc.nextLine());
		int sum = 0;
		StringBuffer s= new StringBuffer();
		while (true) {
			s.append(nNumber+" ");
			for (int i = 0; i < String.valueOf(nNumber).length(); i++) {
				sum += Math.pow(Integer.parseInt(String.valueOf((String.valueOf(nNumber).charAt(i)))), 2);
			}
			if (sum == 1) {
				System.out.println("So hanh phuc !");
				break;
			}
			if(String.valueOf(s).contains(String.valueOf(sum))) {
				System.out.println("Khong phai la so hanh phuc !");
				break;
			}
			nNumber = sum;
			sum = 0;
		}

	}
}
