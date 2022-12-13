package ex04;

public class TextBook extends Book {
	private String id;
	private double price;
	private String publisher;
	private boolean isNew;

	public TextBook() {
	}
	
	

	public TextBook(String id, double price, String publisher, boolean isNew) {
		super(id, price, publisher);
		this.isNew = isNew;
		// TODO Auto-generated constructor stub
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

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	@Override
	public String toString() {
		return "TextBook [id=" + id + ", price=" + price + ", publisher=" + publisher + ", isNew=" + isNew + "]";
	}

}
