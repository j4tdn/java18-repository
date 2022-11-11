package homework;

import java.util.Scanner;

public class Bt02PowerOf2 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int wrongtime =0;
		String Ntest="";
		do {
			String nhapN = wrongtime >0 ? "sai rồi hãy nhập lại N = ":"Nhập N = ";
			System.out.println(nhapN);
			Ntest=ip.nextLine();
			if(isNumber(Ntest)) {
				break;
			}
			wrongtime++;
			if(wrongtime==5) {
				System.exit(0);
			}
		}while(true);
		int N = Integer.parseInt(Ntest);
		Float D=(float) N;
		while(true) {
			D=D/2;
			if(D==1) {
				System.out.println("true");
				break;
			}
			if(D<1) {
				System.out.println("false");
				break;
			}
		}
		
	}
	private static boolean isNumber(String a) {
		if(a.length()==0) {
			return false;
		}
		for(int i=0;i<a.length();i++) {
			char letter = a.charAt(i);
			if(letter<'0'||letter>'9') {
				return false;
			}
		}
		return true;
	}
}
