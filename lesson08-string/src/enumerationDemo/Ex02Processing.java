package enumerationDemo;

public class Ex02Processing {
	public static void main(String[] args) {
		System.out.println("Adding result: " + check(5, 10, Operator.ADD));
	}

	private static int check(int a, int b, Operator operator) {
		switch (operator) {
		case ADD: {
			return a + b;
		}
		case SUBTRACT: {
			return a - b;
		}
		case MUTIPLY: {
			return a * b;
		}
		case DEVIDE: {
			return a / b;
		}
		default:
			throw new IllegalArgumentException("That is an unexpected operator. Please try again!");
		}
	}
}
