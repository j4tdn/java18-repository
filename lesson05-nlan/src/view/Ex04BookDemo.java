package view;

import java.util.Arrays;

import bean.Book;
import bean.ReferenceBook;
import bean.TextBook;

public class Ex04BookDemo {
	public static void main(String[] args) {
		Book[] books = createData();

		// Tìm toàn bộ sách thuộc nhà xuất bản Nhi Đồng
		Book[] booksByPublisher = find(books, "ND");
		System.out.println("--> " + Arrays.toString(booksByPublisher));

		System.out.println("\n--------------\n");
		// Tìm toàn bộ sách có đơn giá nhỏ hơn 50
		Book[] booksBySalespriceLt = find(books, 50);
		System.out.println("booksBySalesPriceLt --> " + Arrays.toString(booksBySalespriceLt));
		// Tìm toàn bộ sách giáo khoa có đơn giá từ 100 đến 200
		Book[] booksBySalespriceFt = find(books, 40, 70);
		System.out.println("booksBySalesPriceFt40-70 --> " + Arrays.toString(booksBySalespriceFt));
	}
	// books --> length = 6
	// array --> fixed-length
	// result --> [null,null,null,null,null,null];

	private static Book[] find(Book[] books, String publisher) {
		Book[] result = new Book[books.length];
		int running = 0;
		for (Book book : books) {
			if (book.getPublisher().equals(publisher)) {
				result[running++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}

	private static Book[] find(Book[] books, double salesPriceLessThan) {
		Book[] result = new Book[books.length];
		int running = 0;
		for (Book book : books) {
			if (book.getSalesPrice() < salesPriceLessThan) {
				result[running++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, running);
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
		
		// Tìm toàn bộ sách có đơn giá lớn hơn 50
		
		// Tìm toàn bộ sách là sách tham khảo - mới thuộc NXB "ND"
		
		// Vấn đề: Cùng là 1 bộ dữ liệu, nhưng với các yêu cầu khác nhau
		// mình phỉa tạo các hàm khác nhau để sử dụng
		
		// HÀm ít có khả năng tái sử dụng với các điều kiện khác nhau
		
		// Mục đích --> Hàm/ chức năng tạo ra có thể tái sử dụng cho 
		// hầu hết mọi yêu cầu/ điều kiện
	}
}
