package Ex05BookStoreA;

public class ReferenceBook extends Book {
	private double tax;
	
	public ReferenceBook() {
	}

	public ReferenceBook(String id, double price, String publisher, double tax) {
		super(id, price, publisher);
		this.tax = tax;
	}
	
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double getTax() {
		return tax;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Tax = " + tax;
	}
}
