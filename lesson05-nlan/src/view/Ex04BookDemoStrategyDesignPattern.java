package view;

import java.util.Arrays;

import bean.Book;
import bean.ReferenceBook;
import bean.TextBook;
import funtional.BookPredicate;

// thông tường
// tham số của hàm --> biến (KNT, KDT)

// Strategy --> Chiến lược/ chức năng(hàm) trừu tượng
// Design Pattern: Mẫu thiết kế
// Mục đíc: Viết 1 hàm có thể truyền tham số là 1 chiến lược
// --> Biến hàm có tham số là 1 hàm khác

// Và sau đó ai gọi hàm này thì sẽ truyền chức năng/hàm chi tiết cụ thể vào
// Developer --> tìm ra strategy(chiến lược)signature đó

public class Ex04BookDemoStrategyDesignPattern {
	public static void main(String[] args) {
		Book[] books = createData();

		// Tìm toàn bộ sách thuộc nhà xuất bản Nhi Đồng
		BookPredicate bp1 = new BookPredicate() {

			@Override
			public boolean test(Book book) {
				return "ND".equals(book.getPublisher());
			}
		};
		Book[] booksByPublisher = find(books, bp1);
		System.out.println("booksbyPublisherVN --> " + Arrays.toString(booksByPublisher));

		System.out.println("\n--------------\n");
		// Tìm toàn bộ sách có đơn giá nhỏ hơn 50

		Book[] booksBySalesPriceLt = find(books, book -> book.getSalesPrice() < 50);
		System.out.println("---> " + Arrays.toString(booksBySalesPriceLt));
		System.out.println("\n----------------------\n");

		// Tìm toàn bộ sách giáo khoa có đơn giá từ 100 đến 200
		Book[] booksBySalesPriceFt = find(books, book -> book.getSalesPrice() >= 100 && book.getSalesPrice() <= 200);

		System.out.println("---> " + Arrays.toString(booksBySalesPriceFt));
		// System.out.println("booksBySalesPriceFt40-70 --> " +
		// Arrays.toString(booksBySalespriceFt));

		// input --> book
		// output --> boolean

	}
	// tham số --> hàm/ chức năng trừu tượng
	// hàm trừu tượng --> input, output
	// stategy: boolean method_name(Book book)
	// Tạo abstract class/ interface chứa hàm trừu tượng
	// BookPredicate bp = bp1

	private static Book[] find(Book[] books, BookPredicate bp) {

		Book[] result = new Book[books.length];
		int running = 0;
		for (Book book : books) {
			if (bp.test(book)) {
				result[running++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}

	private static Book[] createData() {
		// Tạo 3 đối tượng sách giáo khoa
		TextBook tb1 = new TextBook("SGK-01", 26, "VN", true);
		TextBook tb2 = new TextBook("SGK-02", 18, "ND", false);
		TextBook tb3 = new TextBook("SGK-03", 44, "ND", true);

		// Tạo 2 đối tượng sách tham khảo
		ReferenceBook rb1 = new ReferenceBook("STK-04", 60, "ND", 5);
		ReferenceBook rb2 = new ReferenceBook("STK-05", 88, "VN", 4);
		ReferenceBook rb3 = new ReferenceBook("STK-06", 88, "VN", 6);

		Book[] books = { tb1, tb2, tb3, rb1, rb2, rb3 };
		return books;

	}
}
