package test;

import java.util.Scanner;

public class HomeWork3 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String a = ip.nextLine();
		int [] arr = new int [200];
		for(int i=0;i<a.length();i++) {
			int m = (int)a.charAt(i);
			if(m<=90) {
				m = m+32;
			}
			arr[m]++;
		}
		String b = ip.nextLine();
		int [] brr = new int [200];
		for(int i=0;i<b.length();i++) {
			int m = (int)b.charAt(i);
			if(m<=90) {
				m = m+32;
			}
			brr[m]++;
		}
		if(b.length()!=a.length()) {
			System.out.println(false);
		}else {
			for(int i=0;i<= 199;i++) {
				if(arr[i]!=brr[i]) {
					System.out.println(false);
					System.exit(0);
				}
			}
			System.out.println(true);
		}
		
	}
}
