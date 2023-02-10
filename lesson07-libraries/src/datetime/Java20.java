package datetime;

public class Java20 {
	// JAVA version 2.0 --> add(a, b) sub (a, b)
	// incompatible with 1.0
	public static int add(int ...numbers) {
		int sum = 0;
		for ( int number: numbers) {
			sum += number;
		}
		return sum;
	}
	
	public static int sum(int a,int b) {
		return a + b;
	}
	
	public static int sub(int a,int b) {
		return a - b;
	}
}
