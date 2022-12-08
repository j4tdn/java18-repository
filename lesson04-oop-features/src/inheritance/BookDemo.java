package inheritance;

public class BookDemo {
	public static void main(String[] args) {
		ReferenceBook r1 = new ReferenceBook("r1", "R1 Math", 26, 5d);
		ReferenceBook r2 = new ReferenceBook("r2", "R2 Chemistry", 26, 5d);
		ReferenceBook r3 = new ReferenceBook("r3", "R1 Chemistry Adv", 26, 5d);

		ReferenceBook c1 = new ReferenceBook("c1", "C1 History", 26, 5d);
		ReferenceBook c2 = new ReferenceBook("c2", "C2 Physical", 26, 5d);
		ReferenceBook c3 = new ReferenceBook("c3", "C3 Physical V2", 26, 5d);

		// Tìm và in ra nhưng cuốn sách(STK) có thuế > 5% và những cuốn sách
		// (SGK) là sách mới
		Book[] books = { r1, r2, r3, c1, c2, c3 };
		for (Book book : books) {
			if (book instanceof ReferenceBook) {
				double tax = ((ReferenceBook) book).getTax();
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
