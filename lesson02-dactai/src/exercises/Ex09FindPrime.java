package exercises;

public class Ex09FindPrime {

	public static void main(String[] args) {
		primeNumber200th();
	}

	private static void primeNumber200th() {
		int count = 0;
		int i = 1;
		while (true) {
			if (Ex08PrimeNumber.isPrime(i)) {
				count++;
				if (count == 200) {
					System.out.println(i);
					break;
				}
			}
			i += 2;
		}
	}

}
