package exercise04_book;


public class BookDemo {
	public static void main(String[] args) {
		Book text1 = new TextBook("1", 700000, "Nhi Dong", false);
		Book text2 = new TextBook("2", 150000, "Nhi Dong", true);
		Book text3 = new TextBook("3", 500000, "Thieu Nien", false);
		
		Book reference1 = new ReferenceBook("1", 355000, "Nhi Dong", 0.5f);
		Book reference2 = new ReferenceBook("2", 655000, "Thieu Nien", 0.5f);
		
		Book[] books = {text1, text2, text3, reference1, reference2};
		
		findBookOfPublisher(books);
		total();
	}
	
	public static void findBookOfPublisher(Book[] books) {
		for ( Book b : books) {
			if (b.getPublisher() == "Nhi Dong") {
				System.out.println(b.toString());
			}
		}
	}
	
	public static void findBookOfsalesPrice(Book[] books) {
		for ( Book b : books) {
			if (b.getSalesPrice() < 500000) {
				System.out.println(b.toString());
			}
		}
	}
	
	public static void findBookOfsalesPriceFrom50to100(Book[] books) {
		for ( Book b : books) {
			if (b.getSalesPrice() > 100000 && b.getSalesPrice() < 200000) {
				System.out.println(b.toString());
			}
		}
	}
	
	public static void total() {
		TextBook text3 = new TextBook("3", 500000, "Thieu Nien", false);	
		ReferenceBook reference1 = new ReferenceBook("1", 355000, "Nhi Dong", 0.5f);
		float resuft = 0;
		if (text3.isStatus() == false) {
			resuft += text3.getSalesPrice() - text3.getSalesPrice()/30*100;
		}
		else {
			resuft += text3.getSalesPrice();
		}
		
		resuft += reference1.getSalesPrice()*(1 + reference1.getTax());
	}

}
