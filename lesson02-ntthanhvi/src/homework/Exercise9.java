package homework;

public class Exercise9 {
	public static void main(String[] args) {
		
		int N = 0;
		int count = 0;
		do {
			N++;
			if (isPrimeNumber(N)) {
				count++;
			}
		} while (count < 201);
		
		System.out.println("200th prime number: " + N );
	}
	private static boolean isPrimeNumber(int number) {
		int count = 0;
		if(number == 1 && number == 0) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if(number % i == 0) {
				++count;
			}
		}
		if(count == 0) {
			return true;
		}else {
			return false;
		}
	}
}