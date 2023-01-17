package custom_exception;

public class CustomExceptionDemo {
	public static void main(String[] args) {
		int number = -5;
		
		try {
			ZeroNumberValidator znValidator = new ZeroNumberValidator(number);
			znValidator.validate();
			System.out.println("Number is valid "+ number);
		} catch (ZeroNumberException e) {
			System.out.println(e.getMessage());
		}
	}
}
