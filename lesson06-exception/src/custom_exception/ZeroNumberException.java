package custom_exception;

public class ZeroNumberException extends RuntimeException{
	// --> File processing (read/write encode file)
	
	private static final long serialVersionUID = -77071979444041365L;

	public ZeroNumberException(String message) {
		super (message);
	}
}
