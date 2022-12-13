package ex04bookmanagement;

public class ItemDetail {
	private Book book;
	private int quantity;
	
	public ItemDetail() {
		// TODO Auto-generated constructor stub
	}

	public ItemDetail(Book book, int quantity) {
		super();
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

	@Override
	public String toString() {
		return "ItemDetail [book=" + book + ", quantity=" + quantity + "]";
	}
	
}
