package exam;

import java.util.Scanner;

public class Ex02exam {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int[] b= new int [100];
		int k=0;
		int a=ip.nextInt();
		while(true) {
			a=sqr(a);
			b[k]=a;
			k++;
			//System.out.println(a);
			if(k>=10) {
				for(int i=0;i<k;i++) {
					if(a==b[i]) {
						System.out.println("khong phai so hanh phuc ");
						System.exit(0);
					}
				}
			}
			if(a==1) {
				System.out.println("la so hanh phuc ");
				System.exit(0);
			}
			
		}
		//System.out.println(c);
		
	}
	private static int sqr(int n) {
		int tong=0;
		while(n!=0) {
			int b=n%10;
			b=b*b;
			tong+=b;
			n=n/10;
		}
		return tong;
	}
}

