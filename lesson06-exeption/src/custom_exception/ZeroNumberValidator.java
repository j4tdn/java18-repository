package custom_exception;

public class ZeroNumberValidator {

	private int number;

	public void ZeroNumberException (int number) {
		this.number = number;
		}

	void validate() {
		if (number < 0) {
			throw new ZeroNumberException("number ");
		}
	}
}


