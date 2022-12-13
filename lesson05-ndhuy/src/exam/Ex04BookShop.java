package exam;

import bean.Book;
import bean.Customer;
import bean.Order;
import bean.ReferenceBook;
import bean.TextBook;

public class Ex04BookShop {
	public static void main(String[] args) {
		Customer cs1 = new Customer("cs1","Ngô Đức Huy","0899244434","Đà Nẵng");
		findPublishingCompany(setInformation());
		findPriceSmallerThan50(setInformation());
		findPriceBetween(setInformation());
		
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
				System.out.println(book.getId());
			}
		}
	}
	public static void findPriceSmallerThan50(Book[] books) {
		System.out.println("=============================");
		System.out.println("Sách có giá nhỏ hơn 50: ");
		for(Book book:books) {
			if(book.getPrice()<50000) {
				System.out.println(book.getId());
			}
		}
	}
	public static void findPriceBetween(Book[] books) {
		System.out.println("=============================");
		System.out.println("Sách có giá từ 100 đến 200: ");
		for(Book book:books) {
			if(book.getPrice()<200000 && book.getPrice()>100000) {
				System.out.println(book.getId());
			}
		}
	}
	public static void bill(Order od) {
		
	}
}	

