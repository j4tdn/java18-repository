package polymorphism.method.override;

import been.Item;

public class MethodOverrideDemo {
	public static void main(String[] args) {
		Item itemA = new Item(1, "Item A", 12);
		
		//default --> toString
		System.out.println("Item A --> " + itemA);
	}
}
