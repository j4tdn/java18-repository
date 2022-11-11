package homework;

import java.util.Scanner;

public class Bt05SymmetricalNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String Ntest = "";
		int wrongtime =0;
		do {
			String nhapN = wrongtime >0 ? "nhập sai rồi , hãy nhập lại N : ":"Nhập N : ";
			System.out.println(nhapN);
			Ntest = ip.nextLine();
			if(isNumber(Ntest)) {
				break;
			}
			wrongtime++;
		}while(true);
		int n = Integer.parseInt(Ntest);
		int temp,r,sum=0;
		for(temp=n;n!=0;n=n/10) {
			r = n%10;
			sum=sum*10+r;
		}
		if(temp==sum) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	private static boolean isNumber(String test) {
		if(test.length()==0||test.length()==1) {
			return false;
		}
		for ( int i=0 ;i<test.length();i++) {
			char a = test.charAt(i);
			if (a<'0'||a>'9') {
				return false;
			}
		}
		return true;
	}
}
