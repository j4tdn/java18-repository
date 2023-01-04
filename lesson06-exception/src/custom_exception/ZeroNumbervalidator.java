package custom_exception;

public class ZeroNumbervalidator {
	
	private int number;
	
	public ZeroNumbervalidator(int number) {
		this.number = number;
	}
	
	void validate() {
		if (number < 0) {
			throw new ZeroNumberException("number must greater than 0.");
		}
	}

}
