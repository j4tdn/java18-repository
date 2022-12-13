package ex04;

public class Book {
	private String id;
	private double salesPrice;
	private String publisher;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String id, double salesPrice, String publisher) {
		super();
		this.id = id;
		this.salesPrice = salesPrice;
		this.publisher = publisher;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", salesPrice=" + salesPrice + ", publisher=" + publisher + "]";
	}

}
