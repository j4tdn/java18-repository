package Index;

import HomeWork.Item;

public class Ex02ItemApp {
	public static void main(String[] args) {
		/*
		 * int id = 5; String A01 = new String("Bút bi"); double salePrice = 0; double
		 * tongGiaTri; String origin;
		 * 
		 * Item item1 = new Item(); item1.setId(005); item1.setName("pen");
		 * item1.setSalesPrice(3d); item1.setOrigin("Pháp");
		 * System.out.println("item 1 --->" + item1);
		 * 
		 * Item item2 = new Item(); item2.setId(003); item2.setName("pencil");
		 * item2.setSalesPrice(2.5d); item2.setOrigin("Mỹ Tho");
		 * System.out.println("item 2 --->" + item2); tongGiaTri = (item1.salesPrice +
		 * item2.salesPrice); System.out.println("tổng giá gị mặt hàng là: " +
		 * tongGiaTri); }
		 */
		Item item1 = new Item(002, "Pen", "Mỹ Tho", 2500);
		Item item2 = new Item(003, "Pencil", "Pháp", 3500);
		double t1 = totalOfsalesPrice(item1, item2);
		System.out.println("TT của item 1 và item 2: " + t1);

		Item item3 = new Item(002, "Pen", "Mỹ Tho", 2000);
		Item item4 = new Item(003, "Pencil", "Pháp", 7000);
		totalOfsalesPrice(item3, item4);
		double t2 = totalOfsalesPrice(item3, item4);
		System.out.println("TT của item 3 và item 4: " + t2);
	}

	private static double totalOfsalesPrice(Item item1, Item item2) {
		return item1.getSalesPrice() + item2.getSalesPrice();

	}
}
