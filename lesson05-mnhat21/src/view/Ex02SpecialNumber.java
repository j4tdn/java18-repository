package view;

public class Ex02SpecialNumber {
	public static void main(String[] args) {
		System.out.println(isSpecialNumber(1));
	}
	
	private static boolean isSpecialNumber(int n) {
		int running = 1;
		for(int i = 2; i <= n; i++) {
			running += i;
			if(running >= n) {
				break;
			}
		}
		return running == n;
	}
}
