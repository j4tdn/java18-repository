package data.primitive;

public class Ex01BasicDemo {

	private static int age = 20;
	public static double price = 20.6;
	private static float avg = 20.6f;
	public char letter = 'A';

	public static void main(String[] args) {
		final int total = 222;

		Ex01BasicDemo.age = 30;

		double price = 99.99d;
		System.out.println("local price:  " + price);
		System.out.println("global price:  " + Ex01BasicDemo.price);
	}

	public static void demo() {
		age = 60;
	}
}
