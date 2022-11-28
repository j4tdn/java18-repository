package polymorphism.method.overloading;

/*
 * Da hinh trong phuong thuc
 * ==> overloading
 * 	+ 2|n phuong thuc thuoc cung 1 class trung ten
 * 		# so luong tham so truyen vao
 * 		# it nhat 1 KDL truyen vao cua tham so
 */
public class MethodOverloadDemo {
	public static void main(String[] args) {
		System.out.println("sum2 --> " + sum(2, 5));
		System.out.println("sum2d --> " + sum(1.2d, 5.9d));
		System.out.println("sumAsString --> " + sum(1, 5));
		System.out.println("sum3 --> " + sum(2, 5, 4));
	}
	
	// tim tong cac so
	
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