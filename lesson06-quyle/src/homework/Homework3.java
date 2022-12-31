package homework;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String a="@mail.com";
		System.out.println("nhập mail : ");
		String s;
		char y;
		int j=0,dem=0,dem1=0;
		while(true){
			s=ip.nextLine();
			if(s.length()>9) {
				for(int i=s.length()-9;i<=s.length()-1;i++) {
					y=s.charAt(i);
					if(y==a.charAt(j)) {
						dem++;
					}
					j++;
				}
				j=0;
				if(dem==9) {
					if(s.charAt(0)<='z'&s.charAt(s.length()-10)>='a'&s.charAt(0)>='a'&s.charAt(s.length()-10)<='z') {
						for(int i=1;i<=s.length()-11;i++) {
							if((s.charAt(i)>='a'&s.charAt(i)<='z')||(s.charAt(i)=='-'||s.charAt(i)=='_'||s.charAt(i)=='.')) {
								dem1++;
							}
							
						}
					}
				}
			}
			if(dem+dem1+2==s.length()) {
				break;
			}
			System.out.println("Sai rồi,nhập lại gmail : ");
			dem=0;dem1=0;
		}
		System.out.println("gmail của bạn là : " + s);
	}
}
