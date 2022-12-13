package exam;

import java.util.Scanner;

public class Homework4 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int [] a= new int [1000];
		int n=ip.nextInt();
		for(int i=0;i<199;i++) {
			a[i]=0;
		}
		for(int i=0;i<n;i++) {
			a[ip.nextInt()]++;
		}
		for(int i=0;i<199;i++) {
			if(a[i]==1) {
				System.out.println(i);
			}
		}
		//3, 15, 21, 0, 15, 17, 21
		
	}
}
