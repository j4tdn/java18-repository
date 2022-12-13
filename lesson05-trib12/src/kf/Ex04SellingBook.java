package kf;

import infor.Book;
import infor.ReferenceBook;
import infor.SchoolBook;

public class Ex04SellingBook {
	public static void main(String[] args) {
		ReferenceBook r1 = new ReferenceBook("STK345", 70000d, "Nhi dong", 0.01f);
		ReferenceBook r2 = new ReferenceBook("STK456", 40000d, "kim dong", 0.01f);
		SchoolBook s1 = new SchoolBook("SGK123", 100000d , "Nhi dong", "new");
		SchoolBook s2 = new SchoolBook("SGK456", 120000d , "kim dong", "old");
		SchoolBook s3 = new SchoolBook("SGK789", 40000d , "Nhi dong", "new");
		
		
		Book[] books = {r1, r2, s1, s2, s3};
		System.out.println("cac loai sach cua mha xuat ban kim dong");
		isPublisher(books);
		System.out.println("cac loai sach có gia hon 50k");
		isGreater50(books);
		
		
	}
	private static void isPublisher(Book books[]) {
		for (Book book: books) {
			if(book.getPublisher()=="Nhi dong") {
				System.out.println(book);
			}
		}
	}
	private static void isGreater50(Book books[]) {
		for(Book book: books) {
			if(book.getSalesPrice()>50000d) {
				System.out.println(book);
			}
		}
	}
	
	
	


}
