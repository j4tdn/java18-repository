package inheritance;

public class BookDemo {
	public static void main(String[] args) {
		 ReferenceBook r1 = new ReferenceBook("T1", "Toan", 40, 3d);
		 ReferenceBook r2 = new ReferenceBook("H1", "Hoa", 50, 10d);
		 ReferenceBook r3 = new ReferenceBook("TV1", "Tiengviet", 25, 5d);
		 
		 
		 ClassicalBook c1 = new ClassicalBook("456", "Tieng anh", 32,true);
		 ClassicalBook c2 = new ClassicalBook("456", "GDCD", 34,false);
		 ClassicalBook c3 = new ClassicalBook("456", "Dia ly", 56,true);
		 
		 
		 // Tìm và in ra những cuốn sách (sách tham khảo) có thuế > 5% và những cuốn sách giáo khoa là sách mới
		 
		 Book [] books = {r1, r2, r3, c1, c2, c3};
		
		 // instanceof: là lúc runtime -->(nếu book lúc runtime là referenbook thì...)
		 
		 for (Book book: books) {
			 if (book instanceof ReferenceBook ) {
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
