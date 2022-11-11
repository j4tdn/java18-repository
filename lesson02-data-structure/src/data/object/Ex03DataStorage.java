package data.object;

import bean.Item;

public class Ex03DataStorage {
	public static void main(String[] args) {
		Item i1 = new Item(1, "OK", 11); // HA
		Item i2 = new Item(2, "OK1", 22); // HB

		// toán tử gán = ( gán ) => gán ở STACK
		i1 = i2; // i1(HB) i2(HB)
		i2 = i1; // i1(HB) i2(HB)
		System.out.println(i1);

		modify(i1); // HB
		System.out.println(i1);
	}

	// Item item(HB) = item(HB)
	// Item item(HC) = item(HB)
	private static void modify(Item item) {
		item.id = 99;
		item = new Item(7, "OKOK", 12); // HC
		item.id = 88;
	}
}
