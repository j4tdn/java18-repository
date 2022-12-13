package polymorphism.method.overloading;

/**
 đa hình trong phương thức
 ==> overloading
 	+ 2 hoặc nhiều các phương thức/ hàm thuộc cùng 1 class
 	 		-- mà trùng tên nhưng khác số lượng tham số 
 	 		-- khác KDL truyền vào  của tham số
 	 		
 	 		==> thì đc gọi là hàm overloading
 	
 */

public class MethodOverloadDemo {
	public static void main(String[] args) {
		System.out.println("2 "+sum(5,7));
		System.out.println("3 "+sum(5,7,9));
		System.out.println("2d " + sum(1.2d, 3.4d));
		
	}
//	tìm tổng các số
	private static int sum(int a, int b) {
		return a+b;
	}
	private static double sum(double a, double b) {
		return a+b;
	}
	private static int sum(int a, int b, int c) {
		return a+b+c;
	}

}
