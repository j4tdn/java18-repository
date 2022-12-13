package exercise05;

public class ClassicalBook extends Book {
	private boolean status;
	
	public ClassicalBook() {
		// TODO Auto-generated constructor stub
	}

	public ClassicalBook(String id, double price, String publisher, boolean status) {
		super(id, price, publisher);
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
		return "ClassicalBook [status=" + status + ", getId()=" + getId() + ", getPrice()=" + getPrice()
				+ ", getPublisher()=" + getPublisher() + "]";
	}

	@Override
	double calcPrice() {
		// TODO Auto-generated method stub
		if(this.status == false) {
			return this.getPrice() * 0.7;
		}
		return this.getPrice();
	}
	
	
}
