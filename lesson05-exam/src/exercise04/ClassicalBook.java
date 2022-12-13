package exercise04;

public class ClassicalBook extends Book {
	private boolean status;
	
	public ClassicalBook() {
	}
	
	public ClassicalBook(String id, double salesPrice, String publisher, boolean status) {
		super(id, salesPrice, publisher);
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
		return "ClassicalBook [isNew=" + status + ", toString()=" + super.toString() + "]";
	}
}
