package excersies;


public class Ex09The200thPrimeNumber {
	public static void main(String[] args) {

		System.out.println(the200thPrime());

	}
	public static int the200thPrime() {
		int ct = 0;
		int num = 0;
		while (true) {
			num++;
			if (isPrime(num)) {
				ct++;
			}	
			if (ct == 200) {
				return num;
			}
		}
	}
	
	public static boolean isPrime(int n) {
		int ct = 0;
		if (n == 1 || n == 0) {
			return false;
		}
		while(true) {
			for (int i = 1; i < n; i++) {
				if (n%i == 0) {
					ct++;
				}
			}
			return (ct >= 2 ? false: true);
		}
	}
}
