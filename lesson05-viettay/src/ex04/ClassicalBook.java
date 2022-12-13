package ex04;

public class ClassicalBook extends Book {
	private Boolean status;

	public ClassicalBook() {
		// TODO Auto-generated constructor stub
	}

	public ClassicalBook(String id, double salesPrice, String publisher, Boolean status) {
		super(id, salesPrice, publisher);
		this.status = status;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ClassicalBook [status=" + status + ", toString()=" + super.toString() + "]";
	}

}
