package demoenum;

public class Ex02Processing {
	public static void main(String[] args) {
		System.out.println("Processing : " + process(3, 3, Operator.ADD));
	}
	private static  double process(int a,int b,Operator operatior) {
		switch (operatior) {
		case ADD: {
			return a+b;
		}
		case SUBTRACT: {
			return a-b;
		}
		case MULTIPLY: {
			return a*b;
		}
		default:
			return a*b;
		}
	}
}	
