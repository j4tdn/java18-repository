package homework;

import java.util.Scanner;

public class Homework5 {
	public static void main(String[] args) {
		Scanner ip= new Scanner(System.in);
		String a=ip.nextLine();
		String b=ip.nextLine();
		int n;
		if(a.length()>=b.length()) {
			n=b.length();
		}
		else {
			n=a.length();
		}
		int dem=0;
		int demi=0;
		int max=0;
		for(int i=0;i<n;i++) {
			if(a.charAt(i)==b.charAt(i)) {
				dem++;
				//System.out.println(dem);
				if(max<=dem) {
					max=dem;
					demi=i;
				}
			}
			else {
				dem=0;
			}
		}
		for(int i=demi-4;i<=demi;i++) {
			System.out.print(a.charAt(i));
		}
		//System.out.println(max);
	}
}
