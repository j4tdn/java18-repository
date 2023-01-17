package bean;

public class Order {
	private Customer cs;
	private BookDetailOrder[] books;
	
	public Order(Customer cs, BookDetailOrder[] books) {
		super();
		this.cs = cs;
		this.books = books;
	}

	public Customer getCs() {
		return cs;
	}

	public void setCs(Customer cs) {
		this.cs = cs;
	}

	public BookDetailOrder[] getBooks() {
		return books;
	}

	public void setBooks(BookDetailOrder[] books) {
		this.books = books;
	}
}
