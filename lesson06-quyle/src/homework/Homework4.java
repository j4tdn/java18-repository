package homework;

import java.util.Scanner;

public class Homework4 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int a;
		while(true) {
			while(true) {
				try {
					System.out.println(" số : ");
					a=Integer.parseInt(ip.nextLine());
					break;
				} catch (NumberFormatException e) {
					System.out.println("---> " + e.getMessage());
					System.out.println("nhập lại");
				}
			}
			int b;int c;int d;
			if(a>=100) {
				b=a/100;
				writenumber(b);
				System.out.print(" trăm ");
				d=a%10;
				c=(a/10)%10;
				if(c==0&d!=0) {
					System.out.print(" lẻ ");
				}
				else {
					writenumber(c);
				}
				if(c!=0) {
					System.out.print(" mười ");
				}
				
				writenumber(d);
			}
			if(a>=10&a<100) {
				b=a/10;
				c=a%10;
				writenumber(b);
				System.out.print(" mươi ");
				writenumber(c);
			}
			else {
				if(a==0) {
					System.out.println("Không");
				}
				else
				writenumber(a);
			}
			System.out.println();
		}
		
	}
	public static void writenumber(int a) {
		if(a==1) {
			System.out.print("một");
		}
		else if(a==2) {
			System.out.print("hai");
		}
		else if(a==3) {
			System.out.print("ba");
		}
		else if(a==4) {
			System.out.print("bốn");
		}
		else if(a==5) {
			System.out.print("năm");
		}
		else if(a==6) {
			System.out.print("sáu");
		}
		else if(a==7) {
			System.out.print("bảy");
		}
		else if(a==8) {
			System.out.print("tám");
		}
		else if(a==9) {
			System.out.print("chín");
		}
	}
}
