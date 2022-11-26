package view;

public class Ex08 {
	public static void main(String[] args) {
		int n = 113;
		if (n < 2) {
			System.out.println(" n khong la so nguyen to");
			return;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.println(" n khong la so nguyen to");
				return;
			}

		}
		System.out.println(" n la so nguyen to");
	}
}
