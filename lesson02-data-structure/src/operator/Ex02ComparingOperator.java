package operator;

public class Ex02ComparingOperator {
	public static void main(String[] args) {
		int a = 15;
		int b = 22;
		int c = 18;
		
		System.out.println("test -->" + (a > b));
		boolean isGreater = b > c;
		System.out.println("isGrater " + isGreater);
		
		boolean isPowerOf2 = a % 2 == 0;
		System.out.println("isPowerof2 " + isPowerOf2);
		
		c = 20;
		boolean isEven = c % 2 == 0;
		if(isEven) {
			System.out.println("c --> " + c);
		}
		if(!isEven) {
			System.out.println("c --> " +( c + 1));
		}
		
	}

}
