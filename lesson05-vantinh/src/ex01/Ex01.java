package ex01;

public class Ex01 {
	public static void main(String[] args) {
		int a = 8;
		int b = 2;
		System.out.println(isPowerOf(a, b));
	}
	
	public static boolean isPowerOf(int a, int b) {
		while(b != 1 && a != 1) {
			if (b % a != 0 || a % b !=0) {
				return false;
			}
			b /= a;
		}
		return true;
		// sửa thêm trường hợp kia
	}
	
}
