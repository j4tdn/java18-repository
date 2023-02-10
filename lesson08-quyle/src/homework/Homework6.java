package homework;

import java.util.Scanner;

public class Homework6 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("");
		Scanner ip = new Scanner(System.in);
		int a=ip.nextInt();
		for(int i=1;i<=a;i++) {
			sb.append(i);
		}
		sb.charAt(a);
		System.out.println(sb.charAt(a));
	}
}
