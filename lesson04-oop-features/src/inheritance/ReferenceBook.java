package inheritance;

public class ReferenceBook extends Book {
	private double tax;
	
	public ReferenceBook() {
		// TODO Auto-generated constructor stub
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
	
	
	
	// this : current object
	// --> gọi những tt/phương thức ở class hiện tại và lớp cha (cho phép)
	// super : parent object
	// --> gọi những tt/phương thức ở lớp cha (cho phép)
	
	
}
