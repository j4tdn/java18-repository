package polymorphism.method.overloading;

/**
  	Đa hình trong phương thức 
   ==> overloading
   + 2|n phương thức thuộc cùng 1 class trùng tên
   	. khác số lượng tham số truyền vào
   	. khác ít nhất 1 KDL truyền vào của tham số
  
 */
public class MethodOverloadDemo {
	public static void main(String[] args) {
		System.out.println("sum2 --> " + sum(5, 7));
		System.out.println("sumAsString --> " + sumAsString(1, 2));
		System.out.println("sum2d --> " + sum(1.2d, 7.8d));
		System.out.println("sum3 --> " + sum(5, 7, 9));
	}

	// Tìm tổng các số

	private static double sum(double a, double b) {
		return a + b;
	}
	
	private static String sumAsString(double a, double b) {
		return "" + a + b ;
	}

	private static int sum(int a, int b) {
		return a + b;
	}

	private static int sum(int a, int b, int c) {
		return a + b + c;
	}
}
