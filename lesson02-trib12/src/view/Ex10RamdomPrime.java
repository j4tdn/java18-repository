package view;

import java.util.Random;

public class Ex10RamdomPrime {
	public static void main(String[] args) {
		Random rd = new Random();
		int ram = Limit(rd.nextInt(31));
//		System.out.println(ram);
		int i = 0;
		while(true) {
			if(isPrime(ram)) {
				System.out.print(ram);
				break;
			}
			i++;
		}
		
	}
	public static boolean isPrime(int n) {
	       if (n <= 1) {
	           return false;
	       }
	       for (int i = 2; i <= Math.sqrt(n); i++) {
	           if (n % i == 0) {
	               return false;
	           }
	       }
	       return true;
	   }
private static int Limit(int a) {
		
		if(a>0&&a<=10)
		{
			return a+20;
		}else if(a>10&&a<=20)
		{
			return a+10;
		}else return a;
		
		
	}
	

}
