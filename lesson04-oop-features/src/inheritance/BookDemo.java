package inheritance;

public class BookDemo {
	public static void main(String[] args) {
		ReferenceBooks b1 = new ReferenceBooks("B1","Book1",290d,9d);
		ReferenceBooks b2 = new ReferenceBooks("B2","Book2",400d,20d);
		ReferenceBooks b3 = new ReferenceBooks("B3","Book3",1700d,15d);
		ClassicalBooks b4 = new ClassicalBooks("B4","book4", 1350d, true);
		ClassicalBooks b5 = new ClassicalBooks("B5","book5", 950d, false);
		ClassicalBooks b6 = new ClassicalBooks("B6","book6", 650d, true);
		
		Book[] books = {b1,b2,b3,b4,b5,b6};
		
		for(Book book:books) {
			if(book instanceof ReferenceBooks) {
				double tax = ((ReferenceBooks)book).getTax();
				if(tax > 10d) {
					System.out.println(book.getName());
				}
			}else if(book instanceof ClassicalBooks) {
				boolean status = ((ClassicalBooks)book).getStatus();
				if(status) {
					System.out.println(book.getName());
				}
			}
				
		}
	}
}
