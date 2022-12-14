package inheritance;

public class ClassicalBook extends Book {
	private boolean status;
	
	public ClassicalBook() {
	}

	public ClassicalBook(String id, String name, Double salesPrice, boolean status) {
		super(id, name, salesPrice);
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
		return "classicalbook [status=" + status + ", isStatus()=" + getStatus() + "]";
	}
	
}
