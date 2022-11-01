package data.object;

import bean.Item;

public class Ex03DataStogare {
	public static void main(String[] args) {
		Item i1 = new Item(1, "Item 1", 11); //HA
		Item i2 = new Item(2, "Item 2", 12); //HB
		System.out.println("i1 -> " + i1);
		System.out.println("i2 -> " + i2);
		
		// Toán tử = (gán) ==> gán ở STACK
		i1 = i2; // i1(HB) i2(HB)
		i2 = i1; // i1(HB) i2(HB)
		System.out.println("i1 id: " + i1.id);// 2
		
		modify(i1);
		System.out.println("i1 id: ");
	}
	// HB: 99, Item 2, 12
	// HC: 88, Item 77, 77d
	private static void modify(Item item) {
		item.id = 99;
		item = new Item(77, "Item 77", 77d); //HC
		item.id = 88;
	}
}
