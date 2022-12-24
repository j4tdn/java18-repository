package view;

import java.util.Arrays;

import bean.Book;
import bean.ReferenceBook;
import bean.TextBook;

// Thông thường
// Tham số của hàm ==> biến (KNT, KĐT)


// Mục đích : Viết 1 hàm có thể truyền tham số là 1 chiến lược / 1 hàm
// --> Biến hàm có thể là 1 hàm khác

// Và sau đó ai gọi hàm nãy thì sẽ truyền chức năng / hàm chi tiết cụ thể vào
// Developer --> tìm ra stategy đóx`

public class Ex04BookDemo {
	public static void main(String[] args) {
		Book[] books = createData();
		Book[] nhiDongBooks = find(books, "Nhi Dong");
		Book[] salesPrice = find(books, 50);
		for(Book book: salesPrice) {
			System.out.println(book);
		}
	}
	
	private static Book[] createData() {
		TextBook tb1 = new TextBook("SGK01", 26, "Kim Dong", true);
		TextBook tb2 = new TextBook("SGK02", 70, "Hoa Nang", false);
		TextBook tb3 = new TextBook("SGK03", 45, "Tuoi Tre", false);
		
		ReferenceBook rb1 = new ReferenceBook("STK01", 60, "Thanh Nien", 5);
		ReferenceBook rb2 = new ReferenceBook("STK02", 65, "Kim Dong", 4);
		ReferenceBook rb3 = new ReferenceBook("STK03", 88, "Nhi Dong", 6);
		
		Book[] books = {tb1, tb2, tb3, rb1, rb2, rb3};
		return books;
	}
	
	private static Book[] find(Book[] books, String publiser) {
		Book[] result = new Book[books.length];
		int running = 0;
		for(Book book: books) {
			if(book.getPublisher().equals(publiser)) {
				result[running++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}
	
	private static Book[] find(Book[] books, double salesPriceLessThan) {
		Book[] result = new Book[books.length];
		int running = 0;
		for(Book book: books) {
			if(book.getSalesPrice() < salesPriceLessThan) {
				result[running++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}
	
	private static Book[] find(Book[] books, double salesPriceMin, double salesPriceMax) {
		Book[] result = new Book[books.length];
		int running = 0;
		for(Book book: books) {
			if(book.getSalesPrice() < salesPriceMax && book.getSalesPrice() > salesPriceMin) {
				result[running++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}
}
