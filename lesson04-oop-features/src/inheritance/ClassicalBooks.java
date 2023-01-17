package inheritance;

public class ClassicalBooks extends Book {
	private boolean status;

	public ClassicalBooks(String id, String name, double salePrice, boolean status) {
		super(id, name, salePrice);
		this.status = status;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ClassicalBooks [status=" + status + ", toString()=" + super.toString() + "]";
	}
	
	
}
