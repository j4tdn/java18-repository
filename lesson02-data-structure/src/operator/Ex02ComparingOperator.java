package operator;

public class Ex02ComparingOperator {
	public static void main(String[] args) {
		int a = 15;
		int b = 22;
		int c = 18;
		
		// Expression: a > b 
		System.out.println("test --> " + (a > b));
		boolean isGreater = b > c;
		System.out.println("isGreater: " + isGreater);
		
		// Kiểm tra 1 số là số chẵn
		boolean isPowerOf2 = b % 2 == 0;
		System.out.println("isPowerOf2: " + isPowerOf2);
		
		// Biểu thức điều kiện 
		// Yêu cầu: kiểm tra 1 số chẵn hay lẻ 
		// 'nếu' chẵn ==> in ra giá trị đó 
		// 'nếu' lẻ ==> in ra giá trị đó + 1
		
		c = 20;
		boolean isEven = c % 2 == 0;
		
		// if (condition expression) {}
		// if (isEven == true) <==> if (isEven)
		if (c % 2 == 0) {
			System.out.println("c ==> " + c);
		}
		
		// if (isEven = false) <==> if (!isEven)
		if (c % 2 != 0) {
			System.out.println("c + 1 ==> " + (c + 1));
		}

	}

}
