package polymorphism.method.overloading;

public class MethodOverloadDemo {
	public static void main(String[] args) {
		System.out.println("sum2 --> " + sum (5,7));
		System.out.println("sum2d --> " + sum (1.2d,7.9d));
		System.out.println("sum3 --> " + sum(5,7,9));
		System.out.println("sumAsString --> " + sumAsString(1, 2));
	}
	private static double sum(double a, double b) {
		return a + b;
	}
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
