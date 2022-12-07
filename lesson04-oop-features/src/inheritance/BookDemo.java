package inheritance;

public class BookDemo {
	public static void main(String[] args) {
		ReferenceBook r1 = new ReferenceBook("r1", "R1 Math", 26, 5d);
		ReferenceBook r2 = new ReferenceBook("r2", "R2 Chemistry", 32, 10d);
		ReferenceBook r3 = new ReferenceBook("r3", "R2 Chemistry Adv", 32, 12d);
		
		ClassicalBook c1 = new ClassicalBook("c1", "C1 History", 16, false);
		ClassicalBook c2 = new ClassicalBook("c2", "C2 Physical", 22, true);
		ClassicalBook c3 = new ClassicalBook("c3", "C3 Physical V2", 22, true);
		
		// Tìm và in ra những cuốn sách(STK) có thuế > 5% và những cuốn sách
		// (SGK) là sách mới
		Book[] books = {r1, r2, r3, c1, c2, c3};
		// book =>> 'r1', r2, r3, c1, c2, c3
		for(Book book: books) {
			// nếu book lúc runtime là reference book
			if (book instanceof ReferenceBook) {
				double tax = ((ReferenceBook)book).getTax();
				if (tax > 5d) {
					System.out.println(book);
				}
			} else if (book instanceof ClassicalBook) {
				boolean status = ((ClassicalBook) book).getStatus();
				if (status) {
					System.out.println(book);
				}
			}
		}
		
	}
}