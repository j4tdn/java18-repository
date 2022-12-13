package inheritance;

public class BookDemo {
	public static void main(String[] args) {
		ReferenceBook r1 = new ReferenceBook("r1", "r1 math", 26, 5d);
		ReferenceBook r2 = new ReferenceBook("r2", "r2 chemistry", 32, 5d);
		ClassicalBook c1 = new ClassicalBook("c1", "c1 history", 16, true);
		ClassicalBook c2 = new ClassicalBook("c2", "c2 history", 22, true);

//		tìm và in ra những cuốn sách (STK) có thuế > 5% và nhũng cuốn sách (SGK) là sách mới

		Book[] books = { r1, r2, c1, c2 };
		for (Book book : books) {
			if (book instanceof ReferenceBook) {
				double tax = ((ReferenceBook) book).getTax();
				if (tax > 2d) {
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
