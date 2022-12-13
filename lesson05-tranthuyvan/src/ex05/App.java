package ex05;

import java.util.Arrays;

/**
 * Viết hàm tạo dữ liệu sách cho cửa hàng. (3 SGK + 2 STK)
 * Viết hàm thực hiện lần lượt các chức năng sau đây:
 * Tìm toàn bộ sách thuộc nhà xuất bản Nhi Đồng
 * Tìm toàn bộ sách có đơn giá nhỏ hơn 50
 * Tìm toàn bộ sách giáo khoa có đơn giá từ 100 đến 200
 * Thực hiện giải lập. Khách hàng mua 1 cuốn SGK, 1 cuốn STK. 
 * Viết hàm tính tổng tiền mà khách hàng phải thanh toán. Biết rằng:
 * Sách giáo khoa - TextBook: Giảm 30% với sách cũ
 * Sách tham khảo - ReferBook: Thành tiền = đơn giá * (1 + % thuế)
 */

public class App {
	public static void main(String[] args) {
		Book[] books = getBooks();

		// Find all books of "Nhi Dong" publisher
		Book[] pub = filter(books, book -> "Nhi Dong".equals(book.getPublisher()));

		// Find all books with price less than 50
		Book[] price = filter(books, book -> book.getPrice() < 50);

		// Find all textbooks which have price from 100 to 200
		Book[] anotherPrice = filter(books, book -> book.getPrice() >= 100 && book.getPrice() <= 200);
		
		// Create order
		Customer customer = new Customer("KH01", "Tran Tam Nhi", "01215565494", "Danang");
		Order order = new Order(customer,
				new BookDetail[] { new BookDetail(books[0], 1), new BookDetail(books[4], 1) });
		
		System.out.println("----- All books of \"Nhi Dong\" publisher -----");
		System.out.println(Arrays.toString(pub));
		System.out.println("\n----- All books with price less than 50 -----\n");
		System.out.println(Arrays.toString(price));
		System.out.println("\n----- All textbooks which have price from 100 to 200 -----\n");
		System.out.println(Arrays.toString(anotherPrice));
		System.out.println("\n----- Total of money -----\n");
		System.out.println(getTotal(order));
	}

	// Function - create data
	private static Book[] getBooks() {
		Textbook tb1 = new Textbook("SGK01", 45, "Nhi Dong", Status.OLD);
		Textbook tb2 = new Textbook("SGK02", 145, "Fahasa", Status.NEW);
		Textbook tb3 = new Textbook("SGK03", 200, "Thai Ha", Status.NEW);

		ReferenceBook rb1 = new ReferenceBook("STK04", 300, "Tien Phong", 1.5d);
		ReferenceBook rb2 = new ReferenceBook("STK05", 400, "Nhi Dong", 2d);

		return new Book[] { tb1, tb2, tb3, rb1, rb2 };

	}

	// Function - perform functions with given conditions
	private static Book[] filter(Book[] books, Condition condition) {
		Book[] result = new Book[books.length];
		int index = 0;
		for (Book book : books) {
			if (condition.check(book)) {
				result[index++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, index);
	}
	
	// Function - calculate total of money
	private static double getTotal(Order order) {
		double sumOfMoney = 0;
		BookDetail[] bookDetails = order.getBookDetails();
		for (BookDetail bookDetail : bookDetails) {
			Book book = bookDetail.getBook();
			sumOfMoney += book.getSalesPrice();
		}
		return sumOfMoney;

	}

}
