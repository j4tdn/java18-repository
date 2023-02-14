package custom_exception;

public class CustomExceptionDemo {
	public static void main(String[] args) {
		int number = -5;

		try {
			ZeroNumberValidator znValidator = new ZeroNumberValidator(number);
			znValidator.validate();
			System.out.println("number is valid --> " + number);
		} catch (ZeroNumberException e) { // e = new ZeroNumberException("number must be greater than 0!!!");
			System.out.println("--> " + e.getMessage());
		}

		System.out.println("Finished !!! ");
	}

}
