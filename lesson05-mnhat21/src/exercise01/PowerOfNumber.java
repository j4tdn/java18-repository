package exercise01;

public class PowerOfNumber {
	public static void main(String[] args) {
		System.out.println(isPowerOf(64,4));
	}
	
	private static boolean isPowerOf(int a, int b) {
		if(a == 0) {
			return true;
		}
		int n = b;
		while(b < a) {
			b *= n;
			if(b == a) {
				return true;
			}
		}
		return false;
	}
}
