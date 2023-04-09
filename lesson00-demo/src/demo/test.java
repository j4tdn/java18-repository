package demo;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		int[] c = new int[1000001];
		Scanner ip = new Scanner(System.in);
		int a= ip.nextInt();
		for(int i=0;i<a;i++) {
			int b = ip.nextInt();
			for(int j=0;j<b;j++) {
				int d = ip.nextInt();
				if(j==0) {
					c[d]= c[d]+3;
				}else if(j==1) {
					c[d]= c[d]+2;
				}else {
					c[d]++;
				}
			}
		}
		int e = Math.max(c[0], c[1]);
		for(int i=0;i<1000001;i++) {
			e =Math.max(e,c[2]);
			
		}
		for(int i=0;i<1000001;i++) {
			if( c[i] == e ) {
				System.out.println(i);
			}
		}
	}
}
