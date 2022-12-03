package polymorphism.method.overloading;

/**
	Đa hình trong phương thức
	==> overloading
		+ 2|n phương thức cùng 1 class trùng tên
			. # số lượng tham số truyền vào
 			. # ít nhất 1 kiểu dữ liệu truyền vào của tham số
 */

public class MethodOverloadDemo {
	public static void main(String[] args) {
		System.out.println("sum2 --> " + sum(5,7));
		System.out.println("sum2 --> " + sum(5,7,9));
		System.out.println("sumAsString --> " + sum(5,7,9));
		
	}
	
	
	// Tìm tổng các số
	private static String sumAString (double a, double b) {
		return a + b + "";
	}
	
	private static double sum (double a, double b) {
		return a + b;
	}
	
	private static int sum (int a, int b) {
		return a + b;
	}
	
	private static int sum (int a, int b, int c) {
		return a + b + c;
	}
	

}
