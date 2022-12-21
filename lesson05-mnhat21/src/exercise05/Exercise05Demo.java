package exercise05;

public class Exercise05Demo {
	public static void main(String[] args) {
		Book b1 = new ClassicalBook("SGK01", 60, "Giao duc", true);
		Book b2 = new ClassicalBook("SGK02", 40, "Nhi Dong", false);
		Book b3 = new ClassicalBook("SGK03", 180, "Kim Dong", true);
		
		Book b4 = new ReferenceBook("STK01", 200, "Nhi Dong", 5);
		Book b5 = new ReferenceBook("STK02", 30, "Hoa Nang", 10);
		
		Book[] books = {b1,b2,b3,b4,b5};
		System.out.println("Sach co nha xuat ban Nhi Dong");
		findNhiDongPublisher(books);
		System.out.println("==============================");
		
		System.out.println("Sach co don gia nho hon 50");
		findLessThan50Price(books);
		System.out.println("==============================");
		
		System.out.println("Sach co don gia tu 100 den 200");
		findFrom100To200Price(books);
		System.out.println("==============================");
		
		Customer c1 = new Customer("Cus1007", "Kevin", "0399482222", "Manchester");
		BookDetail bd1 = new BookDetail(b1, 2);
		BookDetail bd2 = new BookDetail(b5, 3);
		BookDetail[] bds = {bd1, bd2};
		
		Order o1 = new Order(c1, bds);
		
		System.out.println(o1.calcPrice());
		
	}
	
	private static void findNhiDongPublisher(Book[] books) {
		for(Book book : books) {
			if(book.getPublisher() == "Nhi Dong") {
				System.out.println(book);
			}
		}
	}
	
	private static void findLessThan50Price(Book[] books) {
		for(Book book : books) {
			if(book.getPrice() < 50) {
				System.out.println(book);
			}
		}
	}
	
	private static void findFrom100To200Price(Book[] books) {
		for(Book book : books) {
			if(book.getPrice() >= 100 && book.getPrice() <= 200) {
				System.out.println(book);
			}
		}
	}
}
