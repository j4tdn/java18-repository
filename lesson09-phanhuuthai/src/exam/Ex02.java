package exam;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập số: ");
		int num = ip.nextInt();
		int a = num;
		StringBuffer buf = new StringBuffer();
		
		while(true) {
			buf.append(num);
			num = sum(num);
			if(num == 1) {
				System.out.println(a + " là số hạnh phúc");
				break;
			} 
			if(String.valueOf(buf).contains(String.valueOf(num))){
				System.out.println(a + " không là số hạnh phúc");
				break;
			}
		}
	}
	
	private static int sum(int num) {
		int n = 0;
		while(num > 0) {
			int a = num%10;
			num /= 10;
			n += a*a;
		}
		return n;
	}
}
