package exercise04_book;

public class Book {
	private String id;
	private float salesPrice;
	private String publisher;
	
	public Book() {
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public float getSalesPrice() {
		return salesPrice;
	}
	public void setSalesPrice(float salesPrice) {
		this.salesPrice = salesPrice;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Book(String id, float salesPrice, String publisher) {
		super();
		this.id = id;
		this.salesPrice = salesPrice;
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", salesPrice=" + salesPrice + ", publisher=" + publisher + "]";
	}
	
	
	
	

}
