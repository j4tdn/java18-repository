package data.object;
import bean.Item;
public class Ex03DataStorage {
	public static void main(String[] args) {
		Item i1 = new Item(1, "item 1", 11d);
		modify(i1);
		System.out.println(i1);
	}
	private static void modify(Item item) {
		item.id = 99;
		item = new Item(77,"Item 77", 77d);
		item.id = 88;
	}
}
