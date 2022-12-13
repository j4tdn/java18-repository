package ex04bookmanagement;

import java.util.Arrays;

public class BookManagement {
	public static void main(String[] args) {
		Book[] books = createBook();

		Book[] a = findBookByPublisher(books);
		System.out.println("Những sách có nhà xuất bản là kim đồng: ");
		for (Book book : a) {
			System.out.println(book);
		}
		System.out.println("\n=============\n");

		Book[] b = findBookByPrice(books);
		System.out.println("Những sách có đơn giá nhỏ hơn 50: ");
		for (Book book : b) {
			System.out.println(book);
		}
		
		System.out.println("\n=============\n");

		Book[] c = findBookByPrice2(books);
		System.out.println("Những sách có đơn giá từ 100 đến 200: ");
		for (Book book : c) {
			System.out.println(book);
		}
		
		System.out.println("\n==============\n");
		
		Customer c1 = new Customer(1, 66667, "NVA", "5 Nguyen Luong Bang");
		Order o1 = new Order(c1, new ItemDetail[] {
			new ItemDetail(books[1], 1)	,
			new ItemDetail(books[3], 1)			
		});
		
		System.out.println("tổng tiền: " + o1.export());
		
	}

	public static Book[] createBook() {
		ClassicalBook c1 = new ClassicalBook("SGK01", 25, "Nhi Đồng", true);
		ClassicalBook c2 = new ClassicalBook("SGK02", 75, "Kim Đồng", true);
		ClassicalBook c3 = new ClassicalBook("SGK01", 150, "Ha Noi", false);

		ReferenceBook r1 = new ReferenceBook("STK01", 125, "Nhi Đồng", 0.5);
		ReferenceBook r2 = new ReferenceBook("STK02", 40, "Huế", 0.3);

		Book[] books = { c1, c2, c3, r1, r2 };
		return books;
	}

	public static Book[] findBookByPublisher(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;

		for (int i = 0; i < books.length; i++) {
			if (books[i].getPublisher().equals("Nhi Đồng")) {
				result[count] = books[i];
				count++;
			}
		}

		return Arrays.copyOfRange(result, 0, count);
	}

	public static Book[] findBookByPrice(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;

		for (int i = 0; i < books.length; i++) {
			if (books[i].getPrice() < 50) {
				result[count] = books[i];
				count++;
			}
		}

		return Arrays.copyOfRange(result, 0, count);
	}

	public static Book[] findBookByPrice2(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;

		for (int i = 0; i < books.length; i++) {
			if (books[i].getPrice() > 100 && books[i].getPrice() < 200) {
				result[count] = books[i];
				count++;
			}
		}

		return Arrays.copyOfRange(result, 0, count);
	}
	


}
