package bean;

public class Test {
	public static void main(String[] args) {
		Item item = new Item(123, "Item 123", 566);
		
		item.set(Item.NAME, "ABCDYXZ 23456789");
		
		System.out.println("id --> " + item.getId());
		System.out.println("id --> " + item.get(Item.ID));
		
		System.out.println("name -->" + item.get(Item.NAME)) ;
	}
}
