package exercise05;

public class ReferenceBook extends Book {
	private int tax;
	
	public ReferenceBook() {
		// TODO Auto-generated constructor stub
	}
	

	public ReferenceBook(String id, double price, String publisher, int tax) {
		super(id, price, publisher);
		this.tax = tax;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "ReferenceBook [tax=" + tax + ", getId()=" + getId() + ", getPrice()=" + getPrice() + ", getPublisher()="
				+ getPublisher() + "]";
	}


	@Override
	double calcPrice() {
		// TODO Auto-generated method stub
		return this.getPrice()*(1 + this.getTax()/100d);
	}
}
