package View;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		while(true){
			System.out.println("Enter number a :");
			a= Integer.parseInt(sc.nextLine());
			if(isRequiredNumber(a)) {
				break;
			}
			else {
				System.out.println("Error!");
			}
		}
		while(true){
			System.out.println("Enter number b :");
			b= Integer.parseInt(sc.nextLine());
			if(isRequiredNumber(b)) {
				break;
			}
			else {
				System.out.println("Error!");
			}
		}
		while(true){
			System.out.println("Enter number c :");
			c= Integer.parseInt(sc.nextLine());
			if(isRequiredNumber(c)) {
				break;
			}
			else {
				System.out.println("Error!");
			}
		}
		System.out.println("Max of 3 Number :"+maxOf2Number(a, maxOf2Number(b, c)));
		System.out.println("Min of 3 Number :"+minOf2Number(a, minOf2Number(b, c)));
		
		
	}
	public static boolean isRequiredNumber(int input) {
		boolean check = false;
		if(input >= 0 && input <20) {
			check = true;
		}
		return check;
	}
	public static int maxOf2Number(int input1, int input2) {
		if(input1 > input2) return input1;
		else return input2;
	}
	public static int minOf2Number(int input1, int input2) {
		if(input1 > input2) return input2;
		else return input1;
	}
}
