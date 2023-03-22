package demoenum;

public class Ex02Processing {
	public static void main(String[] args) {
		System.out.println(process(5, 3, Operator.ADD));
	}

	private static double process(int a, int b, Operator operator) {
		switch (operator) {
		case ADD:
			return a + b;
		case DIVIDE:
			return a - b;
		case MULTIPLE:
			return a * b;
		
		default:	
			return a/b;
		}
	}
}
