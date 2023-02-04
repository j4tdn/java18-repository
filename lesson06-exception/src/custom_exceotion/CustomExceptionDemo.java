package custom_exceotion;

public class CustomExceptionDemo {
	public static void main(String[] args) {
		int number = -5;
//		
//		ZeroNumberValidator znValitor = new ZeroNumberValidator(number);
//		znValitor.validate();
		try {
			ZeroNumberValidator znValitor = new ZeroNumberValidator(number);
			znValitor.validate();
			System.out.println("number is valid: " + number);
		}catch(ZeroNumberException e) {
			System.out.println("--> " + e.getMessage());
		}
		System.out.println("Finished");
	}
}
