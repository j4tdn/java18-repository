package view;

/**
 * Viết chương trình tìm giai thừa của một số nguyên dương N
 * Biết rằng: N có thể được nhập từ bàn phím hoặc khai báo sẵn
 * Ví dụ: Nhập N = 1 → 1! = 1
 * 		  Nhập N = 5 → 5! = 5.4.3.2.1 = 120
 */

public class Ex03FactorialOfNumber {
	public static void main(String[] args) {
		long result = factorial(5);
		System.out.println("Factorial of 5 --> " + result);
	}

	private static long factorial(int n) {
		long factorial = 1;
		while (n > 1) {
			factorial *= n;
			n--;
		}
		return factorial;
	}

}