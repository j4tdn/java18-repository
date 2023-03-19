package demoenum;

public class Ex02EnumProcessing {
	public static void main(String[] args) {
		int result = Calculate(5, 10, Operator.MULTIPLY);
		System.out.println(result);
	}
	
	private static int Calculate(int a, int b, Operator operator) {
		switch (operator) {
		case ADD:
			return a + b;
		case SUBSTRACT:
			return a - b;
		case MULTIPLY:
			return a * b;
		default:
			return a / b;
		}
	}
}
