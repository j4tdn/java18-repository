package data.primitive;

public class Ex02DataStorage {
	public static void main(String[] args) {
		int a = 24;
		int b = 42;
		System.out.println("a1: " + a);
		System.out.println("b1: " + b);

		a = b;
		System.out.println("a2: " + a);
		System.out.println("b2: " + b);
		
		
		modify(a);
		System.out.println("a3: " + a);
	}
private static void modify(int input) {
	input = 159;
}
}