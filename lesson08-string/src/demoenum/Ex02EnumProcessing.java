package demoenum;

public class Ex02EnumProcessing {
	public static void main(String[] args) {
		int result = process(5, 10, Operator.ADD);
		System.out.println("result: " + result);
	}

	// Write a method int process(a, b, ...) --> + - / :
	private static int process(int a, int b, Operator operator) {
		switch (operator) {
		case ADD:
			return a + b;
		case SUBTRACT:
			return a - b;
		case DIVIDE:
			return a / b;
		default:
			return a * b;
		}

	}
}
