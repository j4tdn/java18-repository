package exercise05;

import exercise05.bean.Book;
import exercise05.bean.Customer;
import exercise05.bean.ReferenceBook;
import exercise05.bean.TextBook;

public class Demo {

	public static void main(String[] args) {
		Book book1 = new TextBook("1", 30, "Nhi Đồng", true);
		Book book2 = new TextBook("2", 150, "Nhi Đồng", false);
		Book book3 = new TextBook("3", 140, "NXB Trẻ", true);

		Book book4 = new ReferenceBook("3", 10, "Nhi Đồng", 12);
		Book book5 = new ReferenceBook("4", 230, "NXB Trẻ", 5);
		
		
		Customer c1 = new Customer(1, "Tai", "09090909090", "Quang Nam",{new TextBook("2", 150, "Nhi Đồng", false)},{new ReferenceBook("3", 230, "NXB Trẻ", 5)});

		Book[] books = { book1, book2, book3, book4, book5 };
		Book[] booksOfPublisher = findBookOfPublisher(books, "Nhi Đồng");
		Book[] booksSalePriceLt = findSaleOfBookLt(books);
		Book[] textBooksSalePriceBetween = findSaleOftextBookBetween(books);

		for (Book book : textBooksSalePriceBetween) {
			System.out.println(book);
		}

	}

	public static Book[] findBookOfPublisher(Book[] books, String publisher) {
		Book[] temp = new Book[books.length];
		int index = 0;
		for (Book book : books) {
			if (book.getPublisher() == publisher) {
				temp[index] = book;
				index++;
			}
		}

		Book[] result = new Book[index];
		for (int i = 0; i < result.length; i++) {
			result[i] = temp[i];
		}
		return result;
	}

	public static Book[] findSaleOfBookLt(Book[] books) {
		Book[] temp = new Book[books.length];
		int index = 0;
		for (Book book : books) {
			if (book.getSalesPrice() < 50) {
				temp[index] = book;
				index++;
			}
		}

		Book[] result = new Book[index];
		for (int i = 0; i < result.length; i++) {
			result[i] = temp[i];
		}
		return result;
	}

	public static Book[] findSaleOftextBookBetween(Book[] books) {
		Book[] temp = new Book[books.length];
		int index = 0;
		for (Book book : books) {

			if (book.getId().contains("SGK")) {
				if (book.getSalesPrice() > 100 && book.getSalesPrice() < 200) {
					temp[index] = book;
					index++;
				}
			}
		}

		Book[] result = new Book[index];
		for (int i = 0; i < result.length; i++) {
			result[i] = temp[i];
		}
		return result;
	}

}
