package polymorphism.methoad.overloading;

/**
  	Đa hình trong phương thức
  	==> Overloading
  	
 */
public class MethoadOverloadDemo {
	public static void main(String[] args) {
		System.out.println("sum2 -->" + sum(5,7));
		System.out.println("sum3 -->" + sum(5,7,9));
	}
	
	//Tìm tổng các số
	private static int sum(int a, int b) {
		return a + b;
	}
	
	private static int sum(int a, int b, int c) {
		return a + b + c;
	}

	private static double sum(double a, double b, int c) {
		return a + b + c;
	}
}
