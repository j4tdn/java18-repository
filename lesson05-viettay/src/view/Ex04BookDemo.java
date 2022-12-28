package view;

/**
 *   Viết hàm tạo dữ liệu sách cho cửa hàng.
	- Tạo 3 đối tượng Sách Giáo Khoa
	- Tạo 2 đối tượng Sách Tham Khảo
	- Lưu danh sách các đối tượng vào mảng một chiều duy nhất
	
	 Viết hàm thực hiện lần lượt các chức năng sau đây:
	 Tìm toàn bộ sách thuộc nhà xuất bản Nhi Đồng
	 Tìm toàn bộ sách có đơn giá nhỏ hơn 50
	 Tìm toàn bộ sách giáo khoa có đơn giá từ 100 đến 200
	 Thực hiện giải lập. Khách hàng mua 1 cuốn sách giáo khoa, 1 cuốn sách
	tham khảo. Viết hàm tính tổng tiền mà khách hàng phải thanh toán. Biết
	rằng:
	- Sách giáo khoa - TextBook: Giảm 30% với sách cũ
	- Sách tham khảo - ReferBook: Thành tiền = đơn giá * (1 + %thuế) 
 */

import java.util.Arrays;

import bean.Book;
import bean.ReferenceBook;
import bean.TextBook;

public class Ex04BookDemo {
	public static void main(String[] args) {
		Book[] books = createData();

		Book[] bookByPublisher = find(books, "ND");
		System.out.println(Arrays.toString(bookByPublisher));

		Book[] bookBySalesPriceLt = find(books, 50);
		System.out.println(Arrays.toString(bookBySalesPriceLt));

		Book[] bookBySalesPriceFt = find(books, 40, 70);
		System.out.println(Arrays.toString(bookBySalesPriceFt));

	}

	private static Book[] find(Book[] books, double salesPriceMin, double salesPriceMax) {
		Book[] result = new Book[books.length];
		int running = 0;
		for (Book book : books) {
			double salesPrice = book.getSalesPrice();
			if (salesPrice > salesPriceMin && salesPrice < salesPriceMax) {
				result[running++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}

	private static Book[] find(Book[] books, double salesPrice) {
		Book[] result = new Book[books.length];
		int running = 0;
		for (Book book : books) {
			if (book.getSalesPrice() < salesPrice) {
				result[running++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}

	private static Book[] find(Book[] books, String publisher) {
		Book[] result = new Book[books.length];
		int running = 0;
		// == --> stack
		// String --> == --> compare value at stack(address)
		// --> equals --> compare value at heap(string's value)
		for (Book book : books) {
			if (publisher.equals(book.getPublisher())) {
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
