package homework;

import java.util.Arrays;
import java.util.Comparator;

public class DemoHomeWork3 {
	public static void main(String[] args) {
		Item [] items = getItem();
		Arrays.sort(items,new Comparator<Item>() {
			
			@Override
			public int compare(Item o1, Item o2) {
				return o1.getSalesPrice()-o2.getSalesPrice();
			}
		});
		System.out.println(items[1]);
	}
	public static Item[] getItem () {
		return new Item[]{
			new Item(1, "A", 25, 101),
			new Item(2, "B", 90, 102),
			new Item(3, "C", 88, 102),
			new Item(4, "D", 40, 101),
			new Item(5, "E", 60, 102),
			new Item(6, "F", 18, 101),
		};
	}
}
