package kf.bai4;

public abstract class Book {
	 private String id;
	 private double salePrice;
	 private String  publisher;
	 public Book() {
	
	}
	public Book(String  id, double salePrice, String publisher) {
		super();
		this.id = id;
		this.salePrice = salePrice;
		this.publisher = publisher;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public abstract double GetTotal();
	@Override
	public String toString() {
		return "id=" + id + ", salePrice=" + salePrice + ", publisher=" + publisher ;
	}
	
	
	 
	
}
