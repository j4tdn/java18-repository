package inheritance;

public class ClassicalBook extends Book {
	private boolean status;

	public ClassicalBook() {
	}

	public ClassicalBook(boolean status) {
		super();
		this.status = status;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String toString() {
		return "ClassicalBook [status=" + status + "]";
	}

}
