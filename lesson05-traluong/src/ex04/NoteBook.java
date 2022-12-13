package ex04;

public class NoteBook extends Book{
	private String id;
	private double price;
	private String publisher;
	private double tax;
	
	public NoteBook(String id, double price, String publisher, double tax) {
		super(id, price, publisher);
		this.tax = tax;
	}


	public NoteBook() {
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "NoteBook [id=" + id + ", price=" + price + ", publisher=" + publisher + ", tax=" + tax + "]";
	}
	
}
