package custom_exception;

public class EmailException extends RuntimeException {

	// --> File processing(read/write encode file)
	private static final long serialVersionUID = -2840414122584476375L;

	public EmailException(String message) {
		super(message);
	}
}
