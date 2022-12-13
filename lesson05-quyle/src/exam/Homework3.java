package exam;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		Scanner ip =new Scanner(System.in);
		int n=ip.nextInt();
		int[] a = new int [21];
		int save;
		for(int i=0;i<n;i++) {
			a[i]=ip.nextInt();
		}
		save=1*a[0]/leastCommonMultiple(1,a[0]);
		for(int i=0;i<n;i++) {
			save=save*a[i]/leastCommonMultiple(save,a[i]);
		}
		System.out.println(save);
		
		
	}
	public static int leastCommonMultiple(int a , int b) {
		if(a>b) {
			return leastCommonMultiple(a-b,b);
		}
		else if(b>a) {
			return leastCommonMultiple(a,b-a);
		}
		else {
			return a;
		}
	}
}
