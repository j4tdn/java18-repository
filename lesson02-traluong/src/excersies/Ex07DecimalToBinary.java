package excersies;

import java.util.Scanner;

public class Ex07DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		System.out.println("Dec ==> bin: " + convertToBin(n));
		
		
	}
	public static String convertToBin(int inVal) {
		int temp = inVal;
		String bin = "";
		while (true) {
			bin += temp%2;
			if (temp == 1 ) {
				break;
			}
			temp = temp/2;
			
		}
		bin = reverseString(bin);
		return bin;
	}
	public static String reverseString(String str) {
		String fakeArr = "";
		for (int i = 0; i < str.length(); i++) {
			fakeArr += str.charAt(((str.length()-1) - i));
		}
		return fakeArr;
	}
}
