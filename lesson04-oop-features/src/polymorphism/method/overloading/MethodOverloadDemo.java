package polymorphism.method.overloading;

public class MethodOverloadDemo {
	public static void main(String[] args) {
System.out.println("sum2 --> " + sum(5, 7));
	}

	private static int sum(int a, int b) {
		return a + b;
	}
	
	private static int sum(int a, int b, int c) {
		return a + b + c;
	}

}
