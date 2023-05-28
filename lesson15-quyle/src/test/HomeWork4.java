package test;

import java.util.Scanner;

public class HomeWork4 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String s = ip.nextLine();
		int [] a = new int [200];
		int [] save = new int [200];
		int max=0;
		int maxi=0;
		int j=0;
		for(int i=0;i<s.length();i++) {
			a[(int)s.charAt(i)]++;
		}
		for(int i=0;i<200;i++) {
			if(a[i]>max) {
				max=a[i];
				//maxi=i;
			}
		}
		for(int i=0;i<200;i++) {
			if(a[i]==max) {
				save[j]=i;
				j++;
			}
		}
		for(int i=0;i<j;i++) {
			System.out.print((char)save[i] + " ");
		}
	}
}
