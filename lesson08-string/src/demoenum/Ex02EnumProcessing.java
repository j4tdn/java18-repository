package demoenum;

public class Ex02EnumProcessing {
	public static void main(String[] args) {
		int result = processing(5, 10, Operator.ADD);
		System.out.println("result: " + result);
	}
	
	private static int processing(int a, int b, Operator operator) {
		switch (operator) {
		case ADD: {
			return a + b;
		}
		case SUBTRACT: {
			return a - b;
		}
		case MULTIPLY: {
			return a * b;
		}
		default:
			return a / b;
		}
	}
}
