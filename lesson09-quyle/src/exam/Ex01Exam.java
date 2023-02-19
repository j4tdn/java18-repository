package exam;

import java.util.Scanner;

public class Ex01Exam {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int [] a=new int [100];
		int [] b=new int [100];
		int [] c=new int [100];
		int k=0;
		System.out.println("nhap so phan tu n ");
		int n=ip.nextInt();
		System.out.println("nhap mang a ");
		for(int i=0;i<n;i++) {
			a[i]=ip.nextInt();
		}
		System.out.println("nhap mang b ");
		for(int i=0;i<n;i++) {
			b[i]=ip.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[i]==b[j]) {
					c[a[i]]=1;
					//k++;
				}
			}
		}
		
//		for(int i=0;i<k;i++) {
//			for(int j=i+1;j<n-1;j)
//		}
		for(int i=0;i<100;i++) {
			if(c[i]!=0) {
				System.out.print(i+ "  ");
			}
		}
	}
}
