package ex04_saleBooks;

public class BookDemo {
	public static void main(String[] args) {
		TextBook a = new TextBook("SGKA", 110d, "Tung", true);
		TextBook b = new TextBook("SGKB", 22d, "Nhi Đồng", false);
		TextBook c = new TextBook("SGKC", 330d, "Phương", true);

		ReferBook d = new ReferBook("STKA", 100d, "Vy", false, 111);
		ReferBook e = new ReferBook("STKB", 200d, "Nhi Đồng", true, 222);
		ReferBook f = new ReferBook("STKC", 300d, "Nhi Đồng", false, 333);

		TextBook[] books = { a, b, c, d, f };

		for (TextBook book : books) {
			if (book instanceof TextBook) {
				double salesPrice = ((TextBook) book).getSalesPrice();
				if (salesPrice < 50d) {
					System.out.println(book);
				}
				
				
			}
		}

	}

}
