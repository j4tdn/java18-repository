package operator;

public class Ex02ComparingOperator {
	public static void main(String[] args) {
		// so sánh == <= >= != > <
		int a = 15;
		int b = 22;
		int c = 18;
		
		// expression: a > b --> biểu thức
		System.out.println("test --> " + (a > b));
		boolean isGreater = b > c;
		System.out.println("isGreater: " + isGreater);
		
		// kiểm tra 1 số là chẵn
		boolean isPowerOf2 = b % 2 == 0;
		System.out.println("isPowerOf2 " + isPowerOf2);
		
		// biểu thức điền kiện
		// yêu cầu: kiểm tra 1 số chẵn hay lẻ
		// 'nếu' chẵn ==> in ra giá trị đó
		// 'nếu' lẻ ==> in ra giá trị đó + 1
		c = 20;
		boolean isEven = c % 2 == 0;
		// if(condition expression) {}
		// if (isEven == true) <==> if (isEven)
		if (c % 2 == 0) {
			System.out.println("c ==> " + c);
		}
		
		// if (isEven == false) <==> if (!isEven)
		if (c % 2 != 0) {
			System.out.println("c+1 ==> " + (c+1));
		}
	}
}
