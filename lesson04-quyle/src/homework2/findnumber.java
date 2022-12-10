package homework2;

import java.util.Scanner;

public class findnumber {
	public static void main(String[] args) {
		int j=0;
		int[] arraynumber = new int[1000];
		int[] arB = new int[1000];
		Scanner number = new Scanner(System.in);
		int n = number.nextInt();
		int k=n-1;
		for(int i=0;i<n;i++) {
			arraynumber[i]=number.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			if(arraynumber[i]%7==0 & arraynumber[i]%5!=0) {
				arB[j]=arraynumber[i];
				j++;
			}
			else if(arraynumber[i]%5==0 & arraynumber[i]%7!=0) {
				arB[k]=arraynumber[i];
				k--;
			}
		}
		int h=j;
		for(int i=0;i<n;i++) {
			if((arraynumber[i]%7!=0 & arraynumber[i]%5!=0)||(arraynumber[i]%7==0 & arraynumber[i]%5==0)) {
				arB[h]=arraynumber[i];
				h++;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arB[i] + " ");
		}
		
		
	}
}
