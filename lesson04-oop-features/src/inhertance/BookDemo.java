package inhertance;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class BookDemo {
	public static void main(String[] args) {
		ReferenceBook r1 = new ReferenceBook("B1" , "BOOk1", 100, 5d);
		ReferenceBook r2 = new ReferenceBook("B2" , "BOOk2", 100, 10d);
		ReferenceBook r3 = new ReferenceBook("B3" , "BOOk3", 100, 15d);
		
		ClassicalBook c1 = new ClassicalBook("B4", "BOOk4", 200, false);
		ClassicalBook c2 = new ClassicalBook("B5", "BOOk5", 200, true);
		ClassicalBook c3 = new ClassicalBook("B6", "BOOk6", 200, true);
//		System.out.println(b1);
//		System.out.println(b2);
		Book[] books = {r1, r2, r3, c1, c2, c3 };
		for(Book book: books) {
			//Nếu book lúc runtime là reference book
			if( book instanceof ReferenceBook) {
				double tax = ((ReferenceBook)book).getTax();
				if(tax > 5d) {
					System.out.println(book);
				}
			}else if( book instanceof ClassicalBook){
				boolean status = ((ClassicalBook)book).getStatus();
				if(status) {
					System.out.println(book);
				}
			}
			
		}
	}
}
