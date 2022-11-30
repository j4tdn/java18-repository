package polymorphism.method.overloading;
/**
 * Đa hình trong phương thức
 * ==> overloading
 * 		+ 2 hoặc nhiều phương thức thuộc cùng 1 class trùng tên
 * 			. Khác số lượng tham số truyền vào 
 * 			. Khác ít nhất 1 KDL truyền vào của tham số
 */
public class OverloadDemo {
	public static void main(String[] args) {
		System.out.println("sum2 --> " + sum(5, 7));
		System.out.println("sum2 --> " + sum(5, 7, 9));
		System.out.println("sum2d --> " + sum(1.2d, 7.8d));
		System.out.println("sumAsString --> " + sumAsString(1, 2));
	}

	// Tìm tổng các số
	
		private static double sum(double a, double b) {
			return a + b;
		}
		
		// Cùng tham số truyền vào với cái trên -> ko thể để trùng tên -> sumAsString -> ko phải overloading
		private static String sumAsString(double a, double b) {
			return "" + a + b;
		}
		
		private static int sum(int a, int b) {
			return a + b;
		}
		
		private static int sum(int a, int b, int c) {
			return a + b + c;
		}
}
