package exercise05;

public class BookTK extends BookB{
	private double tax;

	public BookTK(int idB, double priceB, String publishingCompany, double tax) {
		super(idB, priceB, publishingCompany);
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
		return "BookTK [tax=" + tax + ", toString()=" + super.toString() + "]";
	}
}
