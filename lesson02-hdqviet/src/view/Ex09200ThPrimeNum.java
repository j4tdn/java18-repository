package view;

public class Ex09200ThPrimeNum {
	public static void main(String[] args) {
		int num = 0;
		System.out.print("The 200th prime number is ");
		while (num <= 200) {
			if (isPrimeNum(num)) {
				System.out.print(num + " ");
			}
			num++;
		}
	}
	
	private static boolean isPrimeNum(int num) {
		int check = 0;
		if (num == 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				++check;
			}
		}
		if (check == 0) {
			return true;
		} else {
			return false;
		}
	}
}
