package Custom_exception;

public class ZeroNumberException extends RuntimeException {

	// --> File processing(read/writenencode file)
	private static final long serialVersionUID = -266483692950602126L;

		public ZeroNumberException(String message) {
			super(message);
		}
}
