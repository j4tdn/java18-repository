package inheritance;

import java.util.Iterator;

public class BookDemo {
	public static void main(String[] args) {
		ReferenceBook r1 = new ReferenceBook("r1", "r1 math", 26, 5d);
		ReferenceBook r2 = new ReferenceBook("r2", "r2 chemistry", 32, 5d);
		ReferenceBook r3 = new ReferenceBook("r3", "r3 chemistry Ads", 32, 5d);
		
		ClassicalBook c1 = new ClassicalBook("C1", "C1 History", 16, true);
		ClassicalBook c2 = new ClassicalBook("C2", "C2 Physical", 22, true);
		ClassicalBook c3 = new ClassicalBook("C3", "C3 Physical ADS", 22, true);
		
		Book [] books = {r1, r2, r3, c1, c2, c3};
		for (Book book: books) {
			if (book instanceof ReferenceBook) {
				double tax = ((ReferenceBook)book).getTax();
				if (tax > 5d) {
					System.out.println(book);
				}
			} else if (book instanceof ReferenceBook) {
				boolean status = ((ClassicalBook) book).getStatus();
				if (status) {
					System.out.println(book);
				}
			}
			
		}
	}

}