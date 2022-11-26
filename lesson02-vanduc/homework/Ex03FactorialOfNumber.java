package homework;

public class Ex03FactorialOfNumber {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(n+ "! = " + fact(5));
	}

	private static int fact(int n) {
		
		int f = 1;
		while(n > 1) {
			f *= n--;
			
		}
		return f;
	}
}
