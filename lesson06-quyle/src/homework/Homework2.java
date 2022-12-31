package homework;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String a;
		int l=0;
		int y=0;
		int z=0;
		int t=0;
		System.out.println();
		while(true) {
			System.out.println("nhap pass --> ");
			while(true) {
				a=ip.nextLine();
				if(a.length()>=8&a.length()<=256) {
					break;
				}
				System.out.println("yêu cầu nhập ít nhất 8 kí tự hoặc nhiều nhất 256 kí tự,Nhap lai pass --> ");
			}
			for(int i=0;i<a.length();i++) {
				char x=a.charAt(i);
				if(x>='A'&x<='Z') {
					l++;
				}
				if(x>='a'&x<='z') {
					y++;
				}
				if(x>='0'&x<='9') {
					z++;
				}
			
			}
			if(a.length()-l-z-y>0) {
				t++;
			}
			if(l>=1&y>=1&z>=1&t>=1) {
				break;
			}
			System.out.println("chứa ít nhất 1 chữ in hoa,1 chữ thường,1 chữ số ,1 kí tự đặc biệt ,nhap lai pass : ");
			
		}
		System.out.println("pass của bạn là :-->" + a);
	}
}
