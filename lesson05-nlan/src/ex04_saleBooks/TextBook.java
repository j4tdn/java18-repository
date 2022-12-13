package ex04_saleBooks;

public class TextBook {
	private String id;
	private double salesPrice;
	private String publisher;
	private boolean status;
	
	public TextBook() {
	}
	
	public TextBook(String id, double salesPrice, String publisher, boolean status) {
		super();
		this.id = id;
		this.salesPrice = salesPrice;
		this.publisher = publisher;
		this.status = status;
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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TextBook [id=" + id + ", salesPrice=" + salesPrice + ", publisher=" + publisher + ", status=" + status
				+ "]";
	}
	
	
}
