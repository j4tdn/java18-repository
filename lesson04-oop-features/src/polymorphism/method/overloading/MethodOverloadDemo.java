package polymorphism.method.overloading;

/**
 * Đa hình trong phương thức ==> overloading + 2 hoặc nhiều phương thức thuộc
 * cùng class trùng tên . khác số lượng tham số truyền vào . khác ít nhất 1 kiểu
 * dữ liệu của tham số
 */
public class MethodOverloadDemo {
	public static void main(String[] args) {
		System.out.println("sum2 --> " + sum(5, 7));
		System.out.println("sum3 --> " + sum(5, 7, 9));
		System.out.println("sum2d -->" + sum(3.6d, 7.6d));
		System.out.println("sumAsString --> " + sumAsString(1, 2));

	}

	// Tìm tổng các số
	private static int sum(int a, int b) {
		return a + b;
	}

	private static int sum(int a, int b, int c) {
		return a + b + c;
	}

	private static double sum(double a, double b) {
		return a + b;
	}

	private static String sumAsString(double a, double b) {
		return "" + a + b;
	}
}
