package ex04;

public class Ex04Demo {
	public static void main(String[] args) {
		Book tb1 = new TextBook("SGK1", 100000, "Nhi Dong", true);
		Book tb2 = new TextBook("SGK1", 200000, "Nhi Dong", true);
		Book tb3 = new TextBook("SGK1", 300000, "Kim Dong", true);
		Book nb1 = new NoteBook("STK1", 200000, "NXB Tre", 5 );
		Book nb2 = new NoteBook("STK2", 240000, "Nhi Dong", 5 );
		
		Book[] listBook = {tb1, tb2, tb3, nb1, nb2};
		
	}
	/*
	public static Book[] findForPublisher(Book[] books) { 
		for (Book book: books) {
			String bookID = book.getId();
		//	if () {
				
		//	}
		}
	} */
}
