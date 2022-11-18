package demo;

import bean.Item;

public class Ex02ItemApp {
	public static void main(String[] args) {
		Item item1 = new Item();
		item1.setId(1);
		item1.setName("Quan jean");
		item1.setSalePrice(269.5);
		item1.setOrigin("Viet Nam");
		Item item2 = new Item(2,"Ao len",150.5,"China");
		System.out.println("Tong tien 2 san pham:"+(item1.getSalePrice()+item2.getSalePrice()));
	}
}
