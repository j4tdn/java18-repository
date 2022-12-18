package Ex01PowerOfANumber;

public class PowerOfNumberFunction {
	
	public static void main(String[] args) {
		isPowerOf(8, 8);
		isPowerOf(8, 2);
		isPowerOf(2, 8);
		isPowerOf(6, 2);
		isPowerOf(20, 4);
		isPowerOf(64, 4);
	}
	
	public static void isPowerOf(int a, int b) {
		if(a == b) {
			System.out.println("false");
		} else {
			int c = 0;
			if(a < b) {
				c = a;
				a = b;
				b = c;
			} 
			int i = b;
			while(a > b) {
				b *= i;
				if(a == b) {
				System.out.println("true");
				c = 1;
				break;
				}
			}
			if (c == 0) {
				System.out.println("false");
			}
		}
	}
}
	

