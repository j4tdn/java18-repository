package polymorphism.method.overloading;

/**
 * Đa hình trong phương thức
 * ==> overloading
 *  	+ 2 hay nhieu phương thức thuộc 1 class trùng tên
 *  		. KHÁC SỐ lượng tham số truyền vào
 *  		. KHÁC ÍT NHÂT 1 KDL truyền vào của tham số
 */
public class MethodOverloadDemo {
	public static void main(String[] args) {
		System.out.println("sum2 --> " + sum(5, 7));
		System.out.println("sum2d --> " + sum(1.2d, 7.8d));
		System.out.println("sum3 --> " + sum(5, 7, 9));
		System.out.println("sumAsString --> " + sumAsString(1, 2));
		
	}
	
	//tìm tổng các số
	
	private static double sum(double a, double b) {
		return a + b;
	}
	
	private static String sumAsString(double a, double b) {
		return "" + a + b ;
	}
	
	private static int sum(int a, int b, int c) {
		return a + b + c;
	}
}
