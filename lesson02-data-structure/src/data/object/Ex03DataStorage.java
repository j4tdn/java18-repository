package data.object;

import bean.Item;

public class Ex03DataStorage {
	public static void main(String[] args) {
		Item i1 = new Item(1, "Item 1", 11);
		Item i2 = new Item(2, "Item 2", 12);
				
		modify(i1);
		System.out.println(i1);
		edit(i1);
		System.out.println(i1);
	}
	
	public static void edit(Item item) {
		Item ic = item;
		item = new Item(88, "Item 88", 1);
		item = ic;
		item.id = 22;
	}
	
	public static void modify(Item item) { // truyền tham số i1 => item = i1 (lưu giá trị của i1 (trỏ đến chung vùng nhớ heap của i1))
		item.id = 99;
		item = new Item(77, "Item 77", 77d);	// Cấp phát vùng nhớ mới cho item, không liên quan đến i1
		item.id = 88;
	}
}
