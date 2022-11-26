package View;

public class Ex09 {
	public static void main(String[] args) {
		int n = 1, i = 0;
		while (i < 200) {
			n++;
			if (isPrime(n)) {
				i++;
			}
		}
		System.out.println("Prime 200: " + n);
	}
	public static boolean isPrime(int input) {
		boolean check = true;
		if (input == 1) {
			check = false;
		}
		for (int i = 2; i <= input / 2; i++) {
			if (input % i == 0) {
				check = false;
				break;
			}
		}
		return check;
	}
}
