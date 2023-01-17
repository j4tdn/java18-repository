package exam;

import bean.Book;
import bean.BookDetailOrder;
import bean.Customer;
import bean.Order;
import bean.ReferenceBook;
import bean.TextBook;

public class Ex04BookShop {
	public static void main(String[] args) {
		Customer cs1 = new Customer("cs1","Ngô Đức Huy","0899244434","Đà Nẵng");
		Book[] books = setInformation();
		findPublishingCompany(books);
		findPriceSmallerThan50(books);
		findPriceBetween(books);
//		Giả lập khách hàng mua sách SGK2 và SGK4
		Order od1 = new Order(cs1, new BookDetailOrder[] {
				new BookDetailOrder(books[1], 1),
				new BookDetailOrder(books[3], 1)
		});
		bill(od1);
		
	}
	public static Book[] setInformation() {
		Book TB1 = new TextBook("SGK1",40000d,"Kim Đồng",false);
		Book TB2 = new TextBook("SGK2",50000d,"Nhi Đồng",true);
		Book TB3 = new TextBook("SGK3",120000d,"Kim Đồng",false);
		Book RB1 = new ReferenceBook("STK1",70000d,"Nhi Đồng",5);
		Book RB2 = new ReferenceBook("STK2",30000d,"Đức Huy",3);
		Book[] books = {TB1,TB2,TB3,RB1,RB2}; 
		return books;
	}
	public static void findPublishingCompany(Book[] books) {
		System.out.println("=============================");
		System.out.println("Sách của nhà xuất bản Nhi Đồng: ");
		for(Book book:books) {
			if(book.getPublishingCompany()=="Nhi Đồng") {
				System.out.println(book);
			}
		}
	}
	public static void findPriceSmallerThan50(Book[] books) {
		System.out.println("=============================");
		System.out.println("Sách có giá nhỏ hơn 50: ");
		for(Book book:books) {
			if(book.getPrice()<50000) {
				System.out.println(book);
			}
		}
	}
	public static void findPriceBetween(Book[] books) {
		System.out.println("=============================");
		System.out.println("Sách có giá từ 100 đến 200: ");
		for(Book book:books) {
			if(book.getPrice()<200000 && book.getPrice()>100000) {
				System.out.println(book);
			}
		}
	}
	public static void bill(Order od) {
		double sum = 0;
		String customer = od.getCs().getFullName();
		for(BookDetailOrder bookOrder:od.getBooks()) {
			
			Book book = bookOrder.getBooks();
			int quantity = bookOrder.getQuantity();
			
			if(book instanceof TextBook) {
				if(((TextBook)book).isNew()==true) {
					sum = sum + book.getPrice()*quantity;
				}else {
					sum = sum + (book.getPrice()*70/100)*quantity;
				}
			}else if (book instanceof ReferenceBook) {
				sum = sum + book.getPrice()*(1+((ReferenceBook)book).getTax()/100);
			}
		}
		System.out.println("==================================================");
		System.out.println("Khách hàng "+customer+" đã mua: ");
		for(BookDetailOrder bookOrder:od.getBooks()) {
			System.out.println(bookOrder.getBooks().getId()+": số lượng: "+bookOrder.getQuantity()+", Đơn giá: "+bookOrder.getBooks().getPrice());
		}
		System.out.println("Tổng tiền: "+sum+" vnd");
	}
}	

