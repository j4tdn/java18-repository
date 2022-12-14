package inheritance;

public class BookDemo {
      public static void main(String[] args) {
    	 ReferenceBook r1 = new ReferenceBook("r1", "R1 Math", 100d, 5d);
    	 ReferenceBook r2 = new ReferenceBook("r2", "R2 Chemistry", 10d, 6d);
    	 ReferenceBook r3 = new ReferenceBook("r3", "R3 Chemistry Adv", 10d, 6d);
    	 
    	 ClassicalBook c1 = new ClassicalBook("c1", "C1 History", 16d, false);
    	 ClassicalBook c2 = new ClassicalBook("c2", "C2 Physical", 22d, true);
    	 ClassicalBook c3 = new ClassicalBook("c3", "C3 Physical V2", 22d, true);
    	 
    	 
    	 // tìm và in ra những cuốn sách (STK ) có thuế > 5% và những cuốn sách (SGK) lfa sách mới
    	 //ALT SHIFT r ĐỔI TÊN
    	 
    	 Book[] books = {r1,r2,r3,c1,c2,c3};
    	 //book => r1,r2,r3,c1,c2,c3
    	 for(Book book: books) {
    		 // nếu book lúc runtime là referenceBook
    		 if (book instanceof ReferenceBook) {
    			 double tax = ((ReferenceBook)book).getTax();
    			 if (tax > 5d) {
    				 System.out.println(book);
    			 }
    		 }else if (book instanceof ClassicalBook) {
    			boolean status = ((ClassicalBook) book).getStatus();
    			if (status) {
    				System.out.println(book);
    			}
    		 }
    	 }
      }
}
