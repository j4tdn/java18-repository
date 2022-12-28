package view;

import java.util.Arrays;

import bean.Book;
import bean.ReferenceBook;
import bean.TextBook;
import functional.BookPredicate;

/**
 *  Thông thường tham số của hàm --> biến(KNT, KDT)
 * 
 *  Strategy --> chiến lược/chức năng(hàm) trừu tượng
 *  Design Pattern --> Mẫu thiết kế
 *  Mục đích: Viết 1 hàm có thể truyền tham số là 1 chiến lược/hàm
 *  --> Biến hàm có tham số là 1 hàm khác
 *
 *  Và sau đó ai gọi hàm này thì sẽ truyền chức năng/hàm chi tiết cụ thể vào
 *  Developer --> tìm ra strategy signature đó
 */

public class Ex04BookDemoStrategyDisignPattern {
	public static void main(String[] args) {
		Book[] books = createData();

		BookPredicate bp1 = new BookPredicate() {

			@Override
			public boolean test(Book book) {
				return "ND".equals(book.getPublisher());
			}
		};
		Book[] bookByPublisher = find(books, bp1);
		System.out.println(Arrays.toString(bookByPublisher));

		Book[] bookBySalesPriceLt = find(books, book -> book.getSalesPrice() < 50);
		System.out.println(Arrays.toString(bookBySalesPriceLt));

		Book[] bookBySalesPriceFt = find(books, book -> {
			double salesPrice = book.getSalesPrice();
			return salesPrice > 40 && salesPrice < 70;
		});
		System.out.println(Arrays.toString(bookBySalesPriceFt));
	}
	
	/* input --> book
	 * output --> boolean
	 * if (salesPrice > salesPriceMin && salesPrice < salesPriceMax) 
	 * if (book.getSalesPrice() < salesPrice)
	 * if (publisher.equals(book.getPublisher()))
	 */
	
	// tham số --> hàm/chức năng trừu tượng
	// hàm trừu tượng --> input, output
	// strategy: boolean method_name(Book book)
	// Tạo abstract class/interface chứa hàm trừu tượng
	// BookPredicate 
	
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
		// Tạo 3 đối tượng SGK
		TextBook tb1 = new TextBook("SGK-01", 26, "VN", true);
		TextBook tb2 = new TextBook("SGK-02", 18, "ND", false);
		TextBook tb3 = new TextBook("SGK-03", 44, "ND", true);

		// Tạo 2 đối tượng STK
		ReferenceBook rb1 = new ReferenceBook("STK-04", 60, "ND", 5);
		ReferenceBook rb2 = new ReferenceBook("STK-05", 100, "VN", 4);
		ReferenceBook rb3 = new ReferenceBook("STK-06", 200, "VN", 6);

		Book[] books = { tb1, tb2, tb3, rb1, rb2, rb3 };
		return books;
	}
}
