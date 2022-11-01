package operator;

public class Ex02ComparingOperator {

	public static void main(String[] args) {
		int a = 15;
		int b = 22;
		int c = 18;
		
		System.out.println("test ->>" + (a > b));
		boolean isGreater = b > c;
		System.out.println("isGreater: " + isGreater);
		
		boolean isPowerOf2 = b % 2 == 0;
		System.out.println("isPowerOf2: " + isPowerOf2);
		
		c = 20;
		if(c % 2 == 0) {
			System.out.println("c ==> " + c);
			
		}
		
		if(c % 2 != 0) {
			System.out.println("c+1 ==>" + (c+1));
		}

	}

}
