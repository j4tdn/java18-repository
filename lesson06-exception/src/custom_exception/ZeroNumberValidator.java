package custom_exception;

public class ZeroNumberValidator {
	
	private int number;
	
	public ZeroNumberValidator (int number) {
		this.number = number;
	}
	void validate () {
		if (number < 0) {
			throw new ZeroNumberException("number must greater than 0.");
		}
	}
}
