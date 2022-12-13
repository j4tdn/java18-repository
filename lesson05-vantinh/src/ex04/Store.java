package ex04;

public class Store {
	public static void main(String[] args) {
		TextBook c1 = new TextBook("SGK12", 23, "Nhi Dong", false);
		TextBook c2 = new TextBook("SGK15", 75, "Mia", true);
		TextBook c3 = new TextBook("SGK17", 270, "Nhi Dong", true);
		
		ReferenceBook r1 = new ReferenceBook("STK45", 14, "Best", 3);
		ReferenceBook r2 = new ReferenceBook("STK9", 12, "Nhi Dong", 6);
		
		Book[] books = {c1, c2, c3, r1, r2};
		
		for (Book book : books) {
			String publisher = book.getPublisher(); 
			if (publisher == "Nhi Dong") {
				System.out.println(book);
			}
		}
		
		for (Book book : books) {
			Double price = book.getPrice();
			if (price < 50) {
				System.out.println(book);
			}
		}
		

		for (Book book : books) {
			Double price = book.getPrice();
			if (price > 100 && price < 200) {
				System.out.println(book);
			}
		}
		
		
		
	}
}
