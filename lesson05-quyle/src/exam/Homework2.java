package exam;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
		int [] a = new int [1000];
		int n,sum=0,number;
		Scanner ip = new Scanner(System.in);
		n =ip.nextInt();
		for(int i=0;i<n-1;i++) {
			a[i]=ip.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			sum+=a[i];
		}
		number=(n*(n+1)/2)-sum;
		System.out.println(number);
	}
}
