package bean;

public class BookDetailOrder {
	private Book books;
	private int Quantity;
	public BookDetailOrder(Book books, int quantity) {
		super();
		this.books = books;
		Quantity = quantity;
	}
	public Book getBooks() {
		return books;
	}
	public void setBooks(Book books) {
		this.books = books;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
}
