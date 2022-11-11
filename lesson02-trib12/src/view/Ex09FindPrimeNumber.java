package view;

public class Ex09FindPrimeNumber {
	public static void main(String[] args) {
		int count = 0;
		int i = 0 ;
		while(true) {
			if(isPrime(i)) {
				count++;
			}
			if(count == 200) {
				System.out.println(i);
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

}
