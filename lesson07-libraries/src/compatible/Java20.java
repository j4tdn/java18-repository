package compatible;

public class Java20 {
	// JAVA version 2.0 --> incompatible with 1.0
	// + sum(a, b) --> add(a, b)
	// + sub(a, b)
	/// ... variables: 0 hoặc n variables same as array
	public static int add(int ...numbers) {
		int sum = 0;
		for (int number: numbers) {
			sum += number;
		}
		return sum;
	}
	
	/**
	 * Deprecated from 2.0, reference to Java10.add(int ... numbers) 
	 */
	@Deprecated
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int sub(int a, int b) {
		return a - b;
	}
}
