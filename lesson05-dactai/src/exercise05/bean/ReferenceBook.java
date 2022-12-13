package exercise05.bean;

public class ReferenceBook extends Book{
	private double tax;
	
	public ReferenceBook() {
		// TODO Auto-generated constructor stub
	}

	public ReferenceBook(String id, double salesPrice, String publisher, double tax) {
		super("STK"+id, salesPrice, publisher);
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
		return super.toString() + ", tax: " + tax;
	}

	



	
	
}
