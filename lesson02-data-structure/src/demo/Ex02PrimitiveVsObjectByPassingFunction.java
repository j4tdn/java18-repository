package demo;

public class Ex02PrimitiveVsObjectByPassingFunction {
	public static void main(String[] args) {
		int a =20;
		update(a);
		System.out.println("a =>" + a);
		
	}
	private static void update(int input) {
		input = 100;
	}
	private static int change(int input) {
		input = 99;
		return input;
		
	}

}
