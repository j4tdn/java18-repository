package Ex01PowerOfANumber;

public class PowerOfNumberFunction {
	
	public static void main(String[] args) {
		if(isPowerOf(8, 2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	public static boolean isPowerOf(int a, int b) {
		int x = a / b;
		int y = a % b;
		while(x > 0) {
			if (y != 0) {
			return false;
			}
			x = a / b;
			y = a % b;
		} return true;
	}
}
	

