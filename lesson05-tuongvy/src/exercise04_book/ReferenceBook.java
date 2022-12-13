package exercise04_book;

public class ReferenceBook extends Book{
	private float tax;

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public ReferenceBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReferenceBook(String id, float salesPrice, String publisher, float tax) {
		super("STK" + id, salesPrice, publisher);
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "ReferenceBook [id=" + this.getId() + ", salesPrice=" + this.getSalesPrice() + ", publisher=" + this.getPublisher() + ", tax=" + tax + "]";
	}
	
	
	
	

}
