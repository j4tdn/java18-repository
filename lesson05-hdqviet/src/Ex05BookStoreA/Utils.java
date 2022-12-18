package Ex05BookStoreA;

public class Utils {
	public Utils() {
	}
	
	public static double export(Order order) {
		double totalOfMoney = 0;
		
		BookDetail[] bookDetails = order.getBookDetails();
		
		for (BookDetail bookEach : bookDetails) {
			Book book = bookEach.getBook();
			int quantity = bookEach.getQuantity();
			double idCost = book.getPrice() * quantity;
			if(book instanceof ReferenceBook) {
				idCost *= (1 +((ReferenceBook) book).getTax() / 100);
			}
			if(book instanceof ClassicalBook) {
				if(!((ClassicalBook) book).getStatus()) {
					idCost = idCost * 70/100;
				}
			}
			totalOfMoney += idCost;
		}
		
		return totalOfMoney;
	}
}
