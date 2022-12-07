package inheritance;

public class BookDemo {
	public static void main(String[] args) {
		ReferenceBook r1 = new ReferenceBook("r1", "R1 Math", 26, 5d);
		ReferenceBook r2 = new ReferenceBook("r2", "R2 Chemistry", 32, 5d);
		ReferenceBook r3 = new ReferenceBook("r3", "R3 Chemistry Adv", 32, 12d);
		
		ClassicalBook c1 = new ClassicalBook("c1", "C1 History", 16, true);
		ClassicalBook c2 = new ClassicalBook("c2", "C2 Geographic", 22, false);
		ClassicalBook c3 = new ClassicalBook("c3", "C3 Physical V2", 22, true);
		
		Book[] books = {r1, r2, r3, c1, c2, c3};
		findBooks(books);
	}
	
	public static void findBooks(Book[] books) {
		for(Book book: books) {
			if(book instanceof ReferenceBook && ((ReferenceBook)book).getTax() > 5
					|| book instanceof ClassicalBook && ((ClassicalBook)book).getStatus() == true) {
				System.out.println(book);
			}
		}
	}
}
