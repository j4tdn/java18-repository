package exercise05.bean;

public class TextBook extends Book{
	private boolean status;
	
	public TextBook() {
		// TODO Auto-generated constructor stub
	}

	public TextBook(String id, double salesPrice, String publisher, boolean status) {
		super("SGK" + id, salesPrice, publisher);
		this.status = status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public String toString() {
		return super.toString() + ", status: " + status;
	}

	
}
