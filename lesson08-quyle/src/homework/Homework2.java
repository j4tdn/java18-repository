package homework;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String a= ip.nextLine();
		System.out.print(up(a.charAt(0)));
		for(int i=1;i<a.length();i++) {
			//System.out.print(up(a.charAt(0)));
			if(a.charAt(i)==' ') {
				System.out.print(" ");
				System.out.print(up(a.charAt(i+1)));;
				i++;
			}
			else {
				System.out.print(down(a.charAt(i)));
			}
		}
	}
	
	private static char up(char a) {
		if((int)a>=91&&(int)a<=122) {
			int b=(int)a-32;
			char c=(char)b;
			return c;
		}
		else {
			return a;
		}
	}
	private static char down(char a) {
		if((int)a>=65&&(int)a<=90) {
			int b=(int)a+32;
			char c=(char)b;
			return c;
		}
		else {
			return a;
		}
	}
}
