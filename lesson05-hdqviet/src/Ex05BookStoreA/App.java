package Ex05BookStoreA;

public class App {
	public static void main(String[] args) {
		Book c1 = new ClassicalBook("SGK1", 100, "NN", false);
		Book c2 = new ClassicalBook("SGK2", 90, "Nhi Đồng", false);
		Book c3 = new ClassicalBook("SGK3", 10, "NN", true);
		
		Book r1 = new ReferenceBook("STK1", 80, "Nhi Đồng", 10d);
		Book r2 = new ReferenceBook("STK2", 60, "ND", 5d);
		
		Book[] books = {c1, c2, c3, r1, r2};
		
		Customer cts1 = new Customer(1, "Nam", "0335971546", "Hue");
		
		Order o1 = new Order(cts1 , new BookDetail[] {
				new BookDetail(r1, 1),
				new BookDetail(c1, 1),
		});
		
		System.out.println("Sách thuộc nhà xuất bản Nhi Đồng:");
		
		for(Book book: books) {
			if (book.getPublisher() == "Nhi Đồng") {
				System.out.println(book);
			}
		}
		System.out.println("\n");
		System.out.println("Sách có đơn giá nhỏ hơn 50:");
		
		for(Book book: books) {
			if (book.getPrice() < 50) {
				System.out.println(book);
			}
		}
		System.out.println("\n");
		System.out.println("Sách giáo khoa có đơn giá từ 100 đến 200:");
		
		for(Book book: books) {
			if (book instanceof ClassicalBook) {
				if (((ClassicalBook) book).getPrice() >= 100 && ((ClassicalBook) book).getPrice() <= 200) {
					System.out.println(book);
				}
			}
		}
		System.out.println("\n");
		System.out.println("Total price ---> " + Utils.export(o1));
	}
}
