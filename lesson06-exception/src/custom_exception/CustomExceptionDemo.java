package custom_exception;

public class CustomExceptionDemo {
	public static void main(String[] args) {
		int number = -2;
		try {
			ZeroNumberValidator zn = new ZeroNumberValidator(number);
			zn.validate();
			System.out.println("number is valid --> " + number);
		} catch (ZeroNumberException e) {
			System.out.println("--> " + e.getMessage());
		}
		
		System.out.println("Finished...");
	}
}
