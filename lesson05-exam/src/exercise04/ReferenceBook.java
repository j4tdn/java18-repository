package exercise04;

public class ReferenceBook extends Book {
	private double tax;

	public ReferenceBook() {

	}

	public ReferenceBook(String id, double salesPrice, String publisher, double tax) {
		super(id, salesPrice, publisher);
		this.tax = tax;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "ReferenceBook [tax=" + tax + ", toString()=" + super.toString() + "]";
	}

}