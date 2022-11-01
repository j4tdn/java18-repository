package data.object;

import bean.Item;

public class Ex03DataStorage {
	public static void main(String[] args) {
		Item i1 = new Item(1, "Item 1", 11); // HA
		Item i2 = new Item(2, "Item 2", 12); // HB
		
		System.out.println("i1 -> " + i1);
		System.out.println("i2 -> " + i2);
		
		// Toán tử = (gán) ==> gán ở STACK
		i1 = i2; // i1(HB) i2(HB)
		i2 = i1; // i1(HB) i2(HB)
		System.out.println("i1 id: " + i1.id); // 2
		
		update(i1); // HB
		System.out.println("modified i1 --> " + i1);
		// id        :   2    88 
		// name      : Item 2 77
		// salesPrice:  12d   77đ
	}
	// modify(i1, ic(H1))
	// item(H1(22))
	private static void update(Item item) {
		Item ic = item;
		item = new Item(); // H2(33, Item 33)
		item.id = 33;
		item.name = "Item 33";
		item = ic;
		item.id = 22;
	}
	
	// HB: 99, Item 2, 12
	// HC: 88, Item 77, 77d
	// Item item(HC) = i1(HB);
	private static void modify(Item item) {
		item.id = 99;
		item = new Item(77, "Item 77", 77d); // HC
		item.id = 88;
	}
}
