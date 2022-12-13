package ex04;

public class BookDemo {
	public static void main(String[] args) {
		System.out.println("toàn bộ sách thuộc nhà xuất bản Nhi Đồng: ");
		look1(data());
		System.out.println("==========================================");
		System.out.println("toàn bộ sách có đơn giá nhỏ hơn 50: ");
		look2(data());
		System.out.println("==========================================");
		System.out.println("toàn bộ sách giáo khoa có đơn giá từ 100 đến 200: ");
		look3(data());
	}

	public static Book[] data() {
		Book c1 = new ClassicalBook("SGK01", 40d, "Việt Tây", true);
		Book c2 = new ClassicalBook("SGK02", 110d, "Nhi Đồng", true);
		Book c3 = new ClassicalBook("SGK03", 250d, "Công Huy", false);

		Book r1 = new ReferenceBook("STK01", 150d, "Nhi Đồng", 5d);
		Book r2 = new ReferenceBook("STK02", 250d, "Hữu Thái", 10d);

		Book[] books = { c1, c2, c3, r1, r2 };
		return books;
	}

	// Tìm toàn bộ sách thuộc nhà xuất bản Nhi Đồng
	public static void look1(Book[] books) {
		for (Book book : books) {
			if (book.getPublisher() == "Nhi Đồng") {
				System.out.println(book);
			}
		}
	}

	// Tìm toàn bộ sách có đơn giá nhỏ hơn 50
	public static void look2(Book[] books) {
		for (Book book : books) {
			if (book.getSalesPrice() < 50d) {
				System.out.println(book);
			}
		}
	}

	// Tìm toàn bộ sách giáo khoa có đơn giá từ 100 đến 200
	public static void look3(Book[] books) {
		for (Book book : books) {
			if (book.getSalesPrice() >= 100d && book.getSalesPrice() <= 200d) {
				System.out.println(book);
			}
		}
	}

}
