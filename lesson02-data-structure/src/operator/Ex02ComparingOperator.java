package operator;

public class Ex02ComparingOperator {
	// so sánh
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 15;
		int b = 22;
		int c = 18;

		// expression: a > b -> biểu thức
		System.out.println("Test --> " + (a > b));
		boolean isGreater = b > c;
		System.out.println("isGreater: " + isGreater);

		// kiểm tra 1 số là số chẵn
		boolean isPowerOf2 = b % 2 == 0;
		System.out.println("isPowerOf2: " + isPowerOf2);

		// biểu thức điều kiện
		// yêu cầu: kiểm tra 1 số chẵn hay lẽ
		c = 20;
		boolean isEven = c % 2 == 0;
		// if(condition expression) {}
		// if ( isEven == true ) <=> if ( isEven )
		if (c % 2 == 0) {
			System.out.println("c => " + c);
		}
		// if ( isEven == false ) <=> if ( !isEven )
		if (c % 2 != 0) {
			System.out.println("c+1=> " + (c + 1));
		}
	}

}
