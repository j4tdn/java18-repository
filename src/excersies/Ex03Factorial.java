package excersies;

public class Ex03Factorial {
	public static void main(String[] args) {
		int n = 9;
		int temp = 1;
		for (int i = 1; i <= n; i++) {
			temp = temp * i;
		}
		System.out.println(temp);
	}
}

