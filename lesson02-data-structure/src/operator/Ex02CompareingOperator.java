package operator;

public class Ex02CompareingOperator {
	public static void main(String[] args) {
		int a= 15;
		int b= 22;
		int c= 18;
		
		//expression: a>b --> Biểu thức
		System.out.println("test--> " + (a>b));
		
		boolean isGreater= b> c;
		System.out.println("isGreater: " + isGreater);
		
		//Kiểm tra 1 số là số chẵn
		boolean isPowerOf2 = b % 2 == 0;
		System.out.println("isPowwer : " + isPowerOf2);
		
		c = 20;
		boolean isEven = c % 2 ==0;
		if( c % 2 == 0) {
			System.out.println("c ==> " + c);
		}
		
		if( c % 2 != 0) {
			System.out.println(" c + 1 ==> " + c);
		}
	}

}
