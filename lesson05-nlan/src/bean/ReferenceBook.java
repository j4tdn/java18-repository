package bean;

// Sách tham khảo
// extend Book: id, salesPrice, publicsher
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

	@Override
	public String toString() {
		return getId() + ", " + getSalesPrice() + ", " + getPublisher() + ", " + getTax() + "\n";
	}
}
