package custom_exception;

public class CustomExceptionDemo {
	public static void main(String[] args) {
		int number = 10;
		try {
			ZeroNumbervalidator znValidator = new ZeroNumbervalidator(number);
			znValidator.validate();
			System.out.println("Number is valid -->" + number);
		} catch (ZeroNumberException e) {
			System.out.println("---> " + e.getMessage());
		}
		System.out.println("finished...");

	}
}
