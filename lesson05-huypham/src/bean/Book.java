package bean;

public class Book {
	private int id;
	private double salePrice;
	private String publisher;
	
	public Book() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public Book(int id, double salePrice, String publisher) {
		this.id = id;
		this.salePrice = salePrice;
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", salePrice=" + salePrice + ", publisher=" + publisher + "]";
	}
	
	
}
