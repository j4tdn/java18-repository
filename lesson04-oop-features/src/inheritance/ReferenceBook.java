package inheritance;

public class ReferenceBook extends Book {
	private double tax;
	
	public ReferenceBook() {
		
	}

	public ReferenceBook(String id, String name, double salesPrice, double tax) {
		super(id, name, salesPrice);
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
