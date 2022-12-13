package bean;

public class Book {
	private String idBook;
	private double price;
	private String publishC;
	
	public Book() {

	}

	public Book(String idBook, double price, String publishC) {
		super();
		this.idBook = idBook;
		this.price = price;
		this.publishC = publishC;
	}

	public String getIdBook() {
		return idBook;
	}

	public void setIdBook(String idBook) {
		this.idBook = idBook;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublishC() {
		return publishC;
	}

	public void setPublishC(String publishC) {
		this.publishC = publishC;
	}

	@Override
	public String toString() {
		return "Book [idBook=" + idBook + ", price=" + price + ", publishC=" + publishC + "]";
	}
	
	
}
