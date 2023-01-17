package inheritance;

public class ReferenceBooks extends Book{
	private double tax;
	
	public ReferenceBooks() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * this -> gọi những tt/function ở class hiện tịa và lớp cha(cho phép)
	 * super -> gọi những tt/pt ở lớp cha
	 */
	public ReferenceBooks(String id, String name, double salePrice, double tax) {
		super(id, name, salePrice);
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
		return "ReferenceBooks [tax=" + tax + ", toString()=" + super.toString() + "]";
	}

	
}
