package exercises02_isSpecialNumber;

import java.util.Scanner;

public class SpecialNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter S: ");
		int S = sc.nextInt();
		isSpecialNumber(S);
	}
	
	public static boolean isSpecialNumber(int S) {
		int resuft = 0;
		for (int i = 1; i < S; i++) {
			resuft += i;
			if (resuft == S )
			{
				System.out.println("S is Special Number!");
				break;
			}
			else if (resuft > S) {
				System.out.println("S is not Special Number!");
				break;
			}
		}
		return false;
		
	}

}
