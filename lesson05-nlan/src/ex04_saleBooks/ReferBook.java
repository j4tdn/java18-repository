package ex04_saleBooks;

public class ReferBook extends TextBook {
	private double tax;

	public ReferBook() {

	}

	public ReferBook(String id, double salesPrice, String publisher, boolean status, double tax) {
		super(id, salesPrice, publisher, status);
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
		return "ReferBook [tax=" + tax + ", getId()=" + getId() + ", getSalesPrice()=" + getSalesPrice()
				+ ", getPublisher()=" + getPublisher() + "]";
	}

}
