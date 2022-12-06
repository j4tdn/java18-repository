package inheritance;

public class ReferenceBook extends Book{
	private double tax;
	
	public ReferenceBook() {
		
	}
	
	// this: current object
	// --> goi nhung thuoc tinh/ phuong thuc o class hien tai va lop cha khi cha cho phep
	// super: parent object
	// --> goi nhung thuoc tinh/ phuong thuc o lop cha (cho phep)
	
	
	//
	public ReferenceBook(String id, String name, double salesPrice, double tax) {
		super(id, name, salesPrice);
		this.tax = tax;
		
	}
	
	public double getTax() {
		return tax;
	}
	
	public void setTax() {
		this.tax = tax;
	}
	
	@Override
	public String toString() {
		return "ReferenceBook [tax=" + tax + ", toString()=" + super.toString() + "]";
	}
	

}
