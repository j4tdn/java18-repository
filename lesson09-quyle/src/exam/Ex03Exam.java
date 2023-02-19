package exam;

import java.util.Scanner;

public class Ex03Exam {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int[] a=new int [100];
		System.out.println("nhap so phan tu n :");
		int n=ip.nextInt();
		for(int i=0;i<n;i++) {
			a[i]=ip.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(level(a[i])>=level(a[j])) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(a[i]);
		}
	}
	private static int level(int n) {
		int dem=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				dem++;
			}
		}
		return dem;
	}
}
