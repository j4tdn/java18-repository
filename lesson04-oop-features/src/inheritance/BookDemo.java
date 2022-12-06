package inheritance;

public class BookDemo {
	public static void main(String[] args) {
		// 
		ReFerenceBook r1 = new ReFerenceBook("r1", "R1 Math", 26, 5d);
		ReFerenceBook r2 = new ReFerenceBook("r2", "R2 Chemistry", 32, 10d);
		
		ClassicalBook c1 = new ClassicalBook("c1" , "C1 History", 16, false);
		ClassicalBook c2 = new ClassicalBook("c2" , "C2 Physical", 22, true);
	
		// Tìm và in ra những cuốn sách(STK) có thuế > 5% và
		// những cuốn sách giáo khoa là sách mới
		Book[] books = {r1, r2, c1, c2};
		for(Book book: books) {
			if(book instanceof ReFerenceBook) {
				if(((ReFerenceBook)book).getTax() > 5d) {
					System.out.println(book);
				}
			} else if(book instanceof ClassicalBook) {
				if(((ClassicalBook)book).getStatus()) {
					System.out.println(book);
				}
			}
		}
	}
}
