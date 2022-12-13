package exercise04;

import java.util.Scanner;

public class FindNumberOnlyOne {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.print("Enter n = ");
		int n = sr.nextInt();
		int[] array = new int[n];
		for(int i = 0; i<n; i++) {
			System.out.print("Enter a[" + i + "] # 0 = ");
			array[i] = sr.nextInt();
		}
		int[] findn = new int[n];
		findn = getUniqueNumbers(array);
		//System.err.println("result: " + getUniqueNumbers(array));
		for(int i = 0; i<n; i++) {
			if(findn[i]!=0) {
				System.out.print(findn[i] + " ");
			}
		}
	}
	public static int[] getUniqueNumbers(int[] array) {
		int[] result = new int[array.length];
		for(int i = 0; i< array.length; i++) {
			int dem = 0;
			for(int j = 0; j < array.length; j++) {
				if(array[i]==array[j]) {
					dem = dem +1;
				}
			}
			if(dem == 1) {
				result[i]=array[i];
			}else {
			result[i]=0;
			}
		}
		return result;
	}
}
