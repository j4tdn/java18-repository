package demo;

import bean.Item;

public class Ex03FinalDemo {
	public static void main(String[] args) {
		final int digit = 20;// Không thể thay đổi giá trị ở stack nhưung heap vẫn thay đổi đc
//		digit = 30;   Không chạy được vì thay đổi ở stack ;

		final Item i1 = new Item(digit, "vi ăn cứt", 234);
		final Item i2 = new Item(90, "Item 32", 567);
//		i1 = i2;  //Thay đổi ở stack
		i1.itemName = "Item 43";// Thay đổi ở heap
		System.out.println(i1);
	}
}
