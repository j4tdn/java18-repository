package inheritance;

public class ReFerenceBook extends Book {
	private double tax;
	
	public ReFerenceBook() {
	}
	
	//this: current object --> gọi những tt/phương thức ở class hiện tại và lớp cha(cho phép)
	//super: parent object --> gọi những tt/pt ở lớp cha
	public ReFerenceBook(String id, String name, double salesPrice, double tax) {
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
		return "ReFerenceBook [tax=" + tax + ", toString()=" + super.toString() + "]";
	}
	
	
}
