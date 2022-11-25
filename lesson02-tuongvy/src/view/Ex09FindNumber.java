package view;

public class Ex09FindNumber {

	public static void main(String[] args) {
		int N = 2, i = 1;
		do {
			N++;
			if (isPrime(N)) {
				i++;
			}
		}while(i < 200);
		
		System.out.println("Prime 200: " + N);

		

	}
	
	private static boolean isPrime(int N) {
		for (int i = 2; i <= Math.sqrt(N); i++) {
			if (N % i == 0) {
				return false;
			} 
		}
		return true;
	}

}
