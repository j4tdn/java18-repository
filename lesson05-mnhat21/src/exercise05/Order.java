package exercise05;

public class Order {
	private Customer customer;
	private BookDetail[] bookDetails;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(Customer customer, BookDetail[] bookDetails) {
		this.customer = customer;
		this.bookDetails = bookDetails;
	}

	public double calcPrice(BookDetail[] bookDetails) {
		double price = 0;
		for(BookDetail bd : bookDetails) {
			price = price + bd.getBook().getPrice() * bd.getQuantity();
		}
		return price;
	}
}
