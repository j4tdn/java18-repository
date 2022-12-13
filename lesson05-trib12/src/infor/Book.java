package infor;

public class Book {
	private String idBook;
	private Double salesPrice;
	private String publisher;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String idBook, Double salesPrice, String publisher) {
		this.idBook = idBook;
		this.salesPrice = salesPrice;
		this.publisher = publisher;
	}

	public String getIdBook() {
		return idBook;
	}

	public void setIdBook(String idBook) {
		this.idBook = idBook;
	}

	public Double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(Double salesPrice) {
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
		return "Book [idBook=" + idBook + ", salesPrice=" + salesPrice + ", publisher=" + publisher + "]";
	}
	
	

}
