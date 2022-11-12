package exercises;

public class Ex09 {

	public static void main(String[] args) {
		primeNumber200th();
	}

	private static void primeNumber200th() {
		int count = 0;
		int i = 1;
		while (true) {
			if (isPrime(i)) {
				count++;
				if (count == 200) {
					System.out.println(i);
					break;
				}
			}
			i += 2;
		}
	}

	private static boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
