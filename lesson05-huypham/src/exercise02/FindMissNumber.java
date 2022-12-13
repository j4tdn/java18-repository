package exercise02;

import java.util.Scanner;

public class FindMissNumber {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.print("Enter n = ");
		int n = sr.nextInt();
		int[] array = new int[n-1];
		for(int i = 0; i<n-1; i++) {
			array[i] = sr.nextInt();
		}
		int findn = getMissingNumber(array, n);
		System.out.println(findn);
	}
	public static int getMissingNumber(int[] arg, int n) {
		for(int i=1; i<=n; i++) {
			Boolean get = checkExist(arg, i);
			if(get = false) return i;
		}
		return -1;
	}
	public static boolean checkExist(int[] arg, int a) {
		int dem = 0;
		for(int i=0; i<arg.length;i++) {
			if(arg[i] == a) {
				dem += 1;
			}
		}
		if(dem == arg.length) {
			return true;
		}
		return false;
	}
}
