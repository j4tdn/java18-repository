package view.kf;

import java.util.Arrays;

import bean.Book;
import bean.ReferenceBook;
import bean.TextBook;
import functional.BookPredicate;

/**
 * Thông thường
 * tham số của hàm --> biến (KNT, KĐT)
 * 
 * Stategey --> chiến lược/chức năng (hàm) trừu tượng
 * Design Pattern --> mẫu thiết kế
 * Mục đích: Viết 1 hàm có thể truyền tham số là một chiến lược/hàm (chức năng) trừu tượng
 * --> Biến hàm có tham số là 1 hàm khác
 * Và sau đó ai gọi hàm này thì sẽ truyền chức năng/hàm chi tiết cụ thể vào
 * Developer --> tìm ra strategy signature đó
 */

public class Ex04BookDemoStagegyDesignPattern {
	public static void main(String[] args) {
		Book[] books = createData();

		// Find all books of "ND" publisher
		Book[] booksByPublisher = find(books, book -> "ND".equals(book.getPublisher()));
		System.out.println("---> " + Arrays.toString(booksByPublisher));
		System.out.println("\n----------------------\n");

		// Find all books with price less than 50
		Book[] booksBySalesPriceLt = find(books, book -> book.getSalesPrice() < 50);
		System.out.println("---> " + Arrays.toString(booksBySalesPriceLt));
		System.out.println("\n----------------------\n");

		// Find all textbooks which have price from 100 to 200
		Book[] booksBySalesPriceFt = find(books, book -> book.getSalesPrice() >= 100 && book.getSalesPrice() <= 200);

		System.out.println("---> " + Arrays.toString(booksBySalesPriceFt));

	}

	// tham số --> hàm/chức năng trừu tượng
	// hàm trừu tượng --> input, output
	// input --> book
	// output --> boolean
	// stategy: boolean method_name(Book book)
	// Tạo abstract class hoặc interface chứa hàm trừu tượng
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
		// Tạo 3 đối tượng SGK
		TextBook tb1 = new TextBook("SGK-01", 26, "VN", true);
		TextBook tb2 = new TextBook("SGK-02", 18, "ND", false);
		TextBook tb3 = new TextBook("SGK-03", 44, "ND", true);

		// Tạo 3 đối tượng STK
		ReferenceBook rb1 = new ReferenceBook("STK-04", 60, "ND", 5);
		ReferenceBook rb2 = new ReferenceBook("STK-05", 88, "VN", 5);
		ReferenceBook rb3 = new ReferenceBook("STK-06", 88, "VN", 5);

		Book[] books = { tb1, tb2, tb3, rb1, rb2, rb3 };
		return books;
	}

}
