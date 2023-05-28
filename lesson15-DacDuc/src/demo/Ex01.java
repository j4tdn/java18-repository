package demo;

import java.util.Scanner;



public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean status = true;
		int i = 0;
		do {
			if(i==3) {
				System.out.println("Nhap sai qua ba lan !");
				status = false;
				break;
			}
			try {
				System.out.println("Nhap 1 so thuc co phan thap phan khac 0");
				i++;
				double input = sc.nextDouble();
				if(input % 1 != 0) {
					System.out.println(input);
					int numerator = (int) (input * 100);
			        int denominator = 100;
			        while (numerator % 2 == 0 && denominator % 2 == 0) {
			            numerator /= 2;
			            denominator /= 2;
			        }
			        while (numerator % 5 == 0 && denominator % 5 == 0) {
			            numerator /= 5;
			            denominator /= 5;
			        }
			        System.out.println("Phân số tối giản của số thập phân là: " + numerator + "/" + denominator);
					break;
				}
			} catch (Exception e) {
			
			}
		}
		while(true);
	}
}
