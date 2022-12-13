package exam;

import bean.Book;
import bean.Referencebooks;
import bean.Textbook;

public class Exercise3 {
	public static void main(String[] args) {
		
		Book t1 = new Textbook("SGK", 100, "Kim Đồng", false);
		Book t2 = new Textbook("SGK", 25, "Nhi Đồng", true);
		Book t3 = new Textbook("SGK", 50, "HCM", true);
		
		Book r1 = new Referencebooks("STK", 12, "HCM", 5);
		Book r2 = new Referencebooks("STK", 40, "Nhi Đồng", 10);
		Book r3 = new Referencebooks("STK", 100, "Thanh niên", 12);
		
		Book [] books = {t1, t2, t3, r1, r2, r3};
		
		System.out.println("Publisher Nhi Đồng");
		publisher(books);
		System.out.println("\n");
		
		System.out.println("Sale price < 50");
		salePrice(books);
		System.out.println("\n");
		
		System.out.println("SGK từ 100 --> 200");
		cost(books);
		
		System.out.println("\n");
		
		System.out.println("SGK được giảm");
		sales(books);
		System.out.println("\n");
		
		System.out.println("Thành tiền STK");
		moneyP(books);
		
	}
	private static void publisher (Book [] books) {
		for (Book book:books) {
			if (book instanceof Textbook || book instanceof Referencebooks) {
				String publish = book.getPublishC();
				if (publish == "Nhi Đồng") {
					System.out.println(book);
				}
			} 
		}
	}
	private static void salePrice (Book [] books) {
		for (Book book: books) {
			if (book instanceof Textbook || book instanceof Referencebooks) {
				double salePrice = book.getPrice();
				if (salePrice < 50) {
					System.out.println(book);
				}
			}
		}
	}
	
	private static void cost (Book [] books) {
		for (Book book: books) {
			if (book instanceof Textbook) {
				double salePrice = book.getPrice();
				if (salePrice >= 100 && salePrice < 200 ) {
					System.out.println(book);
				}
			}
		}
	}
	
	private static void sales (Book [] books) {
		for (Book book:books) {
			if (book instanceof Textbook) {
				boolean status = ((Textbook) book).isStatus();
				if (!status) {
					System.out.println(book);
					System.out.println("Số tiền giảm: " + (book.getPrice() * 0.3));
					System.out.println(book.getPrice() - (book.getPrice())*0.3);
				} 
			}
		}
	}
	
	private static void moneyP (Book [] books) {
		for (Book book:books) {
			if (book instanceof Referencebooks) {
				double money = ((((Referencebooks) book).getTax()/100) + 1) * book.getPrice();
				System.out.println(book);
				System.out.println("Thành tiền" + money);
			}
		}
	}
}
