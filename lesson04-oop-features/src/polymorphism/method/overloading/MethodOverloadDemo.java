package polymorphism.method.overloading;
/*
 * Đa hình trong phương thức
 * 	==> overloading 
 * 		2 phương thức cùng 1 class trùng tên
 * 			+ Khác tham số 
 * 			+ Khác KDL của tham số
 */

public class MethodOverloadDemo {
	public static void main(String[] args) {
		System.out.println(sum(5, 7));
		System.out.println(sum(5, 7, 22));
		System.out.println(sum(5d, 7d));
	}
	//tìm tổng các số
	private static double sum(double a,double b ) {
		return a+b; 
	}
	private static int sum(int a,int b) {
		return a+b;
	}
	private static int sum(int a,int b,int c) {
		return a+b+c;
	}
}
