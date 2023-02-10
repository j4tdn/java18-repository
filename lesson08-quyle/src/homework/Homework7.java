package homework;

import java.util.Scanner;

public class Homework7 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String a = ip.nextLine();
		int dem=1,min=1000000,max=0,demmax = 0,demmin = 0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==a.charAt(i+1)) {
				dem++;
				if(max<=dem) {
					max=dem;
					demmax=i+1;
				}
				if(i+1==a.length()-1) {
					break;
				}
				
			}
			if(min>=dem) {
				min=dem;
				demmin=i;
			}
			else if (a.charAt(i)!=a.charAt(i+1)) {
				dem=1;
			}
		}
		//System.out.println(min + "     " + max + "     " + demmax + "      " + demmin);
		StringBuilder stringmax = new StringBuilder();
		StringBuilder stringmin = new StringBuilder();
		for(int i=demmax-max+1;i<=demmax;i++) {
			stringmax.append(a.charAt(i));
		}
		//System.out.println(stringmax);
		for(int i=demmin-min+1;i<=demmin;i++) {
			stringmin.append(a.charAt(i));
		}
		//System.out.println(stringmin);
		System.out.println("Độ dài lớn nhất của dãy con đúng: " + max + " " + stringmax +" "+ "["+(demmax-max+1)+"]");
		System.out.println("Độ dài bé nhất của dãy con đúng: " + min + " " + stringmin +" "+ "["+(demmin-min+1)+"]");
	}
}
