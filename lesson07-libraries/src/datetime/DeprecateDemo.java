package datetime;

public class DeprecateDemo {
	public static void main(String[] args) {
		// coder, project --> version 1.0
		System.out.println("sum2: " + sum(5,8));
		System.out.println("sum2: " + sum(2,3));
		System.out.println("sum2: " + sum(5,7));
	}
	
	// JAVA version 2.0 --> sum(a, b) --> add(a, b)
	
	// JAVA version 1.0 --> sum(a, b)
	public static int sum(int a, int b) {
		return a + b;
	}
}
