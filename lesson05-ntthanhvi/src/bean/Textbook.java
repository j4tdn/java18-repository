package bean;

public class Textbook extends Book{
	private boolean status;
	
	public Textbook() {

	}

	public Textbook(String idBook, double price, String publishC, boolean status) {
		super(idBook, price, publishC);
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
		return "Textbook [status=" + status + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
