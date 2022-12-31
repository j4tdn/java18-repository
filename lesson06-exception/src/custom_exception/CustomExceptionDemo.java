package custom_exception;

public class CustomExceptionDemo {
	public static void main(String[] args) {
		int n = -10;
		try {
			ZeroNumberValidator znValidator = new ZeroNumberValidator(n);
			znValidator.validate();
			System.out.println("Number is valid ---> " + n);
		} catch (ZeroNumberException e) {
			System.out.println("---> " + e.getMessage());
		}
		
		System.out.println("Finished..");
	}
}
