package inheritance;

public class ClassicalBook extends Book {
	private boolean status;

	public ClassicalBook() {
	}

	public ClassicalBook(String id, String name, double salesPrice, boolean status) {
		super(id, name, salesPrice);
		this.status = status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return super.toString() + ", status= " + this.status;
	}

}
