package bean;

public class Book {
	private String id;
	private double price;
	private String publishingCompany;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String id, double price, String publishingCompany) {
		this.id = id;
		this.price = price;
		this.publishingCompany = publishingCompany;
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

	public String getPublishingCompany() {
		return publishingCompany;
	}

	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", price=" + price + ", publishingCompany=" + publishingCompany + "]";
	}
}
