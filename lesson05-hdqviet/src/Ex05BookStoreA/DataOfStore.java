package Ex05BookStoreA;

public class DataOfStore {
	public static void main(String[] args) {
		Book c1 = new ClassicalBook("SGK1", 100, "NN", true);
		Book c2 = new ClassicalBook("SGK2", 90, "Nhi Đồng", false);
		Book c3 = new ClassicalBook("SGK3", 10, "NN", true);
		
		Book r1 = new ReferenceBook("STK1", 80, "Nhi Đồng", 10);
		Book r2 = new ReferenceBook("STK2", 60, "ND", 5);
		
		Book[] books = {c1, c2, c3, r1, r2};
		
		System.out.println("Sách thuộc nhà xuất bản Nhi Đồng:");
		
		for(Book book: books) {
			if (book instanceof ReferenceBook) {
				if (((ReferenceBook) book).getPublisher() == "Nhi Đồng") {
					System.out.println(book);
				}
			} else if (book instanceof ClassicalBook) {
				if (((ReferenceBook) book).getPublisher() == "Nhi Đồng") {
					System.out.println(book);
				}
			}
		}
		
		System.out.println("Sách có đơn giá nhỏ hơn 50:");
		
		for(Book book: books) {
			if (book instanceof ReferenceBook) {
				if (((ReferenceBook) book).getPrice() < 50) {
					System.out.println(book);
				}
			} else if (book instanceof ClassicalBook) {
				if (((ReferenceBook) book).getPrice() < 50) {
					System.out.println(book);
				}
			}
		}
		
		System.out.println("Sách giáo khoa có đơn giá từ 100 đến 200:");
		
		for(Book book: books) {
			if (book instanceof ClassicalBook) {
				if (((ReferenceBook) book).getPrice() >= 100 && ((ReferenceBook) book).getPrice() <= 200) {
					System.out.println(book);
				}
			}
		}
		
		Customer a = new Customer(1, "Nam", "093237623", "HCM");
		
		
	}
}
