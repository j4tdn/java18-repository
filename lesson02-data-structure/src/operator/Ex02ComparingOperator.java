package operator;

public class Ex02ComparingOperator {
	public static void main(String[] args) {
		
		int a = 15;
		int b = 22;
		int c = 18;
		
		System.out.println("test --> " + (a > b));
		boolean isGreater = b > c;
		System.out.println("isGreater : " + isGreater);
		
		boolean isPowerOf2 = b % 2 == 0;
		System.out.println("isPowerOf2 : " + isPowerOf2);
		
		c = 21;
		boolean isEven = c % 2 == 0;
		if(isEven)
		{
			System.out.println("is Even : " + c);
		}
		
		if(!isEven)
		{
			System.out.println("is not Even : " + c);
		}
	}
}
