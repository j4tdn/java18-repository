package polymorphism.method.overloading;

/**
 	Đa hình trong phương thức
 	==> overloading
 		+2 | n phương thức thuộc cùng 1 class trùng tên
 			. # số lượng tham số truyền vào\
 			. # ít nhất 1 kiểu DL truyền vào của tham số
 */
public class MethodOverloadDemo {
	public static void main(String[] args) {
		System.out.println("Sum2 --> "+sum(5,7));
		System.out.println("Sum2d --> "+sum(5,7));
		System.out.println("Sum3 --> "+sum(5,7,9));
		
		System.out.println("SumAsString --> "+sum(1,2));
	}
	private static double sum(double a, double b) {
		return a+b;
	}
	private static String sumAsString(double a, double b) {
		return a+b+"";
	}
	private static int sum(int a, int b) {
		return a+b;
	}
	private static int sum(int a, int b,int c) {
		return a+b+c;
	}
}
