package exercise05;

public class BookDetail {
	private Book book;
	private int quantity;
	
	public BookDetail() {
		// TODO Auto-generated constructor stub
	}

	public BookDetail(Book book, int quantity) {
		this.book = book;
		this.quantity = quantity;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
