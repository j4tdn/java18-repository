package custom_exception;

public class CustomerExceptionDemo {
public static void main(String[] args) {
	int number = -5;
	try {
		ZeroNumberValidator znValidator = new ZeroNumberValidator();
		znValidator.validate();
		System.out.println("number is valid --> " + number);
	}catch (ZeroNumberException e) {
		System.out.println("--------" + e.getMessage());
	}
	System.out.println("Finished");
}
}
