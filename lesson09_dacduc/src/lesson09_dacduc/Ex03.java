package lesson09_dacduc;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int nNumber = Integer.parseInt(sc.nextLine());
		int[] input = new int[nNumber];
		int[] output = new int[nNumber];
		int count = 0;
		for(int i = 0;i <input.length;i++) {
			System.out.println("input["+i+"]: ");
			input[i]= Integer.parseInt(sc.nextLine());
		}
		for(int i = 0;i <input.length;i++) {
			output[i]=numberDivisor(input[i]);
			System.out.println(output[i]+" : i = "+i);
		}
		int temp3 = input[0];
//		int temp4 = 0;
		for(int i = 0;i <output.length-1;i++) {
			for(int j = i+1; j <output.length;j++) 
				if(output[j]<output[i]) {
					temp3 = input[j] ;
					input[j] = input[i];
					input[i] = temp3;
					temp3 = output[j] ;
					output[j] = output[i];
					output[i] = temp3;
				}
		}
		for (int i : input) {
			System.out.print(i+" ");
		}
		
	}
	private static int numberDivisor(int input) {
		int count = 1;
		for(int i = 2; i <=input;i++) {
			if(input%i==0) ++count;
		}
		return count;
	}
}
