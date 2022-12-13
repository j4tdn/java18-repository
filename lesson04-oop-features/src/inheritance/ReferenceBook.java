package inheritance;

public class ReferenceBook extends Book {
	private double tax;

	public ReferenceBook() {
	}
	
	
	

	public ReferenceBook(String id, String name, double salePrice, double tax) {
		super(id, name, salePrice);
		this.tax = tax;
	}
	
	public double getTax() {
		return tax;
	}
	
	public void setTax(double tax) {
		this.tax = tax;
	}




	



	

}