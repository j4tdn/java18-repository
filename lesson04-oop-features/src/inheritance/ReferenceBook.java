package inheritance;

public class ReferenceBook extends Book {
	private double tax;
	
	public ReferenceBook() {
	}

	public ReferenceBook(String id, String name, Double salesPrice, double tax) {
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
    
	//this : current object -> gọi những phương thức ở class hiện tại và lớp cha
	//super : parent object -> gọi những tt/pt ở lớp cha(cho phép)
	
    
	
	
	
      
}
