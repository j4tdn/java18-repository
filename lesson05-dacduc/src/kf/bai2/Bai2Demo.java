package kf.bai2;

public class Bai2Demo {
	public static void main(String[] args) {
		System.out.println(isSpecialNumber(1));
		System.out.println(isSpecialNumber(3));
		System.out.println(isSpecialNumber(6));
		System.out.println(isSpecialNumber(10));
		System.out.println(isSpecialNumber(11));
		System.out.println(isSpecialNumber(12));
		System.out.println(isSpecialNumber(15));
		
	}

	public static boolean isSpecialNumber(int n) {
		int result = 0;
		for (int i = 1; i <= n; i++) {
			result+=i;
			if(result==n) {
				return true;
			}
		}
		return false;
	}
}
