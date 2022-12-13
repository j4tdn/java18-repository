package kf.bai4;

public class Bai4Demo {
	public static void main(String[] args) {
		TextBook tx1 = new TextBook("SGK01", 50000, "NhiDong", "Moi");
		TextBook tx2 = new TextBook("SGK02", 40000, "KimDong", "Cu");
		TextBook tx3 = new TextBook("SGK03", 150000, "KimDong", "Cu");
		ReferBook rf1 = new ReferBook("STK01", 30000, "NXBHaNoi", 15);
		ReferBook rf2 = new ReferBook("STK01", 47500, "NXBHaNoi", 25);
		Book[] listBook = { tx1, tx2, tx3, rf1, rf2 };
		System.out.println("Sach thuoc nha xuat ban Nhi Dong :");
		for (Book book : SearchPublisher(listBook, "NhiDong")) {
			System.out.println(book.toString());
		}
		System.out.println("Sach co don gia < 50  :");
		for (Book book : SearchSalePrice(listBook, 50000)) {
			System.out.println(book.toString());
		}
		System.out.println("Sach giao khoa co don gia lon hon 100 va be hon 200 :");
		for (Book book : SearchTextBook(listBook)) {
			System.out.println(book.toString());
		}
		System.out.println("Tong tien :" + GetTotal(tx1, rf1));
	}

	public static Book[] SearchPublisher(Book[] listBook, String publisher) {
		int count = 0;
		for (Book book : listBook) {
			if (book.getPublisher() == publisher) {
				count++;

			}
		}
		Book[] list = new Book[count];
		for (int i = 0; i < count; i++) {
			for (Book book : listBook) {
				if (book.getPublisher() == publisher) {
					list[i] = book;
					break;
				}
			}
		}
		return list;
	}

	public static Book[] SearchSalePrice(Book[] listBook, double salePrice) {

		int count = 0;
		for (Book book : listBook) {
			if (book.getSalePrice() < salePrice) {
				count++;
				System.out.println(count);
			}
		}
		Book[] list = new Book[count];
		String tempId = "";
		for (int i = 0; i < count; i++) {
			for (int j = 0; i < listBook.length; j++) {
				if (listBook[j].getSalePrice() < salePrice && listBook[j].getId()!=tempId) {
					list[i]= listBook[j];
					tempId= listBook[j].getId();
					System.out.println(tempId);
					break;
				}
				
			}
		}
		return list;
	}

	public static Book[] SearchTextBook(Book[] listBook) {
		int count = 0;
		for (Book book : listBook) {
			if (book.getId().contains("SGK")) {
				if (book.getSalePrice() >= 100000 && book.getSalePrice() <= 200000) {
					count++;

				}

			}
		}
		Book[] list = new Book[count];
		for (int i = 0; i < count; i++) {
			for (Book book : listBook) {
				if (book.getId().contains("SGK")) {
					if (book.getSalePrice() >= 100000 && book.getSalePrice() <= 200000) {
						list[i] = book;
						break;
					}
				}
			}
		}
		return list;
	}

	public static double GetTotal(TextBook tx, ReferBook rf) {

		return tx.GetTotal() + rf.GetTotal();
	}

}
