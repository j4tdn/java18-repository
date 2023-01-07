package custom_exception;

public class ZeroNumberException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ZeroNumberException(String message) {
		super(message);
	}

}