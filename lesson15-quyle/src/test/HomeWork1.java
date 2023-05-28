package test;

import java.util.Scanner;

public class HomeWork1 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int wrongTimes = 0;
		String text = "";
		do {
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + "):" : ":";
			System.out.print("Enter float" + suffix );
			text = ip.nextLine();
			String [] a = text.split("\\.");
			if(a.length==2) {
				break;
			}
			wrongTimes++;
			if (wrongTimes == 3) {
				System.out.println("Wrong times = 3 ... Exit ...");
				System.exit(0); 
			}
		} while(true);
		float a = Float.parseFloat(text);
		float b = 0;
		int saveB = 0 ;
		int saveI = 0 ;
		for(int i=1;i<=Integer.MAX_VALUE;i++) {
			b = a*i;
			if(b-(int)b==0) {
				saveI = i;
				saveB = (int)b;
				break;
			}
		}
		System.out.println(saveB + "/" + saveI);
	}
}
