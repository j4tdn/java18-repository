package view;

public class Ex03Factorial {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(n + "! = " + fact(n));
	}
	
	private static int fact(int n) {
		
		int f = 1;
		while(n > 1) {
			f *= n--;
		}
		return f;
	}
}