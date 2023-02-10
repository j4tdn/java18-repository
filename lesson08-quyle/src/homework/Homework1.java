package homework;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		Scanner ip= new Scanner(System.in);
		String a=ip.nextLine();
		for(int i=0;i<a.length();i++) {
			System.out.println(a.charAt(i));
		}
		System.out.println("=============================");
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==' ') {
				System.out.println("");
			}
			else{
				System.out.print(a.charAt(i));
			}
		}
		System.out.println("\n=============================");
		for(int i=a.length()-1;i>=0;i--) {
			System.out.println(a.charAt(i));
		}
		System.out.println("\n=============================");
		int b=a.length();
		int j;
		for(int i=a.length()-1;i>=0;i--) {
			if(a.charAt(i)==' ') {
				for(j=i+1;j<b;j++) {
					System.out.print(a.charAt(j));
				}
				System.out.println("");
				//System.out.println("-----"+i+"-----");
				b=i;
			}
			if(i==0) {
				for(int l=0;l<b;l++) {
					System.out.print(a.charAt(l));
				}
			}
		}
	}
	//lê hữu quý 123
	//0123456789
}
