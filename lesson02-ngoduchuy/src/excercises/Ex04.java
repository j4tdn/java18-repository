package excercises;

public class Ex04 {
	public static void main(String[] args) {
		int random[] = new int[4];
		long result = 0;
		for (int i = 0; i < 4; i++) {
			random[i] = 10 + (int) Math.floor(10 * Math.random());
		}
		for (int i = 0; i < 4; i++) {
			System.out.println("Number " + (i + 1) + ": " + random[i]);
			result += factorial(random[i]);
		}

		System.out.println("Result: " + result);
	}

	public static long factorial(int x) {
		long result = 1;
		for (int j = 1; j < x + 1; j++) {
			result *= j;
		}
		return result;
	}
}
