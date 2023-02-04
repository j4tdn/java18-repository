package custom_exception;

public class CustomExceptionDemo {
   public static void main(String[] args) {
	

		int number = -10;
		try {
			ZeroNumberValidator znValidator = new ZeroNumberValidator(number);
			znValidator.validate();
			System.out.println("number is valid -->" + number);
		}
         // e = new ZeroNumberException("number must greater than 0")
		catch (ZeroNumberException e) {
			System.out.println("--->" + e.getMessage());
		}
		System.out.println("finished....");

}
}
