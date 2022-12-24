package view;

import java.util.Arrays;

import bean.Book;
import bean.ReferenceBook;
import bean.TextBook;
import functional.BookPredicate;

public class Ex04BookDemoStategyDesignPattern {
	public static void main(String[] args) {
		Book[] books = createData();
		BookPredicate pb1 = new BookPredicate() {
			@Override
			public boolean test(Book book) {
				return "Kim Dong".equals(book.getPublisher());
			}
		};
		
		BookPredicate pb2 = book -> book.getSalesPrice() > 50;
		
		
		Book[] publishers = find(books, pb1);
		for(Book book : publishers) {
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
	
	private static Book[] find(Book[] books, BookPredicate bp) {
		Book[] result = new Book[books.length];
		int running = 0;
		for(Book book: books) {
			if(bp.test(book)) {
				result[running++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}
}
