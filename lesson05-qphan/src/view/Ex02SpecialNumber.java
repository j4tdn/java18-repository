package view;

public class Ex02SpecialNumber {
	public static void main(String[] args) {
		int[] tests = { 1, 3, 6, 10, 12, 15 };
		for (int test : tests) {
			System.out.println("is special " + test + " --> " + isSpecial(test));
		}
	}

	private static boolean isSpecial(int n) {
		int running = 1;
		int sum = 0;
		while (sum < n) {
			sum += running;
			running++;
		}
		return sum == n;
	}
}
