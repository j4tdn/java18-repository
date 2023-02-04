package custom_exceotion;

public class ZeroNumberException extends RuntimeException{
	// --> File processing ( read/write encode file)
	private static final long serialVersionUID = -2115547673132188082L;
	
	public ZeroNumberException(String message) {
		super(message);
	}
}
