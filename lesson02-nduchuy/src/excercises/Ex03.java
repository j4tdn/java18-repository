package excercises;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String factorialString = "1";
		int result = 1;
		
		System.out.print("Enter number N: ");
		int number = sc.nextInt();
		for(int i = 2; i <= number; i++) {
			factorialString = factorialString +"."+ i;
			result *= i;
		}
		if(number == 1) {
			System.out.println(number + "! = " +result);
		}else {
			System.out.println(number + "! = " + factorialString +" = "+result);
		}
		sc.close();
	}
}
